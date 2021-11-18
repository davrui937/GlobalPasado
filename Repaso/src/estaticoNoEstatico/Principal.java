package estaticoNoEstatico;

public class Principal {
	
public static void main(String[] args) {
	
	EstaticoNoEstatico.mostrarEstatico();
	
	EstaticoNoEstatico obj = new EstaticoNoEstatico();
	
	obj.mostrarNoEstatico();
		
	System.out.println(EstaticoNoEstatico.contanteEstatica);
	System.out.println(obj.contanteNoEstatica);
	
	EstaticoNoEstatico.variableEstatica="pepe";

	
	}
}