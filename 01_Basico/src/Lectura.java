import java.util.Scanner;

public class Lectura {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // objetos tienen: atributos y funcionalidades (acciones)
		int numero = 0;
		System.out.println("Introduzca un número: ");
		// leer numero
		numero = sc.nextInt();
		// Aquí el programa se quedará parado a la espera de que el usuario introduzca
		// el número y pulse enter

		for (int i = 1; i <= numero; i++) {
			System.out.println(i);
		}

//------------------ADVERTENCIA: CLASE SCANNER-----------------------

		// Cuando estás escaneando un entero, y luego quieres escanear un String, Java
		// falla porque espera un entero;
		// por tanto, cuando quieres cambiar de tipo de variable, se debe llamar de
		// nuevo
		// Así, en la línea anterior a: variable = sc.nextLoQueSea(); , sería
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
