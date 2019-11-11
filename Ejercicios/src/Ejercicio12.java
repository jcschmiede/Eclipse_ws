import java.util.Scanner;

public class Ejercicio12 {

	// Modificar el programa calculadora e intentar meter funciones allá donde se
	// crean necesarias

	public static void main(String[] args) {
		
		int opcion = 0;
		do {
			opcion = mostrarMenu(); 
			if (opcion == 0) {
				System.out.println("Ha elegido la opción salir");

			} else {
				System.out.println("Introduzca un número: ");
				double n1 = leerNumero();
				System.out.println("Introduzca otro número: ");
				double n2 = leerNumero();

				if (opcion == 1) {
					suma(n1, n2);

				} else if (opcion == 2) {
					resta(n1, n2);

				} else if (opcion == 3) {
					multiplicacion(n1, n2);

				} else if (opcion == 4) {
					division(n1, n2);
				}
			}
		} while (opcion != 0);
		System.out.println("Gracias por utilizar nuestro programa");
	}

	public static int mostrarMenu() {
		System.out.println("Elija una opción: ");
		System.out.println("1.- Sumar");
		System.out.println("2.- Restar");
		System.out.println("3.- Multiplicar");
		System.out.println("4.- Dividir");
		System.out.println("0.- Salir");
		Scanner sc = new Scanner(System.in);
		int opcion=sc.nextInt();
		return opcion; 
	}

	public static double suma(double n1, double n2) {
		System.out.println("El resultado es " + (n1 + n2));
		System.out.println("\n------------------------------------------\n");
		return n1 + n2;
	}

	public static double resta(double n1, double n2) {
		System.out.println("El resultado es " + (n1 - n2));
		System.out.println("\n------------------------------------------\n");
		return n1 - n2;
	}

	public static double multiplicacion(double n1, double n2) {
		System.out.println("El resultado es " + (n1 * n2));
		System.out.println("\n------------------------------------------\n");
		return n1 * n2;
	}

	public static double division(double n1, double n2) {

		System.out.println("El resultado es " + (n1 / n2));
		System.out.println("\n------------------------------------------\n");
		return n1 / n2;
	}

	public static double leerNumero() {
		Scanner sc = new Scanner(System.in);
		double numero = sc.nextDouble();
		return numero;
	}

}
