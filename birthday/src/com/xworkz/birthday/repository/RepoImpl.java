package com.xworkz.birthday.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.xworkz.birthday.birthdayDTO.DTO;

public class RepoImpl implements BirthdayRepo{
String query;	

public 	RepoImpl()
{
	System.out.println("birthday implementation");
}
public RepoImpl(String query)
{
	this.query=query;
}

	
public boolean onSave(DTO dt) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/birthday","root", "Xworkzodc@123");
        System.out.println("insert method");
		PreparedStatement stmt=con.prepareStatement(query);
		stmt.setInt(1,dt.getId());
		stmt.setString(2, dt.getName());
		stmt.setString(3, dt.getMonth());
		stmt.setInt(4, dt.getYear());
		stmt.setString(5,dt.getDay());
		
		int i=stmt.executeUpdate();
		if(i!=0) {
			System.out.println("data saved Successfully");
		}else {
			System.out.println("data not saved");
		}
	}catch(Exception e) {
		System.out.println("classNotFoundException");
	}
	return true;

}
@Override
public boolean onUpdate(int id) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/birthday", "root","Xworkzodc@123");
		Statement st = con.createStatement();
		int i = st.executeUpdate("update birth set name=bhavya' where id = id");
		if(i !=0) {
			System.out.println("updated");
		}else {
			System.out.println("not updated");
		}
		
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
return true;
}

@Override
public boolean readById(int id) {
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Birthday", "root", "Xworkzodc@123");
	String query ="select *from birth where id=?";
	
	PreparedStatement st = con.prepareStatement(query);
	st.setInt(1, id);
	ResultSet rs =st.executeQuery();
	while(rs.next()) 
	{
		System.out.println("id:"+rs.getInt(1)+" "+"name:"+rs.getString(2));
	} 
	
}catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	
	}
return true;
}
@Override
public boolean onDelete(String place) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/birthday", "root", "Xworkzodc@123");
		Statement st = con.createStatement();
		int i = st.executeUpdate("delete from birth where month='may'");
		if(i != 0) {
			System.out.println("deleted");
		}else {
			System.out.println("not deleted");
		}
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
return true;
}
}




