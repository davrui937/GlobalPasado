package interfazSet;

import java.util.HashSet;
import java.util.Iterator;

public class CHashSet {

	public static void main(String[] args) {

		HashSet<Persona> hs = new HashSet<Persona>();

		Persona p1 = new Persona("Nombre1", 10);

		hs.add(p1);
		hs.add(new Persona("Nombre2", 15));
		hs.add(new Persona("Nombre3", 15));
		hs.add(new Persona("Nombre2", 20));
		hs.add(new Persona("Nombre2", 15));

		imprimirColeccion(hs);
		System.out.println(p1.cont);

	}

	@SuppressWarnings("rawtypes")
	public static void imprimirColeccion(HashSet colec) {

		if (colec.isEmpty())
			System.out.println("Coleccion vacia");
		else {
			Iterator it = colec.iterator();
			while (it.hasNext())
				System.out.println(it.next());
		}
	}

}
