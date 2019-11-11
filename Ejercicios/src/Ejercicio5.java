import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero = 0;
		System.out.println("Introduzca un número: ");
		numero = sc.nextInt();

		System.out.printf("El cuadrado de %i es %i", numero, numero*numero);
		sc.close();
	}
}
