package Shivangi;

import java.sql.*;

public class JDBC_Insert {
	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/datashivangi";
		String username="root";
		String password="1234";
		String str="insert into student values (?,?)";
		Class.forName("com.mysql.jdbc.Driver");
		int userid=3;
		String usname="Saloni";
		
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement sc=con.prepareStatement(str);
		sc.setInt(1,userid);
		sc.setString(2,usname);
		int count=sc.executeUpdate();
		System.out.print(count + "rows affected");
		
		sc.close();
		con.close();
		
		
	}

}
