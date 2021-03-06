
/*
(clave,valor)

get(clave)
put(clave,valor)
remove(clave)
containsKey(clave) --> nos da un booleano
containsValue(valor) --> nos da un booleano
putAll(mapa) --> a?ade otro mapa entero
clear() --> borra todos los elementos del mapa
keySet(clave) --> obtiene un objeto set a partir de los valores del mapa
values() --> nos da los valores en una coleccion
size() --> nos devuelve en numero de parejas de valores que tenemos 

*/

package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CMap {
	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Uno");
		hm.put(2, "Dos");
		hm.put(3, "Tres");
		hm.put(4, "Cuatro");

		// System.out.println(hm);
		imprimirColeccion(hm);
		imprimirColeccion2(hm);
		imprimirMap1(hm);
	}

	public static void imprimirColeccion(HashMap colec) {

		if (colec.isEmpty())
			System.out.println("Coleccion vacia");
		else {
			Iterator<Integer> it = colec.keySet().iterator();

			while (it.hasNext()) {
				Object key = it.next();
				System.out.println("La clave es " + key + " y el valor es " + colec.get(key));
			}
		}
	}

	public static void imprimirColeccion2(Map<Integer, String> colec) {

		if (colec.isEmpty())
			System.out.println("Coleccion vacia");
		else {
			for (Integer key : colec.keySet())
				System.out.println(key + ":" + colec.get(key));

		}
	}

	public static void imprimirMap1(Map<Integer, String> mapa) {

		if (mapa.isEmpty())
			System.out.println("Coleccion vacia");
		else {
			Iterator it = mapa.entrySet().iterator();
			while (it.hasNext())
				System.out.println(it.next());

		}
	}

}
