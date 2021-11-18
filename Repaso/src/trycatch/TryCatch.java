package trycatch;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num=0;
		boolean error=false;
		
		do {	
			error=false;
			System.out.println("Introduce un numero:");

		try {			
			num=Integer.parseInt(teclado.nextLine());					
			
		}catch (NumberFormatException e) {
			error=true;
			System.out.println("Dato incorrecto");			
		}catch (Exception e) {
			error=true;
			System.out.println("Error desconocido");
			System.out.println(e);
		}
			
		}while(error);
		
			System.out.println("Numero introducido: "+num);
			teclado.close();
			
		}
		
	}