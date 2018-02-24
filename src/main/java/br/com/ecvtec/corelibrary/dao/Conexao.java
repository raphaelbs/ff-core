package br.com.ecvtec.corelibrary.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.ecvtec.corelibrary.util.ConfigPropHelper;

public class Conexao {
	

	private static final Log log = LogFactory.getLog(Conexao.class);
	
	private static int ativa = 0, idle = 0;
	
	public static synchronized void logar() {
		if (log.isInfoEnabled()
				&& (ativa != ds.getNumActive()
				|| idle != ds.getNumIdle())) {
			log.info("ativa: " + ds.getNumActive() 
					+ " (max: " + ds.getMaxTotal() + ")   " 
					+ "idle: " + ds.getNumIdle()
					+ "(max: " + ds.getMaxIdle() + ")");
			ativa = ds.getNumActive();
			idle = ds.getNumIdle();
		}
	}
	
	/**
	 * A conexão com o BD é feita através do pooling DBCP.
	 */
	private static BasicDataSource ds;

	/**
	 * Retorna o {@link BasicDataSource} instanciado.
	 * 
	 * @return
	 * @throws SQLException 
	 */
	public static BasicDataSource getDataSource() throws SQLException {
		if (ds != null)
			return ds;
		try {
			ds = new BasicDataSource();
			// Configurações fixas:
			String driverName = ConfigPropHelper.getValorPropriedadePorNome("driverName");
			String minimoConexoes = ConfigPropHelper.getValorPropriedadePorNome("minimoConexoes");
			String maximoConexoes = ConfigPropHelper.getValorPropriedadePorNome("maximoConexoes");
			String maximoPreparedStatements = ConfigPropHelper.getValorPropriedadePorNome("maximoPreparedStatements");
			
			// Verifica qual conexão é, local ou remota:
			String remoto = ConfigPropHelper.getValorPropriedadePorNome("conectarRemoto");
			boolean isRemoto = Boolean.valueOf(remoto);
			log.info("Criando DataSource Bd Produção:\n( " + (isRemoto ? "V" : "F") + " ) Remoto\n( " + (!isRemoto ? "V" : "F") + " ) Local");
			String serverName = ConfigPropHelper.getValorPropriedadePorNome(isRemoto ? "serverName" : "serverNameLocal");
			String serverPort = ConfigPropHelper.getValorPropriedadePorNome(isRemoto ? "serverPort" : "serverPortLocal");
			String mydatabase = ConfigPropHelper.getValorPropriedadePorNome(isRemoto ? "databaseName" : "databaseNameLocal");
			String username = ConfigPropHelper.getValorPropriedadePorNome(isRemoto ? "userForDatabase" : "userForDatabaseLocal");
			String password = ConfigPropHelper.getValorPropriedadePorNome(isRemoto ? "passwordForDatabase" : "passwordForDatabaseLocal");
			
			// Configurações requeridas:
			String url = ConfigPropHelper.getValorPropriedadePorNome("prefixoURL") + serverName + ":" + serverPort + "/"
					+ mydatabase;
			ds.setDriverClassName(driverName);
			ds.setUsername(username);
			ds.setPassword(password);
			ds.setUrl(url);
			// Opcionais:
			if (minimoConexoes != null)
				ds.setMinIdle(Integer.valueOf(minimoConexoes));
			if (maximoConexoes != null)
				ds.setMaxIdle(Integer.valueOf(maximoConexoes));
			if (maximoPreparedStatements != null)
				ds.setMaxOpenPreparedStatements(Integer.valueOf(maximoPreparedStatements));
			return ds;
		} catch (IOException ioex) {
			// Arquivo de Configuracoes nao encontrado
			log.debug("Arquivo de configuracoes nao foi encontrado." + ioex.getMessage());
			throw new SQLException("Arquivo de configuracoes nao foi encontrado." + ioex.getMessage());
		}
	}

	/**
	 * Retorna ou abre uma conexão com o banco de dados. A conexão com o BD é
	 * feita estaticamente através do pooling de conexão DBCP.
	 * @throws SQLException
	 * @return {@link Connection}
	 */
	public static synchronized Connection buscarDoPooling() throws SQLException{
		if (ds != null) return ds.getConnection();
		Connection conn = getDataSource().getConnection();
		logar();
		return conn;
	}
}
