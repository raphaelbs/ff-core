package br.com.ecvtec.corelibrary.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.validation.Valid;

public class GenericDAO<T> {

	/**
	 * Interface responsavel por servir a {@link EntityManager} à quem precisa.
	 * 
	 * @author Raphael Brandão
	 */
	interface Transaction<K> {
		K useEsseEntityManager(EntityManager entityManager) throws Exception;
	}

	/**
	 * Interface para expor a Query que é criada pelos métodos:
	 * <ul>
	 * <li>{@link GenericDAO#buscarListaDeHQL(String, Complemente)}</li>
	 * <li>{@link GenericDAO#buscarListaDeNativeQuery(String, Complemente)}</li>
	 * <li>{@link GenericDAO#buscarObjetoDeHQL(String, Complemente)}</li>
	 * <li>{@link GenericDAO#buscarObjetoDeNativeQuery(String, Complemente)}</li>
	 * </ul>
	 * 
	 * @author Raphael Brandão
	 */
	public interface Complemente {
		void estaQuery(Query query);
	}

	public enum PERSISTENCE_UNIT {
		BD_0, BD_APLICACAO;
	}

	private volatile static EntityManagerFactory entityManagerFactory;
	private volatile static EntityManagerFactory entityManagerFactoryBd0;
	private Class<T> persistedClass;
	private final PERSISTENCE_UNIT persistenceUnit;

	public GenericDAO(PERSISTENCE_UNIT persistenceUnit) {
		this.persistenceUnit = persistenceUnit;
		abrirEntityManagerFactory(persistenceUnit);
	}

	public GenericDAO(PERSISTENCE_UNIT persistenceUnit, Class<T> persistedClass) {
		this(persistenceUnit);
		this.persistedClass = persistedClass;
	}

	/**
	 * Cuida de abrir a {@link EntityManagerFactory} quando for necessário.
	 */
	private static synchronized void abrirEntityManagerFactory(PERSISTENCE_UNIT persistenceUnit) {
		String persistenceUnitString;
		switch (persistenceUnit) {
		case BD_0:
			persistenceUnitString = "bd_0";
			if (entityManagerFactoryBd0 == null) {
				entityManagerFactoryBd0 = Persistence.createEntityManagerFactory(persistenceUnitString);
				System.out.println("EntityManagerFactoryBd0 criada em " + new Date().toString());
			} else if (!entityManagerFactoryBd0.isOpen()) {
				entityManagerFactoryBd0 = null;
				abrirEntityManagerFactory(persistenceUnit);
			}
			break;
		default:
			persistenceUnitString = "bd_aplicacao";
			if (entityManagerFactory == null) {
				entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnitString);
				System.out.println("EntityManagerFactory criada em " + new Date().toString());
			} else if (!entityManagerFactory.isOpen()) {
				entityManagerFactory = null;
				abrirEntityManagerFactory(persistenceUnit);
			}
			break;
		}	
	}

	/**
	 * Responsável por abrir e gerir a {@link EntityManager} de maneira correta.
	 * 
	 * @param transaction
	 * @throws Exception
	 */
	private <K> K gestorEntityManager(Transaction<K> transaction) throws Exception {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		K k = null;
		try {
			switch (persistenceUnit) {
			case BD_0:
				entityManager = entityManagerFactoryBd0.createEntityManager();
				break;
			default:
				entityManager = entityManagerFactory.createEntityManager();
				break;
			}
			entityTransaction = entityManager.getTransaction();
			if (!entityTransaction.isActive())
				entityTransaction.begin();
			if (entityTransaction.isActive()) {
				k = transaction.useEsseEntityManager(entityManager);
			}
			entityTransaction.commit();
		} catch (Exception e) {
			if (entityTransaction.isActive())
				entityTransaction.rollback();
			throw new Exception("[GESTOR-EntityManager] : " + iterarSobreErro(e));
		} finally {
			entityManager.close();
		}
		return k;
	}

	private String iterarSobreErro(Exception e) {
		StringBuilder sb = new StringBuilder();
		sb.append("<br>* " + e.getMessage());

		Throwable t = e.getCause();
		if (t == null)
			return sb.toString();
		sb.append("<br>* " + t.getMessage());

		while ((t = t.getCause()) != null)
			sb.append("<br>* " + t.getMessage());

		return sb.toString();
	}

	public T salvar(@Valid T entity) throws Exception {
		return gestorEntityManager(new Transaction<T>() {
			@Override
			public T useEsseEntityManager(EntityManager entityManager) throws Exception {
				entityManager.persist(entity);
				return entity;
			}
		});
	}

	public T atualizar(@Valid T entity) throws Exception {
		return gestorEntityManager(new Transaction<T>() {
			@Override
			public T useEsseEntityManager(EntityManager entityManager) throws Exception {
				return entityManager.merge(entity);
			}
		});
	}

	public void remover(int id) throws Exception {
		T entity = encontrar(id);
		remover(entity);
	}

	public void remover(T entity) throws Exception {
		gestorEntityManager(new Transaction<T>() {
			@Override
			public T useEsseEntityManager(EntityManager entityManager) throws Exception {
				T mergedEntity = entityManager.merge(entity);
				entityManager.remove(mergedEntity);
				return null;
			}
		});
	}

	public List<T> getList() throws Exception {
		return gestorEntityManager(new Transaction<List<T>>() {
			@Override
			public List<T> useEsseEntityManager(EntityManager entityManager) throws Exception {
				CriteriaBuilder builder = entityManager.getCriteriaBuilder();
				CriteriaQuery<T> query = builder.createQuery(persistedClass);
				query.from(persistedClass);
				return entityManager.createQuery(query).getResultList();
			}
		});
	}

	public T encontrar(int id) throws Exception {
		return gestorEntityManager(new Transaction<T>() {
			@Override
			public T useEsseEntityManager(EntityManager entityManager) throws Exception {
				return entityManager.find(persistedClass, id);
			}
		});
	}

	@SuppressWarnings("unchecked")
	public List<T> buscarListaDeHQL(String query, Complemente complemente) throws Exception {
		return gestorEntityManager(new Transaction<List<T>>() {
			@Override
			public List<T> useEsseEntityManager(EntityManager entityManager) throws Exception {
				Query q = entityManager.createQuery(query);
				if (complemente != null)
					complemente.estaQuery(q);
				return (List<T>) q.getResultList();
			}
		});
	}

	/**
	 * Retorna uma lista de objetos com base em uma query.<br>
	 * Esta query é executada com a {@link Query#getResultList()} utilizando a
	 * {@link EntityManager} gerenciada internamente pelo {@link GenericDAO}.
	 * 
	 * @param query
	 *            - String
	 * @return {@link List}
	 */
	public List<T> buscarListaDeHQL(String query) throws Exception {
		return buscarListaDeHQL(query, null);
	}

	public List<T> buscarListaDeNativeQuery(String query, Complemente complemente) throws Exception {
		return gestorEntityManager(new Transaction<List<T>>() {
			@SuppressWarnings("unchecked")
			@Override
			public List<T> useEsseEntityManager(EntityManager entityManager) throws Exception {
				Query q = entityManager.createNativeQuery(query);
				if (complemente != null)
					complemente.estaQuery(q);
				return (List<T>) q.getResultList();
			}
		});
	}

	public List<T> buscarListaDeNativeQuery(String query) throws Exception {
		return buscarListaDeNativeQuery(query, null);
	}

	public T buscarObjetoDeHQL(String query, Complemente complemente) throws Exception {
		return gestorEntityManager(new Transaction<T>() {
			@SuppressWarnings("unchecked")
			@Override
			public T useEsseEntityManager(EntityManager entityManager) throws Exception {
				Query q = entityManager.createQuery(query);
				if (complemente != null)
					complemente.estaQuery(q);
				return (T) q.getSingleResult();
			}
		});
	}

	public T buscarObjetoDeHQL(String query) throws Exception {
		return buscarObjetoDeHQL(query, null);
	}

	public T buscarObjetoDeNativeQuery(String query, Complemente complemente) throws Exception {
		return gestorEntityManager(new Transaction<T>() {
			@SuppressWarnings("unchecked")
			@Override
			public T useEsseEntityManager(EntityManager entityManager) throws Exception {
				Query q = entityManager.createNativeQuery(query);
				if (complemente != null)
					complemente.estaQuery(q);
				List<T> resultados = q.getResultList();
				T t = null;
				if(!resultados.isEmpty())
				    t = resultados.get(0);
				return t;
			}
		});
	}

	public T buscarObjetoDeNativeQuery(String query) throws Exception {
		return buscarObjetoDeNativeQuery(query, null);
	}
}