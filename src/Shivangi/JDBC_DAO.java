package Shivangi;




// 1. import package
// 2. load driver
// 3. prepare the connection
// 4. prepare the statement
// 5. execute the statement
// 6. get the result
// 7. close the statement

import java.sql.*;

public class JDBC_DAO
{
	public static void main(String[] args) 
	{
		StudentDAO sd=new StudentDAO();
		Student s=sd.getName(1);
		System.out.println(s.username);
	}
}

 class StudentDAO {
	public Student getName(int userid)
	{
		try
		{
		Student s =new Student();
		String str;
		
		String url = "jdbc:mysql://localhost:3306/datashivangi";
		String name = "root";
		String password ="1234";
		String query="Select username from student where userid="+userid ;
		
		s.userid=userid;
		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,name,password);
		Statement sc=con.createStatement();
		ResultSet rs=sc.executeQuery(query);
		
		rs.next();
		
		 str=rs.getString("username");
		s.username=str;
		return s;
		
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return null;
		
		
	}

}

 class Student
{
	String username;
	int userid;
}

