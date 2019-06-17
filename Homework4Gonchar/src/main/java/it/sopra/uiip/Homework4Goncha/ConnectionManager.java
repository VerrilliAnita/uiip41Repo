package it.sopra.uiip.Homework4Goncha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	private static final String MY_VIAGGI = "com.mysql.jdbc.Viaggi";
	private static final String MY_URL = "jdbc:mysql://localhost:3306/MYDB?characterEncoding=latin1&useConfigs=maxPerformance";
	private static final String LOGIN = "root";
	private static final String PASSWD = "root";

	public static Connection getConnection() throws ClassNotFoundException,
			SQLException {
		
		Class.forName(MY_VIAGGI);
		return DriverManager.getConnection(MY_URL, LOGIN, PASSWD);
	}
	

}



