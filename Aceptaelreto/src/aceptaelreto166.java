import java.util.Scanner;

public class aceptaelreto166 {

public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int num1 = 0 ;
	int num2 = 0;
	
	System.out.println("Introduce un canal");
	num1=teclado.nextInt();
	
	System.out.println("Introduce otro canal");
	num2=teclado.nextInt();
		
	if (num1<num2) {
		int aux=0;
		num1=aux;
		num1=num2;
		num2=aux;
	}
	
	int aux1=(99-num1)+num2;
	int aux2=num1-num2;
	
	if (aux1<aux2) {
		System.out.println(aux1);
	}
	else {
		System.out.println(aux2);
	}
	
}
}