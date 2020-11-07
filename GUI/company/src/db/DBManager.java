package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
	public static Connection con;
	
	public DBManager() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company?serverTimezone=UTC")
					
		} catch(Exception e) {
			
		}
	}
	
	public 

}
