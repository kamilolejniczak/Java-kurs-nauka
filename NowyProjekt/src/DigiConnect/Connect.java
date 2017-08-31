package DigiConnect;

import java.sql.*;

public class Connect {

	final static String connectionURL = "jdbc:mysql://localhost:3306/skoczkowie";
	final static String name = "root";
	final static String pass = "kamil2017";
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		
			//rejestracja klasy sterownika
			Class.forName("com.mysql.jdbc.Driver");
			//utworzenie po³¹czenia
			Connection con = DriverManager.getConnection(connectionURL, name, pass);
			//utworzenie wyra¿enia SQL
			Statement stmt = con.createStatement();
			//wykonanie zapytania
			ResultSet rs = stmt.executeQuery("Select * from zawodnicy");
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(3)+" \n\t\t\t"+rs.getString(4));
			}
			//zamkniecie polaczenia
			con.close();
		
	}
	}
		
		
	


