package scratchpad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbtry {

	public static void main(String[] args) throws Exception {
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/brucetest?serverTimezone=UTC";
		String username ="root";
		String password ="dieg0";
		
		try {
			//step 1
			Class.forName(driver);
			//step2
			Connection connect = DriverManager.getConnection(url, username, password);
			System.out.println("science bitch");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
