import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Clase02 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo?serverTimezone=UTC","root","afuera");
	
		Statement sentencia = conex.createStatement();
		
		String sql = "select * from dptos";
		
		ResultSet resul = sentencia.executeQuery(sql);
		
		while(resul.next()) {
			System.out.printf("%d %s %s %.2f\n", resul.getInt(1), resul.getString(2),resul.getString(3),resul.getFloat(4));
		}
		
		
		sql="update dptos set bloque='G' where nom='contabilidad'";
		int valor=sentencia.executeUpdate(sql);
		
		System.out.println("\nCambio la G por una E\n");
		
		sql = "select * from dptos";
		resul = sentencia.executeQuery(sql);
		while(resul.next()) {
			System.out.printf("%d %s %s %.2f\n", resul.getInt(1), resul.getString(2),resul.getString(3),resul.getFloat(4));
		}
		
		//sentencia.execute(sql) --> boolean
		// true --> Consulta 	 sentencia.getResultSet()
		// false --> Actualizacion	 sentencia.getUpdateCount() 
		
		
		if(sentencia.execute(sql)) {
			resul= sentencia.getResultSet();
		}else {
			valor=sentencia.getUpdateCount();
		}
		
		
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