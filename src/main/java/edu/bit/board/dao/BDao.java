package edu.bit.board.dao;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BDao {
	private DataSource dataSource;
	
	public BDao() {
		try {
			Context context = new InitialContext();
			dataSource=(DataSource) context.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
