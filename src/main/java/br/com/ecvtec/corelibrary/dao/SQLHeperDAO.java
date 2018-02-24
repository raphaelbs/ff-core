package br.com.ecvtec.corelibrary.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Blob;

import br.com.ecvtec.corelibrary.dao.QueryDAO.Parametros;
import br.com.ecvtec.corelibrary.dao.QueryDAO.Resultados;

public class SQLHeperDAO {

	public String buscarSQLPorId(int idSQL) throws SQLException {
		StringBuilder vsQuery = new StringBuilder();
		vsQuery.append(
				" SELECT (SELECT c4_5501 FROM bd_0.t5501 as MIDIA WHERE MIDIA.c1_5501 = DETALHE.c4_702_5501 LIMIT 1) as 'QUERY' ");
		vsQuery.append(" FROM bd_0.t702 as DETALHE ");
		vsQuery.append(" INNER JOIN bd_0.t701 as _SQL on DETALHE.c2_702_701 = _SQL.c1_701 ");
		vsQuery.append(" WHERE _SQL.c1_701 = ? ; ");

		return new QueryDAO<String>(vsQuery.toString())
				.setParametros(new Parametros() {

					@Override
					public void setParametros(PreparedStatement pstm) throws SQLException {
						pstm.setInt(1, idSQL);	
					}
					
				})
				.setResultados(new Resultados<String>() {
					@Override
					public String lerResultSet(ResultSet rs) throws SQLException {
						Blob bl = (Blob) rs.getBlob("QUERY");
						return bl.toString();
					}
				}).executar();
	}

	public String buscarSQLPorNome(String nomeSQL) throws SQLException {

		StringBuilder vsQuery = new StringBuilder();
		vsQuery.append(
				" SELECT (SELECT c4_5501 FROM bd_0.t5501 as MIDIA WHERE MIDIA.c1_5501 = DETALHE.c4_702_5501 LIMIT 1) as 'QUERY' ");
		vsQuery.append(" FROM bd_0.t702 as DETALHE ");
		vsQuery.append(" INNER JOIN bd_0.t701 as _SQL on DETALHE.c2_702_701 = _SQL.c1_701 ");
		vsQuery.append(" WHERE _SQL.c2_701 = ? ; ");
		
		return new QueryDAO<String>(vsQuery.toString())
				.setParametros(new Parametros() {

					@Override
					public void setParametros(PreparedStatement pstm) throws SQLException {
						pstm.setString(1, nomeSQL);
					}
					
				})
				.setResultados(new Resultados<String>() {
					@Override
					public String lerResultSet(ResultSet rs) throws SQLException {
						Blob bl = (Blob) rs.getBlob("QUERY");
						return bl.toString();
					}
				}).executar();
	}

}
