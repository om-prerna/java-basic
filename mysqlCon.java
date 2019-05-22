import java.sql.*;
class mysqlCon{

public static void main(String[] args){

//intialize the url, username and password

String url = "jdbc:mysql://localhost:3306/todo";
String username = "root";
String password = "12345678";

try{

	//load and register the driver
	Class.forName("com.mysql.jdbc.Driver");
	
	//create a connection with DB
	Connection con = DriverManager.getConnection(url, username, password);
	
	//create a statement
	Statement st = con.createStatement();

	//execute the query
	String sql = "insert into todo1 values(1, 'abc', 'abc description')";
	int r = st.executeUpdate(sql);
	if(r == 1)
	System.out.println("query executed successfully:"+ sql);
	else
	System.out.println("query failed");
   }
	catch(Exception e)
       {   	 		
	System.out.println(e);
       }
  }
}


