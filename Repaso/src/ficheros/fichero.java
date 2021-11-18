package ficheros;

import java.io.File;
import java.util.Scanner;

public class fichero {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String entrada = "";
		File fich1 = new File("");

		do {
			System.out.print("Inserta el directorio que quieres ver: ");
			entrada = teclado.nextLine();

			fich1 = new File(entrada);

		} while (!fich1.isDirectory());

		File[] lista = fich1.listFiles();

		for (int i = 0; i < lista.length; i++) {

			if (((File) lista[i]).isDirectory()) {

				System.out.print(lista[i].getName() + "\tEs un directorio\n");
			} else
				System.out.print(lista[i].getName() + "\tEs un archivo\n");

		}

	}

}
