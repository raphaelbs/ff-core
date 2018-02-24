package br.com.ecvtec.corelibrary.formulario;

import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.ecvtec.corelibrary.dao.UtilitarioDAO.ParametrizarQuery;

/**
 * Esta classe é um gerenciador da classe {@link FormularioGuia}.
 * É usada para buscar um array de guias dentro de um {@link FormularioTela}.
 * @author Raphael Brandão.
 *
 */
public class FormularioGuiaFactory extends Factory<List<FormularioGuia>, FormularioTela>{

	private final static int QUERY_GUIA_POR_TELA = 18;
	
	public FormularioGuiaFactory(FormularioTela formularioTela,
			HashMap<Integer, Blob> queryBuffer, 
			ParametrizarQuery substituidor) throws SQLException {
		super(formularioTela, queryBuffer, QUERY_GUIA_POR_TELA, substituidor);
	}

	@Override
	public List<FormularioGuia> lerResultSet(ResultSet rs) throws SQLException {
		List<FormularioGuia> guias = new ArrayList<>();
		
		while(rs.next()){
			guias.add(new FormularioGuia(
					rs.getInt("id"), 
					rs.getString("nome"), 
					rs.getString("tipo"),
					rs.getInt("container"),
					rs.getString("mapeamento")));
		}
		
		this.parent.setGuias(guias);
		return guias;
	}
}
