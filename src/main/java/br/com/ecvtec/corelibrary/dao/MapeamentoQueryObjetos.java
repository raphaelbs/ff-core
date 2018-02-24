package br.com.ecvtec.corelibrary.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import br.com.ecvtec.corelibrary.dao.QueryDAO.Resultados;
import br.com.ecvtec.corelibrary.model.ObjetoJson;
import br.com.ecvtec.corelibrary.model.VetorJson;

public class MapeamentoQueryObjetos {
	
	/**
	 * Mapea resultado de lista de query para {@link VetorJson}. 
	 * Pode ser utilizado como modelo padrão de retorno para qualquer tipo de de-serialização.
	 */
	public static final Resultados<VetorJson> mapearQueryParaVetorJson = new Resultados<VetorJson>() {
		@Override
		public VetorJson lerResultSet(ResultSet rs) throws SQLException {
			VetorJson itens = new VetorJson();
			int cc = rs.getMetaData().getColumnCount();
			while(rs.next()){
				ObjetoJson item = new ObjetoJson(cc);
				for(int i=1; i<=cc; i++)
					item.put(rs.getMetaData().getColumnLabel(i), rs.getObject(i));
				itens.add(item);
			}
			return itens;
		}
	};
	
	/**
	 * Mapea resultado de resultado de query para {@link ObjetoJson}. 
	 * Pode ser utilizado como modelo padrão de retorno para qualquer tipo de de-serialização.
	 */
	public static final Resultados<ObjetoJson> mapearQueryParaObjetoJson = new Resultados<ObjetoJson>() {
		@Override
		public ObjetoJson lerResultSet(ResultSet rs) throws SQLException {
			ObjetoJson item = new ObjetoJson();
			int cc = rs.getMetaData().getColumnCount();
			if(rs.next()){
				for(int i=1; i<=cc; i++)
					item.put(rs.getMetaData().getColumnLabel(i), rs.getObject(i));
			}
			return item;
		}
	};
	
	/**
	 * Mapea resultado da query para obter o id.
	 * A query deve ter o label: "id"
	 */
	public static final Resultados<Integer> mapearQueryParaId = new Resultados<Integer>() {
		@Override
		public Integer lerResultSet(ResultSet rs) throws SQLException {
			if(rs.next()){
				return rs.getInt("id");
			}
			return null;
		}
	};

	
	/**
	 * Mapea resultado da query para uma lista de {@link HashMap}.
	 */
	public static final Resultados<HashMap<String, Object>> mapearQueryParaComponenteValidacao = new Resultados<HashMap<String, Object>>() {

		@Override
		public HashMap<String, Object> lerResultSet(ResultSet rs) throws SQLException {
			HashMap<String, Object> formulario_Componente_detalhes = new HashMap<String, Object>();
			while(rs.next()){
				HashMap<String, String> kv = new HashMap<>();
				kv.put("erro", rs.getString("msg_erro"));
				kv.put("valor", rs.getString("detalhe_valor"));
				formulario_Componente_detalhes.put(rs.getString("detalhe_nome"), kv);
			}
			return formulario_Componente_detalhes;
		}
		
	};
}
