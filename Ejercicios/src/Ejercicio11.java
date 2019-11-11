
public class Ejercicio11 {
	public static void main(String[] args) {

//Funcion que imprima los atributos de una persona
//nombre, apellidos, edad y tel�fono; y los imprima en may�sculas y bonito
//Hacer tres o cuatro personas

		datosMayus("Juan", "Palomo", 53, "658496265");
		datosPersona("Jose", "P�rez", 40, "0675857155", false);
		datosMayus("Felix", "Rodr�guez", 23, "694747445");
		datosMinus("Rodrigo", "P�ez", 37, "674758555");
		datosPersona("Alba", "Torres", 23, "248952932", true);
		datosMinus("Paquita", "Cabeza", 86, "916843543");

	}

	public static void datosMayus(String nombre, String apellidos, int edad, String telefono) {

		System.out.println("Nombre: " + nombre.toUpperCase());
		System.out.println("Apellidos: " + apellidos.toUpperCase());
		System.out.println("Edad: " + edad);
		System.out.println("Tel�fono: " + telefono);
		System.out.println("----------------------------\n");
	}

	public static void datosMinus(String nombre, String apellidos, int edad, String telefono) {
		System.out.println("Nombre: " + nombre.toLowerCase());
		System.out.println("Apellidos: " + apellidos.toLowerCase());
		System.out.println("Edad: " + edad);
		System.out.println("Tel�fono: " + telefono);
		System.out.println("----------------------------\n");
	}

	public static void datosPersona(String nombre, String apellidos, int edad, String telefono, boolean mayusculas) {
		if (mayusculas) {
			datosMayus(nombre, apellidos, edad, telefono);
		}else {
			datosMinus(nombre, apellidos, edad, telefono);
		}
	}

}
