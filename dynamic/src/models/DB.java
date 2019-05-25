package models;


import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

	public static Connection createConnection() {
		Connection con=null;
		String url="jdbc....";
		String username ="root";
		String password="root";
		
		try {
			try{
				Class.forName("com.mysql.jdbc.Driver");
				
			}
			catch(ClassNotFoundException e) {
				e.printStackTrace();
				
			}
			con =DriverManager.getConnection(url,  username,  password);
			System.out.println("printing connnect"+con);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
}
