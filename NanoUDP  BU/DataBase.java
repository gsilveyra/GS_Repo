import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBase extends Thread {
public  PreparedStatement stmt=null;
public  Connection con=null;	
public void run(){
// Step 1: "Load" the JDBC driver
try {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	} catch (ClassNotFoundException e) {
		System.out.println("ERROR CONEXION CON BASE DE DATOS");
		//e.printStackTrace();
	} 
	     // Step 2: Establish the connection to the database 
	     String userName = "lojackhq\\gsilveyra";
	     String password = "qwerty00.";
	     String url = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=Testing";
	     try {
			con = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
  }
}



