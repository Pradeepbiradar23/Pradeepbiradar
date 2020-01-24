package model;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model
{
	String url="jdbc:oracle:thin:@//localhost:1521/XE";
	String uname="system";
	String passwd="reddy";
	Connection con=null;
	PreparedStatement ps=null;
	String name;
	String username;
	String password;
	ResultSet res;
	int total;
	int pricetotal=0;
	String books="";
	public Model()
	{
		try 
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection(url, uname, passwd);
			System.out.println("driver loaded and getting connection");
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int getResister()
	{
		int rows=0;
		try 
		{
		PreparedStatement ps=con.prepareStatement("INSERT INTO BOOK_STORE VALUES(?,?,?)");
		ps.setString(1, name);
		ps.setString(2, username);
		ps.setString(3, password);
		 rows=ps.executeUpdate();
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rows;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public boolean getLogin()
	{
		try {
			ps=con.prepareStatement("SELECT * FROM BOOK_STORE WHERE USERNAME=? AND PASSWORD=?");
			ps.setString(1, username);
			ps.setString(2, password);
			res=ps.executeQuery();
			
			
			if(res.next()==true)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	public void getInfo()
	{
		try {
			ps=con.prepareStatement("SELECT BOOK, PRICE FROM BOOK_STORE WHERE ID=?");
			ps.setInt(1, total);
			res=ps.executeQuery();
			while(res.next())
			{
			String bookname = res.getString("BOOK");
			int sum = res.getInt("PRICE");
			 books=books+bookname+" ";
			 pricetotal=pricetotal+sum;
			}
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getBooks()
	{
		return books;
	}
	public int getPriceTotal() 
	{
		return pricetotal;
	}
}
