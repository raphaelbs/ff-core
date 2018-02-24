package br.com.ecvtec.corelibrary.formulario;

import java.sql.Blob;
import java.sql.SQLException;
import java.util.HashMap;

import br.com.ecvtec.corelibrary.dao.QueryDAO;
import br.com.ecvtec.corelibrary.dao.QueryDAO.Resultados;
import br.com.ecvtec.corelibrary.dao.UtilitarioDAO;
import br.com.ecvtec.corelibrary.dao.UtilitarioDAO.ParametrizarQuery;

/**
 * Modelo de gerenciador de lista de hierarquias.
 * @author Raphael Brandão.
 *
 */
public abstract class Factory<T, K> extends QueryDAO<T> implements Resultados<T>{

	protected K parent;

	public Factory(K k, 
			HashMap<Integer, Blob> queryBuffer, 
			int queryId,
			ParametrizarQuery substituidor) throws SQLException {
		super(UtilitarioDAO.getQueryPorId(queryBuffer, queryId, substituidor));
		this.parent = k;
		this.resultados = this;
	}
	
	@Override
	public QueryDAO<T> setResultados(Resultados<T> resultados) {
		return this;
	}
}
