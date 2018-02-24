package br.com.ecvtec.corelibrary.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.ecvtec.corelibrary.dao.QueryDAO.Parametros;
import br.com.ecvtec.corelibrary.dao.QueryDAO.Resultados;
import br.com.ecvtec.corelibrary.model.DOMINIO;
import br.com.ecvtec.corelibrary.model.TIPO_VALOR;
import br.com.ecvtec.corelibrary.util.TIPO_VALORHelper;

public class DominioDAO {

	public DOMINIO buscarInformacoesDominio(String nomeDominio) throws SQLException {

		StringBuilder vsQuery = new StringBuilder();
		vsQuery.append("SELECT ent.c1_1001, det0.c5_1006 dominio, ");
		vsQuery.append("det1.c5_1006 tipoDb, det2.c5_1006 host, ");
		vsQuery.append("det3.c5_1006 porta, det4.c5_1006 banco, ");
		vsQuery.append("det5.c5_1006 user, det6.c5_1006 senha, ");
		vsQuery.append("det7.c5_1006 idMenu,");
		vsQuery.append("entRel.c5_1007_5002 ativo ");
		vsQuery.append("FROM bd_0.T1001 ent ");
		vsQuery.append("inner join bd_0.T1007 entRel on ent.c1_1001 = entRel.c2_1007_1001 ");
		vsQuery.append("inner join bd_0.t1006 det0 on ent.c1_1001 = det0.c2_1006_1001 and det0.c3_1006_5002 = 1301 ");
		vsQuery.append("inner join bd_0.t1006 det1 on ent.c1_1001 = det1.c2_1006_1001 and det1.c3_1006_5002 = 1302 ");
		vsQuery.append("inner join bd_0.t1006 det2 on ent.c1_1001 = det2.c2_1006_1001 and det2.c3_1006_5002 = 1303 ");
		vsQuery.append("inner join bd_0.t1006 det3 on ent.c1_1001 = det3.c2_1006_1001 and det3.c3_1006_5002 = 1304 ");
		vsQuery.append("inner join bd_0.t1006 det4 on ent.c1_1001 = det4.c2_1006_1001 and det4.c3_1006_5002 = 1305 ");
		vsQuery.append("inner join bd_0.t1006 det5 on ent.c1_1001 = det5.c2_1006_1001 and det5.c3_1006_5002 = 1306 ");
		vsQuery.append("inner join bd_0.t1006 det6 on ent.c1_1001 = det6.c2_1006_1001 and det6.c3_1006_5002 = 1307 ");
		vsQuery.append("inner join bd_0.t1006 det7 on ent.c1_1001 = det7.c2_1006_1001 and det7.c3_1006_5002 = 1308 ");
		vsQuery.append("where ent.c1_1001 = (select c2_1006_1001 from bd_0.t1006 where c3_1006_5002 = 1301 and c5_1006 = ?)");
		
		DOMINIO dominioInf = new QueryDAO<DOMINIO>(vsQuery.toString())
		.setParametros(new Parametros() {
			@Override
			public void setParametros(PreparedStatement pstm) throws SQLException {
				pstm.setString(1, nomeDominio);
			}
		}).setResultados(new Resultados<DOMINIO>() {
			@Override
			public DOMINIO lerResultSet(ResultSet rs) throws SQLException {
				DOMINIO dominioInf = new DOMINIO();
				while (rs.next()) {
					dominioInf.setID__CHAVE_SEQUENCIAL(rs.getInt("C1_1001"));
					dominioInf.setNOME_DO_DOMINIO(rs.getString("dominio"));
					TIPO_VALOR status;
					try {
						status = TIPO_VALORHelper.getTIPO_VALORPorId(rs.getInt("ativo"));
					} catch (Exception e) {
						throw new SQLException(e.getCause());
					}
					dominioInf.setSTATUS_DO_DOMINIO_ATIVO__INATIVO_(status);
					dominioInf.setMenuId(rs.getInt("idMenu"));
					// dominioInf.setSTATUS_ID(rs.getInt("STATUS_ID"));
					// dominioInf.setSTATUS_DESCRICAO(rs.getString("STATUS"));
				}
				return dominioInf;
			}
		}).executar();

		return dominioInf;
	}

}
