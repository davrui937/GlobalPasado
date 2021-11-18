import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {

public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		Scanner teclado = new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo?serverTimezone=UTC","root","afuera");
	
		Statement sentencia = conex.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		//resul.first() te posiciona en la primera fila
		//resul.previous() 
		//result.last() te posiciona en la ultima fila
		//result.beforeFirst()
		//result.afterLast()
		//result.getRow()
		
		
		//Insertar un departamento
		
		
		System.out.println("Inserta el id del nuevo departamento: ");
		String id = teclado.nextLine();
		
		String sql = String.format("select * from dptos where idD=%s",id);
		ResultSet resul = sentencia.executeQuery(sql);
		resul.first();
		if (resul.getRow()>0){
			System.out.println("Dpto existe");
		}else {

			System.out.println("Inserta el nombre del departamento: ");
			String nom = teclado.nextLine();
			
			System.out.println("Inserta la letra del departamento: ");
			String letra = teclado.nextLine();
			
			System.out.println("Inserta el numero doble del departamento: ");
			String numdoble = teclado.nextLine();
		
			
			sql=String.format(Locale.ROOT, "insert into dptos values (%s,'%s','%s','%s')",id,nom,letra,numdoble);
			int valor=sentencia.executeUpdate(sql);
			//sql="insert into dptos values ("+id+", '"+nom+"','"+letra+"','"+numdoble+"');";
			
			
			
			sql = "select * from dptos";
			resul = sentencia.executeQuery(sql);
			while(resul.next()) {
				System.out.printf("%d %s %s %.2f\n", resul.getInt(1), resul.getString(2),resul.getString(3),resul.getFloat(4));
			}
		}

		
	}

	}


