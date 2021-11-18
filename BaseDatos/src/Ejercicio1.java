import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner teclado= new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo?serverTimezone=UTC","root","afuera");
	
		Statement sentencia = conex.createStatement();
		
		String sql = "select * from dptos";
		
		ResultSet resul = sentencia.executeQuery(sql);
		
		while(resul.next()) {
			System.out.printf("%d %s %s %.2f\n", resul.getInt(1), resul.getString(2),resul.getString(3),resul.getFloat(4));
		}
		
		System.out.println("Que bloque quieres borrar: ");
		char blok =teclado.nextLine().charAt(0);
		
		sql="delete from dptos where bloque= '"+blok+"'";
		int valor=sentencia.executeUpdate(sql);
		
		System.out.println("\nCambio la G por una E\n");
		
		sql = "select * from dptos";
		resul = sentencia.executeQuery(sql);
		while(resul.next()) {
			System.out.printf("%d %s %s %.2f\n", resul.getInt(1), resul.getString(2),resul.getString(3),resul.getFloat(4));
		}
		
		resul.close();
		sentencia.close();
		conex.close();
	}
	

}
	