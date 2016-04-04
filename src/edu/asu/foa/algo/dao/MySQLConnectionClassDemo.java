package edu.asu.foa.algo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnectionClassDemo {

	public static void main(String[] args) {
		
		System.out.println(MySQLConnectionClass.singleinstance);
		//MySQLConnectionClass newinstance = new MySQLConnectionClass();        ###    CANT CREATE        ####
		MySQLConnectionClass newinstance = MySQLConnectionClass.getConnectionInstance();
		System.out.println(MySQLConnectionClass.singleinstance);
		System.out.println(newinstance.getStmt()); 
		
		Connection con = newinstance.conn;
		Statement st = newinstance.getStmt();
		ResultSet rs ;
		try {
			st = con.createStatement();
			rs = st.executeQuery("SELECT TABLE_NAME FROM information_schema.TABLES WHERE TABLE_SCHEMA = 'ss'");
			while(rs.next()){
				System.out.println(rs.getString(1));
			}
			rs.close();
			st.close();
			//con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("SECOND QUERY");
		try {
			//if(con.isClosed())
				//con = DriverManager.getConnection();
			st = con.createStatement();
			rs = st.executeQuery("SELECT TABLE_NAME FROM information_schema.TABLES");
			while(rs.next()){
				System.out.println(rs.getString(1));
			}
			rs.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//public 
}
