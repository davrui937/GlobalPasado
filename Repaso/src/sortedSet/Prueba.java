package sortedSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Prueba {
	public static void main(String[] args) {

		TreeSet<String> hs = new TreeSet<String>();

		hs.add("Carlos");
		hs.add("Barbera");
		hs.add("Andres");

		imprimirColeccion(hs);

	}

	@SuppressWarnings("rawtypes")
	public static void imprimirColeccion(TreeSet colec) {

		if (colec.isEmpty())
			System.out.println("Coleccion vacia");
		else {
			Iterator it = colec.iterator();
			while (it.hasNext())
				System.out.println(it.next());
		}
	}
}