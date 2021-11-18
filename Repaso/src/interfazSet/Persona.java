package interfazSet;

public class Persona {

	String nombre = "";
	int edad = 0;
	int cont = 0;
	Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String toString() {
		return nombre + " " + edad;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Persona) {
			Persona p = (Persona) obj;			
			return p.nombre.equals(nombre) && p.edad == edad;
		} else
			return false;
	}

	public int hashCode() {
		return nombre.hashCode() + edad * 1000;
		
	}

}
