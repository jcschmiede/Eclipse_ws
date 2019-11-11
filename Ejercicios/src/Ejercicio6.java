import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int contador = 0;
		int i = 0;
		int j = 0;

		System.out.println("Inserte un número: ");
		numero = sc.nextInt();

		for (i = 2; i <= numero; i++) {
			for (j = 2; j <= i - 1; j++){
				if (i % j == 0) {
					contador++;
				}
			}
			if (contador == 0) {
				System.out.println(i);
			}
			contador=0;
		}
		sc.close();
	}
}