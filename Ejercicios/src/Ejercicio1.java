import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero = 0;
	

		do {
			System.out.println("Inserte un número: ");
			numero = sc.nextInt();

			for (int i = 1; i <= numero; i++) {
				System.out.println(i);
			}
			do {
				System.out.println("¿Desea introducir más números? 0=si/1=no");
//-----WARNING-----
			
			//Al cambiar de números a texto, a veces hay que redefinir el scanner para que no se raye
			
			numero= sc.nextInt();									

			}while(numero<0 || numero>1);
		} while (numero==0);
		System.out.println("Adiós");
		sc.close();

	}

}
