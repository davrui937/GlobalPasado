package ficheros;

/*
double 8 bytes
float 4 bytes
int 4 bytes
char 2 bytes
boolean 1 bytes
String longitud String*2


4+4+2+(15*2)=40bytes
*/

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FicherosIII {

	public static void main(String[] args) throws IOException {

		File fichero = new File("Fichero.dat");

		String dato = "Prueba";

		RandomAccessFile file = new RandomAccessFile(fichero, "rw");

		file.writeInt(1);
		file.writeInt(2);
		file.writeBoolean(true);

		for (int i = 0; i < 15; i++)
			if (i < dato.length())
				file.writeChar(dato.charAt(i));
			else
				file.writeChar(' ');

		file.writeInt(1);
		file.writeInt(2);
		file.writeBoolean(true);

		String dato1 = "Prueba1";
		for (int i = 0; i < 15; i++)
			if (i < dato1.length())
				file.writeChar(dato1.charAt(i));
			else
				file.writeChar(' ');

		file.close();

		// getFilePointer()
		// file.length()
		// readInt

		// Leer un archivo Random
		file = new RandomAccessFile(fichero, "rw");

		while (file.getFilePointer() != file.length()) {
			System.out.print(file.readInt() + " " + file.readInt() + " " + file.readBoolean());
			System.out.print(" ");
			for (int i = 0; i < 15; i++)
				System.out.print(file.readChar());
			System.out.println();

		}

		file.seek(39);

		while (file.getFilePointer() != file.length()) {
			System.out.print(file.readInt() + " " + file.readInt() + " " + file.readBoolean());
			System.out.print(" ");
			for (int i = 0; i < 15; i++)
				System.out.print(file.readChar());
			System.out.println();

		}

		file.seek(2*39);

		while (file.getFilePointer() != file.length()) {
			System.out.print(file.readInt() + " " + file.readInt() + " " + file.readBoolean());
			System.out.print(" ");
			for (int i = 0; i < 15; i++)
				System.out.print(file.readChar());
			System.out.println();

		}

		file.seek(39);

		file.writeInt(10);
		file.writeInt(20);
		file.writeBoolean(false);
		String dato2 = "Prueba2";
		for (int i = 0; i < 15; i++)
			if (i < dato2.length())
				file.writeChar(dato2.charAt(i));
			else
				file.writeChar(' ');

		
		file.seek(1*39);

		while (file.getFilePointer() != file.length()) {
			System.out.print(file.readInt() + " " + file.readInt() + " " + file.readBoolean());
			System.out.print(" ");
			for (int i = 0; i < 15; i++)
				System.out.print(file.readChar());
			System.out.println();

		}
		file.close();

	}
}
