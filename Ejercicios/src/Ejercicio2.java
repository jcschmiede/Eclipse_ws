import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int numeroMayor = 0;
		do {
			System.out.println("Inserte un número: ");
			numero = sc.nextInt();

			if (numero > numeroMayor) {
				numeroMayor = numero;
			}
		} while (numero > 0);
		System.out.println("El numero mayor es: " + numeroMayor);
		sc.close();
	}
}
