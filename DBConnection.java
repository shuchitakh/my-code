package com.sbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String dbURL = "jdbc:sqlserver://10.4.11.26\\SQL2012DEV:55967;user=sa;password=Passw0rd";
		Connection conn = DriverManager.getConnection(dbURL);
	}
}
