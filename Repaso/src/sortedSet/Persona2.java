package sortedSet;

public class Persona2 implements Comparable<Persona2> {

	String nombre = "";
	int edad = 0;

	Persona2(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String toString() {
		return nombre + " " + edad;
	}

	public int compareTo(Persona2 obj) {
		int res = 0;
		res = nombre.compareTo(obj.nombre);
		if (res == 0)
			res = edad - obj.edad;

		return res;

	}

}
