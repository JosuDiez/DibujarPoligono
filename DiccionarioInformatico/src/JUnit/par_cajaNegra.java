package JUnit;

import java.util.Scanner;

public class par_cajaNegra {

	

	public static void main(String[] args) {

	
	System.out.println("Introduce un numero");	
	Scanner teclado = new Scanner(System.in);
	int num = teclado.nextInt();
	teclado.close();
	
	
	boolean comprobar = par(num);
	
	if (comprobar) {
		System.out.println("CORRECTO");
	} else {
		System.out.println("INCORRECTO");
	}

	}
	
	public static boolean par  (int n) {
	 boolean cadena = false;
	
	if (n >= 1000 && n <=2000 && n % 2 == 0) {
		cadena = true;
	}
	
	return cadena;
		
}
		
		
		
	

}
