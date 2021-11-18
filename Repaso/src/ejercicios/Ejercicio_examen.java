package ejercicios;

import java.io.*;


public class Ejercicio_examen {
	
		public static void main(String[] arg) {

			File archivo = null;
			FileReader reader = null;
			BufferedReader buffer = null;
			
			File fichero = new File("FicheroRandom.dat");
			
			RandomAccessFile file;
			try {
				file = new RandomAccessFile(fichero, "rw");
			

			try {
				archivo = new File("C:\\Users\\AlumnoM\\Desktop\\FicheroV.txt");
				reader = new FileReader(archivo);
				buffer = new BufferedReader(reader);

				String linea="";
				while ((linea = buffer.readLine()) != null) {
					//System.out.println(linea);
					for (int i = 0; i < 20; i++)
						if (i < linea.length())
							file.writeChar(linea.charAt(i));
						else
							file.writeChar(' ');
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
	
				try {
					file.close();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
			
			
			file = new RandomAccessFile(fichero, "rw");

			try {
				while (file.getFilePointer() != file.length()) {
					for (int i = 0; i < 20; i++)
						System.out.print(file.readChar());
					System.out.println();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		}
	}
}
		
