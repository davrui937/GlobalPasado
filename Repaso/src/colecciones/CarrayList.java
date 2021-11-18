package colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
COLECCIONES

//Collection
add -> sirve para añadir un objeto tendra como parametro el objeto a añadir
remove ->  elimina el objeto que yo le indique
size -> numero de objetos de la coleccion
isEmpty ->  nos dice si la coleccion esta vacia
contains ->  booleano que nos indica si el objeto existe o no
clear -> nos elimina todos los objetos de la coleccion deja la coleccion vacia
addAll -> añade una coleccion a otra
removeAll -> elimina los objetos de una coleccion la cual le hemos dado por parametro
retainAll-> contrario que remove elimina los objetos que no esten en esa coleccion
containsAll -> devuelve un booleano indicando si la coleccion contiene todos los objetos que le pasamos por parametro
toArray -> convierte la coleccion en un array de objetos
iterator -> sirve para recorrer la coleccion

//Iterator
next() -> //nos da el siguiente objeto de la coleccion
hasNext() -> //nos indica si tiene mas objetos a recorrer dentro de la coleccion
remove() ->  borra el ultimo objeto devuelto por el next()

//list
add(indice,objeto) -> Inserta en el indice que yo le indico
remove(indice) -> borra el objeto del indice que yo le indico
set(indice,objeto) -> inserta moviendo los ya existentes
get(indice) -> obtengo el objeto que tenga ese indice
indexOf(objeto) -> devuelve la posicion que ocupa ese objeto
lastIndexOf(objeto) -> nos devuelve la posicion que ocupa ese objeto, empieza por el final
addAll(indice,coleccion) -> inserta en ese indice pero inserta una coleccion entera
listIterator(objeto) -> obtiene un objeto y nos permite recorrer la coleccion
listIterator(indice) -> obtiene un objeto y nos permite recorrer la coleccion desde el indice que le indico
subList(desde,hasta) -> genera una subcoleccion con los elementos que esten desde yo indique hasta que yo indique.

//LinkedList
getFirst() -> devuelve el primer numero de la lista
getLast() -> devuelve el ultimo numero de la lista
addFirst(objeto) -> añade un objeto al principio de la lista
addLast() -> añade al ultimo elemento de la lista
removeFirst() -> borra el primer elemento de la lista
removeLast() -> borra el ultimo elemento de la lista






//Colecciones que admiten duplicados

//Set
HashSet permite implementar colecciones sin elementos duplicados
Redefinir el método equals

equals -> a

private static void ejercicioimprimir(List a) {
      int i=0;
      if(a.isEmpty())
          System.out.println("esta vacia");
      else
          for (i=a.size()-1;i>=0;i--)
              System.out.println(a.get(i));             
  }
*/

public class CarrayList {
	
	public static void main(String[] args) {
	
		ArrayList al = new ArrayList();
		
		al.add("amarillo");
		al.add(1);
		al.add(false);
		
		if((boolean)al.get(2))
			System.out.println("Verdadero");
		else 
			System.out.println("Falso");
		
		ArrayList <String> als = new ArrayList<String>();
		als.add("amarillo");
		als.add("rojo");
		als.add("verde");
		als.add("naranja");
		System.out.println(als.size());
		
		imprimirColeccion(als);
		
		ArrayList <Integer> ali = new ArrayList<Integer>();
		ali.add(1);
		ali.add(2);

	}
	
	public static void imprimirColeccion(List<String> als) {
				
		/*for (int i = 0; i < als.size(); i++) {
			System.out.println(als.get(i));
		}*/
		
				Iterator it = als.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

}