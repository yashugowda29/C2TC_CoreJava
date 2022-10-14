package com.tns.client;

import java.sql.Connection;
import java.sql.SQLException;

import com.tns.crudoperations.CrudOperation;
import com.tns.util.DBUtil;

public class Client {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = DBUtil.getConnection();
		if(connection!=null) {
			System.out.println("JDBC:Connection is established");
		}
		//CrudOperation.addEmployee();
		CrudOperation.getEmployee();
		//CrudOperation.updateEmployee();
		//CrudOperation.deleteEmployee();
	}
}
