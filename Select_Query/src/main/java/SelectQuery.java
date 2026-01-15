import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {
	public  void select() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/w3schools", "root", "root");
		
		System.out.println("Get connection Establish");
	     
		String q= "SELECT CustomerName,City FROM customers WHERE city='Indore'";
	    Statement st=connection.createStatement();
	    ResultSet s1=st.executeQuery(q);
	    System.out.println("Customers in Indore:");
    while (s1.next()) 
	    {
    	String a=s1.getString("CustomerName");
    	String a1=s1.getString("City");
    	
    	 System.out.println("CustomerName: " + a + "  City: " + a1);
	      }

	}
	public static void main(String[]args) {
		SelectQuery sq=new SelectQuery();
		try {
			sq.select();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	}
	
