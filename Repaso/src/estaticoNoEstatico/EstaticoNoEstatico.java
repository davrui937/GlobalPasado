package estaticoNoEstatico;

public class EstaticoNoEstatico {
	
	public static final String contanteEstatica="ConstanteEstatica";
	public final String contanteNoEstatica="ConstanteNoEstatica";
	
	public static String variableEstatica="VariableEstatica";
	
	
	public static void mostrarEstatico() {
		System.out.println("Estatico");
	}

	public void mostrarNoEstatico() {
			System.out.println("No Estatico");
	}
	
}
