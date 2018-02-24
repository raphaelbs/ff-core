package br.com.ecvtec.corelibrary.formulario;

import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import br.com.ecvtec.corelibrary.dao.UtilitarioDAO.ParametrizarQuery;
import br.com.ecvtec.corelibrary.model.ObjetoJson;

/**
 * Esta classe é uma implementação de detalhes.
 * @author Raphael Brandão.
 *
 */
public class FormularioDetalheFactory extends Factory<ObjetoJson, FormularioComponente>{

	private Define define;
	
	public FormularioDetalheFactory(FormularioComponente componente,
			int idQuery,
			HashMap<Integer, Blob> queryBuffer, 
			ParametrizarQuery substituidor,
			Define define) throws SQLException {
		super(componente, queryBuffer, idQuery, substituidor);
		this.define = define;
	}

	@Override
	public ObjetoJson lerResultSet(ResultSet rs) throws SQLException {
		ObjetoJson detalhes = new ObjetoJson();
		while(rs.next()){
			detalhes.put(rs.getString("detalhe_nome"), rs.getString("detalhe_valor"));
		}
		this.define.noPai(this.parent, detalhes);
		return detalhes;
	}
	
	public interface Define{
		public void noPai(FormularioComponente componente, ObjetoJson dados);
	}
}
