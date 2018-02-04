package jdbcDemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Driver1 {
	    
	    public static void main(String[] args) throws SQLException {
	 
	        String url ="jdbc:mysql://localhost:3306/testdatabase"; //update connection string
	        
	        String user = "root";//add your db user id here
	        String password = "Welcome123";//add your db password here
	        
	        Connection conn = DriverManager.getConnection(url, user, password);
	        System.out.println("Successfully connected");
	        
	        //insert employee record into database
	        Statement stmt = conn.createStatement();
	        int rows = stmt.executeUpdate("insert into employee(age,name) values(23,'James')");
	       // System.out.println("Rows inserted = "+ rows);
	        
	       // rows = stmt.executeUpdate("insert into employee(age,name) values(24,'John')");
	      //  System.out.println("Rows inserted = "+ rows);
	        
	        //update employee record
	        rows= stmt.executeUpdate("Update employee set age=31 where name='James'");
	        System.out.println("Rows updated = "+ rows);
	        
	        //read employee records
	        ResultSet rs = stmt.executeQuery("Select * from employee");
	        while(rs.next()){
	            System.out.println("Emp Id : " + rs.getInt("id") + ", Name : " + rs.getString("name") + ", Age : " + rs.getInt("age"));
	        }
	        
	        //delete employee record
	        rows = stmt.executeUpdate("delete from employee where name = 'James'");
	        System.out.println("Rows deleted = "+ rows);
	        
	         rs = stmt.executeQuery("Select * from employee");
	        while(rs.next()){
	            System.out.println("Emp Id : " + rs.getInt("id") + ", Name : " + rs.getString("name") + ", Age : " + rs.getInt("age"));
	        }
	    }
	    
}


