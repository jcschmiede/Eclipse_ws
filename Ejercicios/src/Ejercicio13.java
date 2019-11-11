import java.util.ArrayList;

public class Ejercicio13 {
	public static void main(String[] args) {
		ArrayList<String> coches = new ArrayList<String>();
		coches.add("Volvo");
		coches.add("BMW");
		coches.add("Ford");
		coches.add("Mazda");
		imprimirArray(coches);
	}

	public static void imprimirArray(ArrayList<String> array) {
		for (String valor : array) {
			System.out.println(valor);
		}
	}
}
