import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {

//Pedimos al usuario que introduzca diez nombres y, una vez introducidos todos, se los mostramos en may�sculas y luego en min�scula.
	
		String nombre="";
		Scanner sc= new Scanner(System.in);
		String[] nombres = new String[10];
		
		System.out.println("Introduzca 10 nombres");
		for(int i=0; i<=9; i++) {
			nombre=sc.nextLine();
			nombres[i]=nombre;
		}
		System.out.println("\n---Nombres en may�sculas---\n");
		for (String valor : nombres) {
			System.out.println(valor.toUpperCase());
		}
		System.out.println("\n---Nombres en min�sculas---\n");
		for (String valor : nombres) {
			System.out.println(valor.toLowerCase());
		}
		
	}
}
