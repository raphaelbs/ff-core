package br.com.ecvtec.corelibrary.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.ecvtec.corelibrary.model.ENTIDADE;
import br.com.ecvtec.corelibrary.model.UsuarioLogin;
import br.com.ecvtec.corelibrary.util.TIPO_VALORHelper;

public class LoginDAO extends GenericDAOBdAplicacao<ENTIDADE> {

	public LoginDAO() {
		super();
	}

	public boolean isLoginSenhaValido(String usuario, String senha) throws Exception{
		StringBuilder queryText = new StringBuilder();
		queryText.append("SELECT * ");
		queryText.append("FROM t1001 A ");
		queryText.append(
				"	LEFT JOIN t1007 B ON (A.c1_1001 = B.c2_1007_1001 and B.c3_1007_5002 = :TP_ENTIDADE_USUARIO) ");
		queryText.append(
				"	LEFT JOIN t1003 C ON (A.c1_1001 = C.c2_1003_1001 and C.c4_1003_5002 = :TP_DOCUMENTO_LOGIN) ");
		queryText.append(
				"	LEFT JOIN t1006 D ON (A.c1_1001 = D.c2_1006_1001 and D.c3_1006_5002 = :TP_DETALHE_SENHA_ATUAL) ");
		queryText.append("where C.c5_1003 = :login");
		queryText.append("	and D.c5_1006 = :senha");
		queryText.append("	and B.c5_1007_5002 = :STATUS_ATIVO");

		ENTIDADE login = buscarObjetoDeNativeQuery(queryText.toString(), new Complemente() {
			@Override
			public void estaQuery(Query query) {
				try {
					query.setParameter("TP_ENTIDADE_USUARIO", TIPO_VALORHelper
							.getTIPO_VALORPorParametro("TP_ENTIDADE_USUARIO").getID__CHAVE_SEQUENCIAL());
					query.setParameter("TP_DOCUMENTO_LOGIN",
							TIPO_VALORHelper.getTIPO_VALORPorParametro("TP_DOCUMENTO_LOGIN").getID__CHAVE_SEQUENCIAL());
					query.setParameter("TP_DETALHE_SENHA_ATUAL", TIPO_VALORHelper
							.getTIPO_VALORPorParametro("TP_DETALHE_SENHA_ATUAL").getID__CHAVE_SEQUENCIAL());
					query.setParameter("login", usuario);
					query.setParameter("senha", senha);
					query.setParameter("STATUS_ATIVO",
							TIPO_VALORHelper.getTIPO_VALORPorParametro("STATUS_ATIVO").getID__CHAVE_SEQUENCIAL());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		return login!=null;
	}

	@SuppressWarnings("rawtypes")
	public UsuarioLogin getInfoUsuario(String usuario, String senha) throws Exception{

		StringBuilder queryText = new StringBuilder();
		queryText.append("SELECT  A.c1_1001 AS 'ID__CHAVE_SEQUENCIAL', ");
		queryText.append("A.c2_1001 AS 'NOME', ");
		queryText.append("C.c5_1003 AS 'USUARIO', ");
		queryText.append("D.C5_1006 AS 'SENHA', ");
		queryText.append("E.c4_1006_5002 AS 'TIPO_USUARIO', ");
		queryText.append("NOW() AS 'DATA_LOGIN' ");
		queryText.append("FROM t1001 A ");
		queryText.append(
				"	LEFT JOIN t1007 B ON (A.c1_1001 = B.c2_1007_1001 and B.c3_1007_5002 = :TP_ENTIDADE_USUARIO) ");
		queryText.append(
				"	LEFT JOIN t1003 C ON (A.c1_1001 = C.c2_1003_1001 and C.c4_1003_5002 = :TP_DOCUMENTO_LOGIN) ");
		queryText.append(
				"	LEFT JOIN t1006 D ON (A.c1_1001 = D.c2_1006_1001 and D.c3_1006_5002 = :TP_DETALHE_SENHA_ATUAL) ");
		queryText.append(
				"	LEFT JOIN t1006 E ON (A.c1_1001 = E.c2_1006_1001 and E.c3_1006_5002 IN (:TP_USUARIO_SISTEMA, :TP_USUARIO_ADMINISTRADOR, :TP_USUARIO_COMUM)) ");
		queryText.append("WHERE C.c5_1003 = :login");
		queryText.append("	and D.c5_1006 = :senha");
		queryText.append("	and B.c5_1007_5002 = :STATUS_ATIVO");

		UsuarioLogin foundEntity = null;

		List results = buscarListaDeNativeQuery(queryText.toString(), new Complemente() {
			@Override
			public void estaQuery(Query query) {
				try {
					query.setParameter("TP_ENTIDADE_USUARIO", TIPO_VALORHelper
							.getTIPO_VALORPorParametro("TP_ENTIDADE_USUARIO").getID__CHAVE_SEQUENCIAL());
					query.setParameter("TP_DOCUMENTO_LOGIN",
							TIPO_VALORHelper.getTIPO_VALORPorParametro("TP_DOCUMENTO_LOGIN").getID__CHAVE_SEQUENCIAL());
					query.setParameter("TP_DETALHE_SENHA_ATUAL", TIPO_VALORHelper
							.getTIPO_VALORPorParametro("TP_DETALHE_SENHA_ATUAL").getID__CHAVE_SEQUENCIAL());

					query.setParameter("TP_USUARIO_SISTEMA",
							TIPO_VALORHelper.getTIPO_VALORPorParametro("TP_USUARIO_SISTEMA").getID__CHAVE_SEQUENCIAL());
					query.setParameter("TP_USUARIO_ADMINISTRADOR", TIPO_VALORHelper
							.getTIPO_VALORPorParametro("TP_USUARIO_ADMINISTRADOR").getID__CHAVE_SEQUENCIAL());
					query.setParameter("TP_USUARIO_COMUM",
							TIPO_VALORHelper.getTIPO_VALORPorParametro("TP_USUARIO_COMUM").getID__CHAVE_SEQUENCIAL());

					query.setParameter("login", usuario);
					query.setParameter("senha", senha);
					query.setParameter("STATUS_ATIVO",
							TIPO_VALORHelper.getTIPO_VALORPorParametro("STATUS_ATIVO").getID__CHAVE_SEQUENCIAL());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		if (!results.isEmpty()) {
			foundEntity = new UsuarioLogin();
			Object[] camposResultado = ((Object[]) results.get(0));

			Integer id = Integer.parseInt(camposResultado[0].toString());

			foundEntity.setId(id);
			foundEntity.setNome(camposResultado[1].toString());
			foundEntity.setUsuario(camposResultado[2].toString());
			foundEntity.setSenha(camposResultado[3].toString());
			foundEntity.setTipoUsuario(camposResultado[4].toString());
			foundEntity.setDataLogin(camposResultado[5].toString());
		}

		return foundEntity;
	}
}
