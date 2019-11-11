import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {

		ArrayList<String> nombres = new ArrayList<String>();
		String nombre = "";
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Introduzca un nombre: ");
		nombre = sc.nextLine();
		if(!nombre.equalsIgnoreCase("fin")) {
			nombres.add(nombre);
		}
		}while (!nombre.equalsIgnoreCase("fin"));
		System.out.println("Programa finalizado");
		for(String valor : nombres) {
			System.out.println(valor);
		}
		sc.close();
	}
}
