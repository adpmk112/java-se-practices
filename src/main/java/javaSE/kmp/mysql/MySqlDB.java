package javaSE.kmp.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlDB {
	private Connection con;
	public void init()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Class found !");
		}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			String url = "jdbc:mysql://localhost:3306/test";
			String name = "root";
			String password = "zxcv1234";
			
			try {
				con = DriverManager.getConnection(url,name,password);
				System.out.println("Connection successful!");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//execute (use for one role), executeQuery (use for retrieve), executeUpdate(use for CUD)
			//CRUD	
			}
	public Connection getConnection()
	{
		return con;
	}
	public void insertPerson(Person prn)
	{
		String sql = "insert into `person` (`name`,`age`) values (?,?)";
		try {
			PreparedStatement prepStmt = con.prepareStatement(sql);
			prepStmt.setString(1, prn.getName());
			prepStmt.setInt(2, prn.getAge());
			int rowCount = prepStmt.executeUpdate();
			if(rowCount>0)
			{
				System.out.println("Insertion Successful");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 public void getAllPeople()
	 {
		 String sql ="select * from `person`";
		 try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			Person p =  new Person();
			while (rs.next())
			{
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setAge(rs.getInt(3));
				System.out.println(p.getId()+". "+p.getName()+" , "+p.getAge());
			}
			System.out.println();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 public void updateByPersonId(int id,Person prn)
	 {
		 String sql = "update `person` set name=?,age=? where id=? ";
		 try {
			PreparedStatement prepStmt = con.prepareStatement(sql);
			prepStmt.setString(1, prn.getName());
			prepStmt.setInt(2, prn.getAge());
			prepStmt.setInt(3,id);
			
			int rowUpdated = prepStmt.executeUpdate();
			if(rowUpdated>0)
			{
				System.out.println("Update Successful");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 public void deleteByPersonId(int id)
	 {
		 String sql = "delete from `person` where id = ?";
		 PreparedStatement prepStmt;
		try {
			prepStmt = con.prepareStatement(sql);	
			prepStmt.setInt(1,id);
			
			int rowDeleted = prepStmt.executeUpdate();
			if(rowDeleted > 0)
			{
				System.out.println("Delete successful");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}
