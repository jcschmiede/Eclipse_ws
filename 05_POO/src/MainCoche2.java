import java.util.ArrayList;
import java.util.Scanner;

//Pedir al usuario tres coches (con su estado), guardarlos en un array de coches, y pedirselos al array

public class MainCoche2 {

	public static void main(String[] args) {
		ArrayList<Coche> arrayCoches = new ArrayList<Coche>();
		for (int i = 0; i < 3; i++) {
			Coche coche = new Coche();
			meterDatos(coche, arrayCoches);
		}
		for (Coche valor : arrayCoches) {
			datosCoche(valor);
		}
	}

	public static void datosCoche(Coche coche) {

		System.out.println("\n----------------\n");
		System.out.println("Marca: " + coche.marca);
		System.out.println("Modelo: " + coche.modelo);
		System.out.println("Matrícula: " + coche.matricula);
		if (coche.esNuevo) {
			System.out.println("Estado: Nuevo");
		} else {
			System.out.println("Estado: Segunda mano");
		}
	}

	public static void meterDatos(Coche coche, ArrayList<Coche> array) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los datos del coche: ");
		System.out.println("Marca: ");
		coche.marca = sc.nextLine();
		System.out.println("Modelo: ");
		coche.modelo = sc.nextLine();
		System.out.println("Matrícula: ");
		coche.matricula = sc.nextLine();
		array.add(coche);
	}
}
