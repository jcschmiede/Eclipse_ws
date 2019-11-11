import java.util.ArrayList;

public class MainArrays {

	public static void main(String[] args) {

		// Java tiene arrays est�ticos y din�micos

//---------------ESTÁTICOS-----------------

		int[] arrayNumeros = new int[10];
		arrayNumeros[0] = 23;
		arrayNumeros[4] = 56;
		System.out.println(arrayNumeros[0]);
		System.out.println(arrayNumeros.length);
		for (int i = 0; i <= arrayNumeros.length - 1; i++) { // el n�mero final es length-1 porque empieza a contar en 0
			System.out.println("Valor de la posición " + i + " es " + arrayNumeros[i]);
		}

		// si ponemos una posici�n del array que no existe, java te para el programa
		// instant�neamente

		// System.out.println(arrayNumeros[50]);
		// System.out.println("esto se ejecuta despu�s"); //no ejecuta esto porque hizo
		// un error de ejecuci�n (vs. error de compilación)

//-------------DINÁMICOS----------------

		// son objetos en java

		ArrayList<String> listaStrings = new ArrayList<String>();
		listaStrings.add(0, "Harry"); // primer valor, posici�n; segundo valor, el valor
		System.out.println(listaStrings.get(0));
		listaStrings.add("Hermione"); // si no le metes posición, la a�ade a la siguiente
		System.out.println(listaStrings.get(1));

		for (int j = 0; j < listaStrings.size(); j++) {				//no se utiliza mucho 
			; // para listas dinámicas, usamos size
			System.out.println(listaStrings.get(j));
		}
		
		//lo que se utiliza para recorrer un array es un for each
		//sirve para est�ticos o din�micos
		
		for(String valor : listaStrings) {
			System.out.println(valor);
		}
		
		int arrayEnterosDirectamente[] = {1,2,3};
		for(int i : arrayEnterosDirectamente){
			System.out.println("El valor es: " + i);
		}
	}
}
