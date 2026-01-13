
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dynamic_class
{
public  int insertvalueIncustomers() throws SQLException, ClassNotFoundException 	
 {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/w3schools", "root", "root");
		
		System.out.println("Get connection Establish");
		
	  //  String query = "insert into customers (CustomerName,ContactName) values ('?','?')";
	    PreparedStatement pstmt = connection.prepareStatement("INSERT INTO customers (CustomerName, ContactName) VALUES (?, ?)");
	    pstmt.setString(1, "Cardinal");
	    pstmt.setString(2, "Tom B. Erichsen");
	     int s=  pstmt.executeUpdate();
	    return s; 
	}

     public  int insertvalueInemployees() throws SQLException, ClassNotFoundException 
    {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/w3schools", "root", "root");
	
	System.out.println("Get connection Establish");
  
	String query2 =  "insert into employees (LastName,FirstName) values (?,?)";
	
    PreparedStatement pstmt = connection.prepareStatement(query2);
    pstmt.setString(1, "Prachi");
    pstmt.setString(2, "Tiwari");
    
    int s=pstmt.executeUpdate();
    
    return s;  
}
     
public  int insertvalueIncategories() throws SQLException, ClassNotFoundException 
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/w3schools", "root", "root");
	
	
	System.out.println("Get connection Establish");
    
	String query3 = "insert into categories (CategoryName,Description) values (?,?)";
	
    PreparedStatement pstmt = connection.prepareStatement(query3);
    pstmt.setString(1, "Biscuits");
    pstmt.setString(2, "sweet");
    int s=pstmt.executeUpdate();
   // System.out.println(s);
    return s; 
}

public  int insertvalueInorder_details() throws SQLException, ClassNotFoundException 
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/w3schools", "root", "root");
	
	System.out.println("Get connection Establish");
	
    String query4 = "insert into order_details (Quantity,ProductID) values (?,?)";
   
    PreparedStatement pstmt = connection.prepareStatement(query4);
    pstmt.setString(1, "17");
    pstmt.setString(2, "171");
    
    int s=pstmt.executeUpdate();
    return s;   
}

public  int insertvalueInorders() throws SQLException, ClassNotFoundException 
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/w3schools", "root", "root");
	
	System.out.println("Get connection Establish");
	
	String query5 = "insert into orders (CustomerID,OrderID) values (?,?)";
    PreparedStatement pstmt = connection.prepareStatement(query5);
    pstmt.setString(1, "8888");
    pstmt.setString(2, "888");
    
    int s=pstmt.executeUpdate();
  //System.out.println(s);
    return s;   
}

public  int insertvalueInshippers() throws SQLException, ClassNotFoundException 
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/w3schools", "root", "root");
	
	System.out.println("Get connection Establish");
	
    String query6 = "insert into shippers (ShipperID,ShipperName) values (?,?)";
    
    PreparedStatement pstmt = connection.prepareStatement(query6);
    pstmt.setString(1, "8823");
    pstmt.setString(2, "pranav");
    
    int s=pstmt.executeUpdate();
    
  //  System.out.println(s);
    return s;   
}
public  int insertvalueInproducts() throws SQLException, ClassNotFoundException 
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/w3schools", "root", "root");
	
	System.out.println("Get connection Establish");
	
    String query7 = "insert into products (ProductId,ProductName) values (?,?)";
    
    PreparedStatement pstmt = connection.prepareStatement(query7);
    pstmt.setString(1, "8821");
    pstmt.setString(2, "bangles");
    
    int s=pstmt.executeUpdate();
    
   // System.out.println(s);
    return s;  
}
	public static void main (String[]args) throws ClassNotFoundException, SQLException {
		
		Dynamic_class d=new Dynamic_class();
		
		int a=d.insertvalueIncustomers();
		System.out.println(a);
		
		int b=d.insertvalueInemployees();
		System.out.println(b);
		
		int c=d.insertvalueIncategories();
		System.out.println(c);
		
		int e=d.insertvalueInproducts();
		System.out.println(e);
		
		int f=d.insertvalueInshippers();
		System.out.println(f);
		
		int g=d.insertvalueInorders();
		System.out.println(g);
		
		int h=d.insertvalueInorder_details();
		System.out.println(h);	
	}
}
