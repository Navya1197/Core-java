package com.xworkz.shopping.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.shopping.DTO.ShoppingDTO;

public class RepoImpl implements Repo {

	String query;
	public RepoImpl()
	{
		System.out.println("repo implementation");
	}
	public RepoImpl(String query)
	{
	   this.query=query;	
	}
	
	@Override
	public boolean onSave(ShoppingDTO dt)  {
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/shopmall","root", "Xworkzodc@123");
	            //String query ="insert into wedding values(?,?,?,?,?,?)";
				PreparedStatement stmt=con.prepareStatement(query);
				stmt.setInt(1, dt.getId());
				stmt.setString(2, dt.getName());
				stmt.setString(3, dt.getEmail());
				
				int i=stmt.executeUpdate();
				if(i!=0) {
					System.out.println("data saved Successfully");
				}else {
					System.out.println("data not saved");
				}
			}
			catch(Exception e) {
				System.out.println("ClassNotFoundException");
			
			}
			return true;
		}
	}
		     

	@Override
	public boolean updateById(int id) {
		
		System.out.println("inside update method");
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
	    	   System.out.println("driver is loaded");
	    	   
	 Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/shopmall","root", "Xworkzodc@123");
	   String query ="update shop set name=? where id=?";
	      PreparedStatement stmt  = con.prepareStatement(query);
	      stmt.setString(1, "akshi");
	      stmt.setInt(2, id);
	      int i =stmt.executeUpdate();
	     
	   if(i!=0)
	   {
		   System.out.println("update");
	   }
	   else
	   {
		   System.out.println("not update");
	   }
		}
		catch(Exception e)
	   {
		e.printStackTrace();   
	   }
		return true;
	}
		

	@Override
	public boolean updateByName(String name) {
		System.out.println("inside update method");
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
	    	   System.out.println("driver is loaded");
	    	   
	 Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/shopmall","root", "Xworkzodc@123");
	   String query ="update shop set id=? where name=?";
	      PreparedStatement stmt  = con.prepareStatement(query);
	      stmt.setInt(1, 3);
	      stmt.setString(2, "akshi");
	      int i =stmt.executeUpdate();
	     
	   if(i!=0)
	   {
		   System.out.println(" name has updated");
	   }
	   else
	   {
		   System.out.println(" name has not update");
	   }
		}
		catch(Exception e)
	   {
		e.printStackTrace();   
	   }
		return true;
	}
		
	@Override
	public boolean updateByEmail(String email) {
		
		System.out.println("inside update method");
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
	    	   System.out.println("driver is loaded");
	    	   
	 Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/shopmall","root", "Xworkzodc@123");
	   String query ="update shop set name=? where email=?";
	      PreparedStatement stmt  = con.prepareStatement(query);
	      stmt.setString(1, "sheelu");
	      stmt.setString(2, "nav@123");
	      int i =stmt.executeUpdate();
	     
	   if(i!=0)
	   {
		   System.out.println(" email has updated");
	   }
	   else
	   {
		   System.out.println("not email update");
	   }
		}
		catch(Exception e)
	   {
		e.printStackTrace();   
	   }
		return true;
	}
		
@Override
	public boolean readById(int id) {
		System.out.println("read method started");
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopmall", "root", "Xworkzodc@123");
	String query ="select *from shop where id=?";
	
	PreparedStatement st = con.prepareStatement(query);
	
	st.setInt(1, id);
	ResultSet rs =st.executeQuery();
	
	System.out.println("hi");
	while(rs.next()) {
		
		System.out.println("id:"+rs.getInt(1)+" "+"name:"+rs.getString(2)+" "+"email:"+rs.getString(3));
	} 
	
}catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	
	}
return true;
}
	@Override
	public boolean readByName(String name) {
		
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopmall", "root", "Xworkzodc@123");
		String query ="select *from shop where Name=?";
		
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1, "navya");
		ResultSet rs =st.executeQuery();
		while(rs.next()) 
		{
			System.out.println("id:"+rs.getInt(1)+" "+"name:"+rs.getString(2)+" "+rs.getString(3));
		} 
		
	}catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
		}
	return true;
	}
		
	@Override
	public boolean readByEmail(String email) {
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopmall", "root", "Xworkzodc@123");
		String query ="select *from shop where email=?";
		
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1, email);
		ResultSet rs =st.executeQuery();
		while(rs.next()) 
		{
			System.out.println("id:"+rs.getInt(1)+" "+"email:"+rs.getString(2)+" "+rs.getString(3));
		} 
		
	}catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
		}
	return true;
	}
		
		
		
		
		
	@Override
	public boolean deleteById(int id) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopmall", "root", "Xworkzodc@123");
			String query ="delete from shop where id=?";
			 PreparedStatement  st  = con.prepareStatement(query);
			 st.setInt(1, 2);
			int i= st.executeUpdate();
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

	@Override
	public boolean deleteByEmail(String email) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopmall", "root", "Xworkzodc@123");
			String query ="delete from shop where email=?";
			 PreparedStatement   st  = con.prepareStatement(query);
			 st.setString(1, "nav@123");
			int i= st.executeUpdate();
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
