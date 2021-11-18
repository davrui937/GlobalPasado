import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Clase01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo?serverTimezone=UTC","root","afuera");
	
		Statement sentencia = conex.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
		
		//result.previous() 
		//result.last()
		//result.beforeFirst()
		//result.afterLast()
		//result.getRow()
		
		
		//Insertar un departamento
		
		
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
		
		resul.close();
		sentencia.close();
		conex.close();
	}
	

}
