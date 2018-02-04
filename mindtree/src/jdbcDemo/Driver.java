package jdbcDemo;
import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/example","root","Welcome123");
			Statement s=myConn.createStatement();
			ResultSet r=s.executeQuery("select * from student");
			while(r.next())
			{
				System.out.println(r.getString("id")+" "+r.getString("name"));
			}
		}
		catch(Exception exc){
			exc.printStackTrace();
		}

	}

}
