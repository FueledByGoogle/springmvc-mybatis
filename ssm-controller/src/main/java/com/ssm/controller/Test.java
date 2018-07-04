package com.ssm.controller;

import java.sql.*;

public class Test {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sys?useSSL=false","root","Mysql123");
			PreparedStatement st = con.prepareStatement("select name from User where id=0");
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("name"));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
