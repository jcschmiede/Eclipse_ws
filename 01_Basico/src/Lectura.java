import java.util.Scanner;

public class Lectura {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // objetos tienen: atributos y funcionalidades (acciones)
		int numero = 0;
		System.out.println("Introduzca un n�mero: ");
		// leer numero
		numero = sc.nextInt();
		// Aqu� el programa se quedar� parado a la espera de que el usuario introduzca
		// el n�mero y pulse enter

		for (int i = 1; i <= numero; i++) {
			System.out.println(i);
		}

//------------------ADVERTENCIA: CLASE SCANNER-----------------------

		// Cuando est�s escaneando un entero, y luego quieres escanear un String, Java
		// falla porque espera un entero;
		// por tanto, cuando quieres cambiar de tipo de variable, se debe llamar de
		// nuevo
		// As�, en la l�nea anterior a: variable = sc.nextLoQueSea(); , ser�a
		/*
		 * 
		 * sc.nextLoQueSea();
		 * int entero = sc.nextInt();
		 * sc.nextLine(); String cadena = sc.nextLine();
		 * 
		 */

		sc.close();
	}

}
