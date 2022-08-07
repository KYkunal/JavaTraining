package com.globallogicMaven_04_08.MyMaven2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyJdbc 
{

	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			Statement st=con.createStatement();
			
			// insertion
//			  String insertQuery="insert into employee(id,name,fname,salary,company,deptid)values(101,'Akhil','XYZ',50000,'infotech',1001)";
//			  st.execute(insertQuery);
			
			//deletion
//			String deleteQu="delete from employee where id=101";
//			st.executeUpdate(deleteQu);
			
			//updation
//			String update="update employee set salary=80000 where id=1";
//			st.executeUpdate(update);
			 
			String selt="select * from employee";
			ResultSet rs=st.executeQuery(selt);
			
			while(rs.next())
			{
				System.out.println("Id="+", "+rs.getInt("id")+", "+"Name="+rs.getString(2)+", "+"Fname="+rs.getString(3)+", "+"Salary="+rs.getInt(4)+", "+"Company="+rs.getString(5)+", "+"DeptId="+rs.getInt(6));
			}
				
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
