import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		do {
			System.out.println("Elija una opción: ");
			System.out.println("1.- Sumar");
			System.out.println("2.- Restar");
			System.out.println("3.- Multiplicar");
			System.out.println("4.- Dividir");
			System.out.println("0.- Salir");

			opcion = sc.nextInt();

			if (opcion == 1) {
				System.out.println("Ha elegido la opción sumar");
				System.out.println("Elija dos números");
				numero1 = sc.nextInt();
				numero2 = sc.nextInt();
				System.out.println("El resultado es: " + (numero1 + numero2));
			} else if (opcion == 2) {
				System.out.println("Ha elegido la opción restar");
				System.out.println("Elija dos números");
				numero1 = sc.nextInt();
				numero2 = sc.nextInt();
				System.out.println("El resultado es: " + (numero1 - numero2));
			} else if (opcion == 3) {
				System.out.println("Ha elegido la opción multiplicar");
				System.out.println("Elija dos números");
				numero1 = sc.nextInt();
				numero2 = sc.nextInt();
				System.out.println("El resultado es: " + (numero1 * numero2));
			} else if (opcion == 4) {
				System.out.println("Ha elegido la opción dividir");
				System.out.println("Elija dos números");
				double numero3 = sc.nextInt();
				double numero4 = sc.nextInt();
				if (numero4 == 0) {
					System.out.println("No se puede dividir por 0");
				} else {
					System.out.println("El resultado es: " + numero3/numero4);
				}
			} else if (opcion == 0) {
				System.out.println("Ha elegido la opción salir");
			} else {
				System.out.println("Por favor, introduzca una opción correcta");
			}

		} while (opcion != 0);
		System.out.println("Gracias por utilizar nuestro programa");
		sc.close();
	}
}
