import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
	
		String nombre="";
		Scanner sc= new Scanner(System.in);
		ArrayList<String> nombres = new ArrayList<String>();
		
		System.out.println("Introduzca 10 nombres: ");
		for(int i=0; i<=9; i++) {
			nombre=sc.nextLine();
			nombres.add(nombre);
		}
		System.out.println("\n---Nombres en mayúsculas---\n");
		for (String valor : nombres) {
			System.out.println(valor.toUpperCase());
		}
		System.out.println("\n---Nombres en minúsculas---\n");
		for (String valor : nombres) {
			System.out.println(valor.toLowerCase());
		}
		sc.close();
	}

}
