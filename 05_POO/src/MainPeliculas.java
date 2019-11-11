import java.util.ArrayList;
import java.util.Scanner;

//Programa que muestre un menú
//1.- Alta película
//2.- Listar película (mostrar todas las peliculas)
//0.- Salir del programa

//que tenga título, genero, director, puntuacion; 

public class MainPeliculas {
	public static void main(String[] args) {
		
		int opcion=0;
		Scanner sc = new Scanner(System.in);
		ArrayList<Peliculas> listaPeliculas = new ArrayList<Peliculas>();
		
		do {
			opcion=mostrarMenu();
			if(opcion==1) {
				System.out.println("Dar de alta una película");
				Peliculas peli = new Peliculas();
				altaPelicula(peli);
				listaPeliculas.add(peli);
			}else if(opcion==2) {
				System.out.println("Listar películas: \n");
				listarPeliculas(listaPeliculas);
			}
			else if (opcion==0) {
				System.out.println("Salir del programa");
			}
		}while(opcion!=0);
		System.out.println("Fin del programa");
		
		
	}
	public static int mostrarMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Elija una opción: ");
		System.out.println("1.- Alta película");
		System.out.println("2.- Listar película");
		System.out.println("0.- Salir del programa");
		int opcion = sc.nextInt();
		return opcion;
	}
	public static void altaPelicula(Peliculas peli) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca el título: ");
		peli.titulo = sc.nextLine();
		System.out.println("Introduzca el género: ");
		peli.genero = sc.nextLine();
		System.out.println("Introduzca el director: ");
		peli.director=sc.nextLine();
		System.out.println("Introduzca una puntuación: ");
		String puntuacion=sc.nextLine();
		peli.puntuacion=Double.parseDouble(puntuacion);
		
		System.out.println("---------------------------------\n");
	}
	public static void listarPeliculas(ArrayList<Peliculas> listaPeliculas) {
		for (Peliculas valor : listaPeliculas) {
			System.out.println("Título: "+valor.titulo);
			System.out.println("Director: "+valor.director);
			System.out.println("Género: "+valor.genero);
			System.out.println("Puntuación: "+valor.puntuacion);
			System.out.println("------------------------------");
		}
	}
}

