 package trycatch;

import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args) {
        
        int num=0;
        boolean error=false;
        Scanner teclado=new Scanner(System.in);
        do {
            error=false;
            System.out.println("Introduce el numero");
            
        try {
            
            num=Integer.parseInt(teclado.nextLine());
            
        }catch (NumberFormatException e) {
        	error=true;
            System.out.println("numero incorrecto");
        }catch (Exception e) {
            error=true;
            System.out.println("error desconocido avisar a info");
            System.out.println(e);
    }
    }while (error);
    
        System.out.println("numero introducido="+num);
        teclado.close();
}
}
