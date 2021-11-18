package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ficherosJava {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		File fich = new File("C:\\FichTexto.txt");

		File[] lista = fich.listFiles();

		FileReader ficR = new FileReader(fich);
		
		BufferedReader fichBR2 = new BufferedReader(new FileReader(fich));// no permite acentos

		//String linea = buffer.readLine();

		 
		
		 

		// BufferedReader = readLine
		// BufferedWriter = write() y newLine()

																													// acentos
		
		
		}
	}

