import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {

		int numero = 0;
		int factorial = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un número: ");
		numero = sc.nextInt();
		while (numero < 0) {
			System.out.println("Introduzca un número no negativo");
			numero = sc.nextInt();
		}
		for (int i = 2; i <= numero; i++) {
			factorial = factorial * i;
		}
		System.out.println("El factorial de " + numero + " es " + factorial);
		sc.close();
	}
}
