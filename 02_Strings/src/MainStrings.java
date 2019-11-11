
public class MainStrings {

	public static void main(String[] args) {

		// Las cadenas en java no son primitivos
		// son objetos

		String cadena = "Harry Potter";
		String cadena2 = "Hermione";
		String cadena3 = "Ron Weasley";

		String valor = "Homer";
		String valor2 = "Homer";

		// Para comparar strings SIEMPRE el método equals
		if (valor.equals(valor2)) {
			System.out.println("Los nombres son iguales");
		}

		String valor3 = "homer";
		if (valor.equals(valor3)) {								//Es case sensitive
			System.out.println("Los nombres son iguales");
		}

		if (valor.equalsIgnoreCase(valor3)) {					//No distingue mayúsculas o minúsculas
			System.out.println("Los nombres son iguales");
		}
		
					
		String frase="Homer se comió un pollo";					//El string contiene otro string
		if(frase.contains("Homer")) {
			System.out.println("Sí existe Homer");
		}else {
			System.out.println("No existe Homer");
		}
		
		String mayusculas = frase.toUpperCase();
		System.out.println(mayusculas);
		
		
		
		//valor inicial puede marcarse con = ""
		//equals con funciona con primitivos, porque un objeto tiene comportamiento y atributos
		
		//buscar java api 8 string, y salen todos
		
		System.out.println(frase.endsWith("pollo")); 			//true o false
		
		String subcadena=frase.substring(0,5);					//el rango de substring no incluye el último valor (0, n-1)
		System.out.println(subcadena);
		String subcadena2=frase.substring(0,6).substring(0,3); 	//se pueden concatenar métodos, iguales o no 
		String subcadena3=frase.substring(0,5).toUpperCase();		
		System.out.println(frase.length());  					//cuántos caracteres tiene
		
		
		
	}

}
