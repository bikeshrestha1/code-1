import java.sql.Connection;
import java.sql.DriverManager;

public class dbConnection {
	public static void main(String[] args){
		dbConnection db= new dbConnection();
		System.out.println(db.getConnection());
	}
		public Connection getConnection(){
			Connection conn=null;
	
		try{
				Class.forName("com.mysql.jdbc.driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/player","root","root");
				
				
			}catch(Exception e ){
				System.out.println(e);
			}
		return conn;
		}
}
