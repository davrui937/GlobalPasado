package colecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class Listas {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("amarillo");
		ll.add("rojo");
		ll.add("verde");
		ll.add("naranja");

		imprimirColeccion(ll);
		
	}
	public static void imprimirColeccion(LinkedList ll) {
		/*System.out.println(ll.size());
		//Collections.reverse(ll);
		for (int i =ll.size()-1; i >= 0 ; i--) {
			System.out.println(ll.get(i));
		}*/
		ListIterator it = ll.listIterator(ll.size());
		
		
		
}
}