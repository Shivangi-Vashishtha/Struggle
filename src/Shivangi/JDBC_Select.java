package Shivangi;



// 1. import package
// 2. load driver
// 3. prepare the connection
// 4. prepare the statement
// 5. execute the statement
// 6. get the result
// 7. close the statement

import java.sql.*;

public class JDBC_Select {
	public static void main(String[] args) throws Exception
	{
		
		String url = "jdbc:mysql://localhost:3306/datashivangi";
		String name = "root";
		String password ="1234";
		String query="Select username,userid from student ";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,name,password);
		Statement sc=con.createStatement();
		ResultSet rs=sc.executeQuery(query);
		
		while (rs.next())
		{
		String str=rs.getString("username");
		System.out.println(str);
		int id=rs.getInt("userid");
		System.out.println(id);
		}
		sc.close();
		con.close();
		
	}

}	
