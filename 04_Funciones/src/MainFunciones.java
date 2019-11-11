import java.util.Scanner;

/*
 * ---------------------CONCEPTO---------------------------------------------
 * Funciones o metodos son cajas que no tenemos porque saber
 * como hacen una funcionalidad (caja negra) pero si 
 * como usarla
 * 
 * ---------------------PARÁMETROS DE ENTRADA Y DE SALIDA--------------------
 * 
 * Basicamente una función tiene  de 0 a N parametros de entrada
 * y de 0 a 1 parametros de salida
 * 
 * Cuando usamos una funcion tenemos que saber cuantos
 * parametros de entrada tiene y si tiene parametros de salida
 * 
 * 
 * Por ejemplo:
 * 	System.out.println("Ola ke ase");
 *  La funcion println tiene un parametro de entrada y 0 de salida
 *  
 *  int i = sc.nextInt();
 *  La funcion nextInt tiene 0 parametros de entrada y 1 de salida (el de salida lo guarda, en este caso, en la variable i
 *  
 */
public class MainFunciones {
	// Esta tambien es un funcion, una funcion muy especial porque
	// es la funcion main, es decir, el punto de entrada de nuestra
	// aplicacion
	// Esta funcion tiene un parametro de entrada que es un array de Strings
	// y no tiene parametros de salida (porque pone void)
	public static void main(String[] args) {
		System.out.println("Inicio del programa");
		mostrarMenu();
		System.out.println("Hago cosas....");
		mostrarMenu();
		imprimirNombrePepe();
		imprimirNombreManolo();
		imprimirNombre("felix");
		imprimirNombre("Laura");
		// imprimirNombre();Esto daria error poque necesita un parametro de entrada
		imprimirNombreApellidos("felix", "de pablo");
		imprimirNombreApellidos("Ana", "Garcia");
		System.out.println(leerNumero());
		int n1 = leerNumero();
		int n2 = leerNumero();
		int resultado = n1 + n2;
		System.out.println(resultado);
		System.out.println("Fin del programa");
	}

	// podemos crear todas las funciones que queramos, las funciones
	// se crean dentro de la clase, pero nunca dentro de otra funcion
	// no importa la posicion de donde se crea la funcion, simplemente
	// tiene que estar dentro de la clase
	// por ejemplo
	// primero se pone la visibilidad, en este caso "public" y luego
	// la palabra static
	// segundo se pone el valor de retorno (si tuviera)
	// en este caso "void" porque no tiene valores de retornoç
	// tercero se pone el nombre de la funcion
	// y en cuarto lugar se ponen los parametros de entrada
	// en caso de tenerlos, los paremtros de entrada van entre
	// parentesis y si tiene varios, van separados por ","
	// En este caso, no tenemos ni parametros de entrada ni
	// tenemos parametros de salida
	public static void mostrarMenu() {
		System.out.println("1 - Crear Persona");
		System.out.println("2 - Borrar Persona");
		System.out.println("3 - Modificar Persona");
		System.out.println("4 - Buscar Persona");
		System.out.println("0 - Salir del programa");
	}

	// En esta funcion quiero imprimir de manera bonita un nombre
	// por pantalla
	public static void imprimirNombrePepe() {
		System.out.println("pepe");
	}

	public static void imprimirNombreManolo() {
		System.out.println("manolo");
	}

	public static void imprimirNombre(String nombre) {
		System.out.println("*********************");
		System.out.println("****** " + nombre + " ******");
		System.out.println("*********************");
	}

	public static void imprimirNombreApellidos(String nombre, String apellidos) {
		System.out.println("*********************");
		System.out.println("****** " + nombre + " ******");
		System.out.println("****** " + apellidos + " ******");
		System.out.println("*********************");
	}

	// funcion que lee un numero por pantalla devuleve dicho numero
	public static int leerNumero() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		// el ciclo de vida de esta variable empieza en la sigiente
		// linea y muera cuando salga del bloque de la función "{}"
		int numero = sc.nextInt();
		return numero;// devuelve el valor a quien haya llamada a la función
	}
}
