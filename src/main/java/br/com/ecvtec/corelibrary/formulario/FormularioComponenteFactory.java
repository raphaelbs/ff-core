package br.com.ecvtec.corelibrary.formulario;

import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.ecvtec.corelibrary.dao.UtilitarioDAO.ParametrizarQuery;

/**
 * Esta classe é um gerenciador da classe {@link FormularioComponente}.
 * É usada para buscar um array de telas dentro de um {@link FormularioGuia}.
 * @author Raphael Brandão.
 *
 */
public final class FormularioComponenteFactory extends Factory<List<FormularioComponente>, FormularioGuia>{
	
	private final static int QUERY_COMPONENTES_POR_GUIA = 12;

	public FormularioComponenteFactory(FormularioGuia formularioGuia,
			HashMap<Integer, Blob> queryBuffer, 
			ParametrizarQuery substituidor) throws SQLException {
		super(formularioGuia, queryBuffer, QUERY_COMPONENTES_POR_GUIA, substituidor);
	}

	@Override
	public List<FormularioComponente> lerResultSet(ResultSet rs) throws SQLException {
		List<FormularioComponente> componentes = new ArrayList<>();
		while(rs.next()){
			componentes.add(new FormularioComponente(
					rs.getInt("id"),
					rs.getString("alias"), 
					rs.getString("referencia"), 
					rs.getInt("vinculo"),
					rs.getString("descricao"), 
					rs.getString("tipo"), 
					"SIM".equals(rs.getString("habilitado")), 
					"SIM".equals(rs.getString("visivel")), 
					rs.getString("icone"),
					rs.getString("mascara"),
					rs.getString("valor")));
		}
		this.parent.setComponentes(componentes);
		return componentes;
	}
}
