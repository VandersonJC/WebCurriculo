package dao;

import java.sql.*;

public class ConectBD {

	public static Connection connect() {
		
		Connection con = null;
		
		try {
			
			String url = "jdbc:mysql://localhost:3306/curriculo";
			String user = "root";
			String password = "";
			String driver = "com.mysql.cj.jdbc.Driver";
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {

			e.printStackTrace();
		}	
		
		return con;
	}
	
	
	
}
