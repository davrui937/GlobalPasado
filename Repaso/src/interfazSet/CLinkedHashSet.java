package interfazSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class CLinkedHashSet {

	public static void main(String[] args) {

		LinkedHashSet<Persona> hs = new LinkedHashSet<Persona>();

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
	public static void imprimirColeccion(LinkedHashSet colec) {

		if (colec.isEmpty())
			System.out.println("Coleccion vacia");
		else {
			Iterator it = colec.iterator();
			while (it.hasNext())
				System.out.println(it.next());
		}
	}

}
