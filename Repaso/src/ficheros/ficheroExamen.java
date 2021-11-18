package ficheros;

import java.io.*;

class ficheroExamen {
	public static void main(String[] arg) {

		File archivo = null;
		FileReader reader = null;
		BufferedReader buffer = null;
		int contv = 0;
		int contc = 0;

		try {
			archivo = new File("C:\\Users\\AlumnoM\\Desktop\\FicheroV.txt");
			reader = new FileReader(archivo);
			buffer = new BufferedReader(reader);

			String linea="";
			while ((linea = buffer.readLine()) != null) {
				
				System.out.println(linea);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}


	}
}
