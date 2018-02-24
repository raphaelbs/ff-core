package br.com.ecvtec.corelibrary.formulario;

import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import br.com.ecvtec.corelibrary.dao.QueryDAO;
import br.com.ecvtec.corelibrary.dao.QueryDAO.Resultados;
import br.com.ecvtec.corelibrary.dao.UtilitarioDAO;
import br.com.ecvtec.corelibrary.dao.UtilitarioDAO.ParametrizarQuery;

public class FormularioFactory extends QueryDAO<Formulario> implements Resultados<Formulario>{

	private static final int QUERY_LISTAR_FORM = 16;
	
	public FormularioFactory(HashMap<Integer, Blob> queryBuffer, ParametrizarQuery substituidor) throws SQLException {
		super(UtilitarioDAO.getQueryPorId(queryBuffer, QUERY_LISTAR_FORM, substituidor));
		setResultados(this);
	}

	@Override
	public Formulario lerResultSet(ResultSet rs) throws SQLException {
		if(!rs.next()) throw new SQLException("Nenhum formulário encontrado!");
		return new Formulario(rs.getString("nome"), rs.getString("tipo"));
	}

}
