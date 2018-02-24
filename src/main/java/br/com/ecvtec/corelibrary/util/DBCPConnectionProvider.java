package br.com.ecvtec.corelibrary.util;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;

import br.com.ecvtec.corelibrary.dao.Conexao;

/**
 * Provedor de conexão DBCP2 para o Hibernate.
 * 
 * @author Raphael Brandão
 *
 */
public class DBCPConnectionProvider implements ConnectionProvider {

	private static final long serialVersionUID = 2727586814933909438L;
	private static final Log log = LogFactory.getLog(DBCPConnectionProvider.class);

	public boolean supportsAggressiveRelease() {
		return false;
	}

	@Override
	public boolean isUnwrappableAs(Class unwrapType) {
		return false;
	}

	@Override
	public <T> T unwrap(Class<T> unwrapType) {
		return null;
	}
	
	@Override
	public void closeConnection(Connection conn) throws SQLException {
		conn.close();	
		Conexao.logar();
	}
	
	public Connection getConnection() throws SQLException {
		return Conexao.buscarDoPooling();
	}
}