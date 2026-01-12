
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class St_Database
{

public  int insertvalueIncustomers() throws SQLException, ClassNotFoundException 
	
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/w3schools", "root", "root");
		System.out.println("Get connection Establish");
		
	    String query = "insert into customers (CustomerName,ContactName) values ('Ruchi','Tiwari')";
		
	    Statement st=connection.createStatement();
	    int s=st.executeUpdate(query);
	    System.out.println(s);
	    return s;
	    
	}

     public  int insertvalueInemployees() throws SQLException, ClassNotFoundException 

    {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/w3schools", "root", "root");
	System.out.println("Get connection Establish");
    String query2 =  "insert into employees (LastName,FirstName) values ('prachi','Tiwari')";
	
    Statement st=connection.createStatement();
    int s=st.executeUpdate(query2);
    System.out.println(s);
    return s;
    
}
     
public  int insertvalueIncategories() throws SQLException, ClassNotFoundException 

{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/w3schools", "root", "root");
	System.out.println("Get connection Establish");
    String query3 = "insert into categories (CategoryName,Description) values ('Chips','Lays')";
	
    Statement st=connection.createStatement();
    int s=st.executeUpdate(query3);
    System.out.println(s);
    return s;
    
}
public  int insertvalueInorder_details() throws SQLException, ClassNotFoundException 

{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/w3schools", "root", "root");
	System.out.println("Get connection Establish");
	
    String query4 = "insert into order_details (Quantity) values (10)";
    
    Statement st=connection.createStatement();
    int s=st.executeUpdate(query4);
    System.out.println(s);
    return s;
    
}
public  int insertvalueInorders() throws SQLException, ClassNotFoundException 

{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/w3schools", "root", "root");
	System.out.println("Get connection Establish");
	
    String query5 = "insert into orders (CustomerID,OrderID) values (11111,10439)";
    
    Statement st=connection.createStatement();
    int s=st.executeUpdate(query5);
    System.out.println(s);
    return s;
    
}
public  int insertvalueInshippers() throws SQLException, ClassNotFoundException 

{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/w3schools", "root", "root");
	System.out.println("Get connection Establish");
    String query6 = "insert into shippers (ShipperID,ShipperName) values (4,'krishna')";
    Statement st=connection.createStatement();
    int s=st.executeUpdate(query6);
    System.out.println(s);
    return s;
    
}
public  int insertvalueInproducts() throws SQLException, ClassNotFoundException 

{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/w3schools", "root", "root");
	System.out.println("Get connection Establish");
    String query7 = "insert into products (ProductId,ProductName) values (78,'bbbbb')";
    Statement st=connection.createStatement();
    int s=st.executeUpdate(query7);
    System.out.println(s);
    return s;
    
}
	public static void main (String[]args) throws ClassNotFoundException, SQLException {
		
		St_Database d=new St_Database();
		
		int a=d.insertvalueIncustomers();
		System.out.println(a);
		
		int b=d.insertvalueInemployees();
		System.out.println(b);
		
		int c=d.insertvalueIncategories();
		System.out.println(c);
		
		int e=d.insertvalueInproducts();
		System.out.println(d);
		
		int f=d.insertvalueInshippers();
		System.out.println(e);
		
		int g=d.insertvalueInorders();
		System.out.println(f);
		
		int h=d.insertvalueInorder_details();
		System.out.println(g);
	
		
	}
}