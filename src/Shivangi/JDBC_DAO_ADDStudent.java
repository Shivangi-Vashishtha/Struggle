package Shivangi;

// 1. import package
// 2. load driver
// 3. prepare the connection
// 4. prepare the statement
// 5. execute the statement
// 6. get the result
// 7. close the statement

import java.sql.*;

public class JDBC_DAO_ADDStudent
{
	public static void main(String[] args) 
	{
		Student_1DAO_1 sd=new Student_1DAO_1();
		int ww = sd.addStudent(5,"harsh");
			System.out.println(ww);
		
		
	}
}

 class Student_1DAO_1 {
	public int addStudent(int userid, String username) 
	{
		
		try
		{
			
	//	Student_1 s =new Student_1();
	//	String str;
	//	s.userid=userid;
	//	s.username=username;
		String url = "jdbc:mysql://localhost:3306/datashivangi";
		String name = "root";
		String password ="1234";
		String query="insert into student values (?,?)";	
		Connection con=DriverManager.getConnection(url,name,password);
		PreparedStatement sc=con.prepareStatement(query);
		
		sc.setInt(1,userid);
		sc.setString(2,username);
		int count=sc.executeUpdate();
		
		return count;
		
		}
		catch (Exception e)
		{
		System.out.println(e);
		
		}
		return 0;
		
		
	}

}

 class Student_1
{
	String username;
	int userid;
}

