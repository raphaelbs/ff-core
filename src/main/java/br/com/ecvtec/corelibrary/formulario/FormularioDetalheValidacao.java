package br.com.ecvtec.corelibrary.formulario;

import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import br.com.ecvtec.corelibrary.dao.Tipos_Query;
import br.com.ecvtec.corelibrary.dao.UtilitarioDAO.ParametrizarQuery;
import br.com.ecvtec.corelibrary.model.ObjetoJson;

/**
 * Esta classe é uma implementação de detalhe do tipo Validação.
 * @author Raphael Brandão.
 *
 */
public final class FormularioDetalheValidacao extends FormularioDetalheFactory{
	
	public FormularioDetalheValidacao(FormularioComponente componente,
			HashMap<Integer, Blob> queryBuffer, 
			ParametrizarQuery substituidor) throws SQLException {
		super(componente, Tipos_Query.LISTA_VALIDACAO_POR_COMPONENTE, queryBuffer, substituidor, null);
	}
	
	@Override
	public ObjetoJson lerResultSet(ResultSet rs) throws SQLException {
		ObjetoJson detalhes = new ObjetoJson();
		while(rs.next()){
			ObjetoJson detalhe = new ObjetoJson();
			detalhe.put("valor", rs.getString("detalhe_valor"));
			detalhe.put("erro", rs.getString("msg_erro"));
			detalhes.put(rs.getString("detalhe_nome"), detalhe);
		}
		this.parent.setValidacao(detalhes);
		return detalhes;
	}
}
