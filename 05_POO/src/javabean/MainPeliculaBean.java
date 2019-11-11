package javabean;

import java.util.ArrayList;
import java.util.Scanner;
import javabean.PeliculaBean;


public class MainPeliculaBean {
	public static void main(String[] args) {

		int opcion=0;
		ArrayList<PeliculaBean> listaPeliculas = new ArrayList<PeliculaBean>();
		
		
		do {
			opcion = mostrarMenu();
			if (opcion==1) {
				System.out.println("Dar de alta una película");
				PeliculaBean peli = new PeliculaBean();
				altaPelicula(peli);
				listaPeliculas.add(peli);
				
			}else if (opcion ==2) {
				System.out.println("Listar películas: \n");
				listarPeliculas(listaPeliculas);
				
				
			}else if (opcion==0) {
				System.out.println("Salir del programa");
			}
			
			
		}while(opcion!=0);
		System.out.println("¡Hasta la próxima!");
	
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
	public static void altaPelicula(PeliculaBean peli) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca el título: ");
		peli.setTitulo(sc.nextLine());
		System.out.println("Introduzca el género: ");
		peli.setGenero(sc.nextLine());
		System.out.println("Introduzca el director: ");
		peli.setDirector(sc.nextLine());
		System.out.println("Introduzca una puntuación: ");
		String puntuacion=sc.nextLine();
		peli.setPuntuacion(Double.parseDouble(puntuacion));
		
		System.out.println("---------------------------------\n");
	}
	public static void listarPeliculas(ArrayList<PeliculaBean> listaPeliculas) {
		for (PeliculaBean valor : listaPeliculas) {
			System.out.println("Título: "+valor.getTitulo());
			System.out.println("Director: "+valor.getDirector());
			System.out.println("Género: "+valor.getGenero());
			System.out.println("Puntuación: "+valor.getPuntuacion());
			System.out.println("------------------------------");
		}
	}
}
