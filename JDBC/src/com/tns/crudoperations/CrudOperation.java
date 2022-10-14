package com.tns.crudoperations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.tns.util.DBUtil;

public class CrudOperation {

	//Create
	public static void addEmployee() throws SQLException {
		Connection connection = DBUtil.getConnection();
		Statement stmt = connection.createStatement();
		String sqlinsert = "INSERT INTO EMPLOYEE(id,name,salary,bonus)" + "values(3,'Rukmini',4000,300)";
		int executeupdate  = stmt.executeUpdate(sqlinsert);
		if(executeupdate==1)
			System.out.println("Insertion is successful");
	}
	//Retrieve
	public static void getEmployee() throws SQLException {
		Connection connection = DBUtil.getConnection();
		Statement stmt = connection.createStatement();
		String sqlretrieve = "Select * from employee";
		ResultSet rs = stmt.executeQuery(sqlretrieve);
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			Double salary = rs.getDouble("salary");
			Double bonus = rs.getDouble("bonus");
			System.out.println(id + " " + name + " " + salary + " " + bonus);
		}
//		else {
//			System.out.println("No record found");
//		}
	}
	//Update
	public static void updateEmployee() throws SQLException {
		Connection connection = DBUtil.getConnection();
		Statement stmt = connection.createStatement();
		String sqlupdate = "Update employee set bonus=100 where id=1";
		int executeupdate  = stmt.executeUpdate(sqlupdate);
		if(executeupdate==1)
			System.out.println("Update is successful");
	}
	//Delete
	public static void deleteEmployee() throws SQLException {
		Connection connection = DBUtil.getConnection();
		Statement stmt = connection.createStatement();
		String sqldelete = "Delete from employee where id=3";
		int executeupdate  = stmt.executeUpdate(sqldelete);
		if(executeupdate==1)
			System.out.println("Delete is successful");
	}
}
