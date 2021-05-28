package com.mitrais.psms.datafactory;

import java.util.logging.Logger;

import javax.sql.DataSource;

public class DataSourceFactory 
{
	// define a datasource
	private final DataSource data = null;
	
	// define a Logger with Java util package
	private static final Logger LOGINSTANCE = Logger.getLogger(DataSourceFactory.class.getName());
	
	// create constructor
	public DataSourceFactory()
	{
		// beginn with database.properties
		MysqlDataSource daso = new MysqlDataSource();
		// note camelCase and normal "Mysql"
		
		
	}
	
	private static class SingletonHelper
	{
		private static final DataSourceFactory INSTANCE = new DataSourceFactory();
		
	}
}
