/*first() -> primer elemento de la coleccion
last() -> ultimo elemento de la coleccion 
headSet(obj) -> obtiene los elementos menores que el objeto indicado
tailSet(obj) -> obtiene los elementos mayores e igual que el objeto indicado
subSet(obj1,obj2) -> obtiene un rango mayor o igual que el obj1 y menor que el obj2

*/
package sortedSet;

import java.util.Iterator;
import java.util.TreeSet;

public class CTreeSet {
	public static void main(String[] args) {

		TreeSet<Persona2> hs = new TreeSet<Persona2>();

		Persona2 p1 = new Persona2("Nombre1", 10);
		Persona2 p2 = new Persona2("Nombre2", 15);

		hs.add(p1);
		hs.add(p2);
		hs.add(new Persona2("Nombre2", 15));
		hs.add(new Persona2("Nombre3", 15));
		hs.add(new Persona2("Nombre2", 20));

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
