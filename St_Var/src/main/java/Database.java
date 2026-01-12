


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database 
{

	public static void main (String[]args) throws ClassNotFoundException, SQLException {
		
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/w3schools", "root", "root");
		System.out.println("Get connection Establish");
		
		
		Insert_1 i=new Insert_1();
		String a = Insert_1.q;
		
		System.out.println(a);
//		
//	   String a=i.insertvalueIncustomers();
//	   String b=i.insertvalueIncategories();
//	   String c=i.insertvalueInemployees();
//	   String d=i.insertvalueInorder_details();
//	  String e=i.insertvalueInorders();
//	   String f=i.insertvalueInproducts();
//	   String g=i.insertvalueInshippers();
//	   
    Statement st=connection.createStatement();
    int r= st.executeUpdate(a);
    System.out.println(r);
//		int rs=st.executeUpdate(a);
//		int rs2=st.executeUpdate(c);
//		int rs3=st.executeUpdate(d);
//		int rs4=st.executeUpdate(e);
//		int rs5=st.executeUpdate(f);
//		int rs6=st.executeUpdate(g);
//
//	
//	System.out.println("" + rs);
//	//System.out.println("" + rs1);
//	System.out.println("" + rs2);
//	System.out.println(" " + rs3);
//	System.out.println(" " + rs4);
//	System.out.println(" " + rs5);
//	System.out.println(" " + rs6);
	}
	}

