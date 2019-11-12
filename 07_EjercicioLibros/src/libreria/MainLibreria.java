package libreria;

import java.util.ArrayList;
import java.util.Scanner;

public class MainLibreria {
	public static void main(String[] args) {

		ArrayList<Libro> listaLibros = new ArrayList<Libro>();
		int opcion = 0;

		do {
			opcion = mostrarMenu();
			
			if (opcion == 1) {
				System.out.println("Dar de alta un libro");
				altaLibro(listaLibros);
				System.out.println("\n--------------------------------\n");
			}
			else if(opcion == 2){
				System.out.println("Buscar libro por ISBN");
				System.out.println("Introduzca el ISBN del libro: ");
				Libro libro = buscarLibro(listaLibros);
				System.out.println(libro);
				System.out.println("\n--------------------------------\n");
			}
			else if (opcion == 3) {
				System.out.println("");
				listarLibros(listaLibros);
				System.out.println("\n--------------------------------\n");
			}
			else if(opcion==0) {
				System.out.println("Salir del programa");
			}
		} while (opcion != 0);
		
	}

	public static int mostrarMenu() {
		System.out.println("Elija una opción: ");
		System.out.println("1.- Dar de alta un libro");
		System.out.println("2.- Buscar libro por ISBN");
		System.out.println("3.- Mostrar todos los libros");
		System.out.println("0.- Salir");
		System.out.println("\n--------------------------------\n");

		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public static void altaLibro(ArrayList<Libro> listaLibros) {
		Scanner sc = new Scanner(System.in);
		Libro libro = new Libro();
		Autor autor = new Autor();
		
		System.out.println("Introduzca el título del libro: ");
		libro.setTitulo(sc.nextLine());
		System.out.println("Introduzca la editorial: ");
		libro.setEditorial(sc.nextLine());
		System.out.println("Introduzca el autor: ");
		System.out.println("\tNombre del autor: ");
		autor.setNombre(sc.nextLine());
		System.out.println("\tApellido(s) del autor: ");
		autor.setApellidos(sc.nextLine());
		System.out.println("\tAño de nacimiento del autor: ");
		String nacimiento = sc.nextLine();
		if (!nacimiento.equals("")) {
			autor.setNacimiento(Integer.parseInt(nacimiento));
		}
		else {
			System.out.println("Sin datos");
		}
		libro.setAutor(autor);
		System.out.println("Introduzca el ISBN: ");
		libro.setIsbn(sc.nextLine());
		listaLibros.add(libro);
	}
	public static Libro buscarLibro(ArrayList<Libro> listaLibros) {
		Scanner sc = new Scanner(System.in);
		String isbn = sc.nextLine();
		for(Libro libro : listaLibros) {
			if (libro.getIsbn().equalsIgnoreCase(isbn)) {
				return libro;
			}
		}
		return null;
	}
	public static void listarLibros(ArrayList<Libro> listaLibros) {
		for(Libro libro : listaLibros) {
			System.out.println(libro);
		}
	}
}
