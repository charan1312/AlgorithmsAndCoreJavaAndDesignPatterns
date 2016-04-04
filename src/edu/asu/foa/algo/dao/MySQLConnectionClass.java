package edu.asu.foa.algo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public final class MySQLConnectionClass {
	
 
		public Connection conn = null;
		private Statement stmt;
		public static MySQLConnectionClass singleinstance;
		
		
		private MySQLConnectionClass() {
			String dbUrl = "jdbc:mysql://localhost:3306/";
			String dbName = "quadriga";
			String driver = "com.mysql.jdbc.Driver";
			String dbUserName = "dbadmin";
			String dbPassword = "dbadmin";
				
			try {
				Class.forName(driver);
				System.out.println("Found");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			try {
				this.conn = DriverManager.getConnection(dbUrl + dbName,dbUserName ,dbPassword);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static synchronized MySQLConnectionClass getConnectionInstance() {
			if(singleinstance ==  null )
				singleinstance = new MySQLConnectionClass();
			return singleinstance;
		}

		public Statement getStmt() {
			return stmt;
		}

		public void setStmt(Statement stmt) {
			this.stmt = stmt;
		}
		
/*		public ResultSet getQueryResultSet(String query) throws SQLException {
			stmt = singleinstance.conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			return rs;
		}
		
		public int runInsert(String insQuery) throws SQLException {
			stmt = singleinstance.conn.createStatement();
			int result = stmt.executeUpdate(insQuery);
			return result;
		}
*/
		
//		stmt = conn.createStatement();
//		String sql = "SELECT TABLE_NAME FROM information_schema.TABLES";// WHERE TABLE_SCHEMA = 'ss'";
//	//String sql = "SELECT DISTINCT TABLE_SCHEMA FROM information_schema.TABLES";
//	ResultSet rs = stmt.executeQuery(sql);
//	
//	while(rs.next()) {
//		System.out.println(rs.getObject(1).toString());
//	}
//	
//	rs.close();
//	stmt.close();
//	conn.close();

}
