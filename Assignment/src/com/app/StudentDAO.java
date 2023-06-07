package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {
public static Connection getConnection() throws ClassNotFoundException {
	Connection con=null;

	try {
		Class.forName("com.mysql.jdbc.Driver");//load
		System.out.println("Driver Found");
		con =DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Password@123");
		System.out.println("Connection Established");
	} catch (SQLException e) {
		e.printStackTrace();
		
	}
	return con;
}
public static int saveStudent(Student s) throws ClassNotFoundException, SQLException {
	Connection con=getConnection();
	PreparedStatement pstmt= con.prepareStatement("insert into student (id,name,m1,m2,m3) values (?,?,?,?,?)"); 
	pstmt.setInt(1,s.getPrn());
	pstmt.setString(2,s.getName());
	pstmt.setInt(3,s.getM1());
	pstmt.setInt(4,s.getM2());
	pstmt.setInt(5,s.getM3());
	int i=pstmt.executeUpdate();
	return i;
	
}
public static boolean searchStd(Student s) throws SQLException, ClassNotFoundException {
	Connection con=getConnection();
	PreparedStatement pstmt = con.prepareStatement("select * from student where id=?");
	pstmt.setInt(1,s.getPrn());
	ResultSet rs=pstmt.executeQuery();
	boolean b= rs.next();
	return b;
	}
public static Student getStd(Student s) throws SQLException, ClassNotFoundException {
	Connection con=getConnection();
	PreparedStatement pstmt = con.prepareStatement("select * from student where id=?");
	pstmt.setInt(1,s.getPrn());
	ResultSet rs=pstmt.executeQuery();
	while(rs.next()) {
		s.setPrn(rs.getInt(1));
		s.setName(rs.getString(2));
		s.setM1(rs.getInt(3));
		s.setM2(rs.getInt(4));
		s.setM3(rs.getInt(5));
	}

	return s;
}
public static ResultSet  getAllStd() throws SQLException, ClassNotFoundException {
	Connection con=getConnection();
	PreparedStatement pstmt = con.prepareStatement("select * from student");

	ResultSet rs=pstmt.executeQuery();
//	while(rs.next()) {
//		s.setPrn(rs.getInt(1));
//		s.setName(rs.getString(2));
//		s.setM1(rs.getInt(3));
//		s.setM2(rs.getInt(4));
//		s.setM3(rs.getInt(5));
//	}
	
	return rs;
}
}
