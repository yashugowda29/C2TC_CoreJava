package com.tns.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	//com.mysql.cj.jdbc.Driver
	
	private static final String db_driverclass="com.mysql.cj.jdbc.Driver";
	private static final String db_url="jdbc:mysql://localhost:3306/jdbcdb";
	private static final String db_username="root";
	private static final String db_password="yashu2914";
	private static Connection con = null;
	
	static {
		
		try {
			Class.forName(db_driverclass);
			con = DriverManager.getConnection(db_url,db_username,db_password);
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		return con;
	}
}

