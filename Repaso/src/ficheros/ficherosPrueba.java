package ficheros;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ficherosPrueba {

	public static void main(String[] args) throws IOException {

		File fich = new File("FichTexto.txt");

		FileWriter fic = new FileWriter(fich, false); // por defecto esta en false, al ponerlo en true no sobrescribimos
														// el fichero

		fic.write('a');

		fic.append('b');

		fic.write("Esto es un fichero de texto");

		fic.close();

		FileReader ficR = new FileReader(fich);

		/*
		 * car=fic.read();
		 * 
		 * while (car1!=-1) System.out.println((char)car);
		 */

		// BufferedReader = readLine
		// BufferedWriter = write() y newLine()

		BufferedReader fichBR = new BufferedReader(new InputStreamReader(new FileInputStream(fich), "ISO-8859-1")); // permite
																													// acentos
		BufferedReader fichBR2 = new BufferedReader(new FileReader(fich));// no permite acentos

		// Ficheros binarios
		/*
		 * DataOutputStream DataInputStream
		 * 
		 * writeXXXX --> writeInt(), writeBoolean() readXXXX --> readInt, readBoolean
		 * 
		 * writeUTF readUTF
		 * 
		 * DataOutputStram fichDOS = new Data .. (new FileOutputStream(fich));
		 * DataInputStram fichDOS = new Data .. (new FileInputStream(fich));
		 */

		DataOutputStream dos = new DataOutputStream(new FileOutputStream(fich, false));
		dos.writeInt(5);
		dos.writeUTF("Hola");
		dos.close();

		DataInputStream dis = new DataInputStream(new FileInputStream(fich));

		int num = 0;
		String alfa = "";
		try {
			while (true) {
				num = dis.readInt();
				alfa = dis.readUTF();
				System.out.println(num + " " + alfa);
			}
		} catch (Exception e) {
		}
		;

	}
}