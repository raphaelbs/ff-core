package br.com.ecvtec.corelibrary.formulario;

import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.ecvtec.corelibrary.dao.UtilitarioDAO.ParametrizarQuery;

/**
 * Esta classe é um gerenciador da classe {@link FormularioTela}.
 * É usada para buscar um array de telas dentro de um {@link Formulario}.
 * @author Raphael Brandão.
 *
 */
public final class FormularioTelaFactory extends Factory<List<FormularioTela>, Formulario>{
	
	private final static int QUERY_TELA_POR_FORM = 17;

	public FormularioTelaFactory(Formulario formulario, 
			HashMap<Integer, Blob> queryBuffer, 
			ParametrizarQuery substituidor) throws SQLException {
		super(formulario, queryBuffer, QUERY_TELA_POR_FORM, substituidor);
	}

	@Override
	public List<FormularioTela> lerResultSet(ResultSet rs) throws SQLException {
		List<FormularioTela> telas = new ArrayList<>();
		
		while(rs.next()){
			telas.add(new FormularioTela(
					rs.getInt("id"), 
					rs.getString("nome"), 
					rs.getString("tipo")));
		}
		
		this.parent.setTelas(telas);
		return telas;
	}
}
