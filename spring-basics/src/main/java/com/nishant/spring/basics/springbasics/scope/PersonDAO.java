package com.nishant.spring.basics.springbasics.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {
	
	@Autowired
	private JDBCConnection jdbcConnection;

	public JDBCConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JDBCConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

}
