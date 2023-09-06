package aula.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static void main(String [] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String user = "root";
		String senha = "root";
		String url = "jdbc:mysql://127.0.0.1:3306/javaCRUD";
		
		try {
			Class.forName(driver);
			Connection con = null;
			
			con = (Connection) DriverManager.getConnection(url,user,senha);
			
			System.out.println("conexão funcionando");
		}
		catch (ClassNotFoundException ex) {
			System.err.print(ex.getMessage());
		}
		catch(SQLException e) {
			System.err.print(e.getMessage());
		}
	}
}
