
public class Variables {

	public static void main(String[] args) {
		
		//En java tenemos dos tipos de variables
		
		//Tenemos variables primitivas ---MIN�S---------------------------------------------------------------
		//Tenemos variables de referencia
		
		//Las siguientes ser�an variables primitivas
		//int long double boolean
		
		
		int numero=0;     	//variable num�rica entera
		System.out.println("El n�mero es " +numero);
		
		long numeroLargo = 67884;  //lower camel case //n�meros m�s grandes
		double numeroReal = 34.567;					  // n�meros decimales
		boolean cierto = true;							
		cierto= false; 
		System.out.println(numeroLargo);
		System.out.println(numeroReal);
		
		//El otro tipo son las variables de referencia o solo referencias---MAY�S-----------------------------
		
		String nombre= "Pepe";		//las referencias son de clase, por eso lleva mayuscula
									//se declara la variable, y se le asigna valor
		System.out.println("El nombre es "+nombre);
		nombre = "Laura";			//aqui no se declara, solo se asigna
		System.out.println("El nombre es "+nombre);	
		
		double numero2= 10;
		double numero3=numero2;
		
		double numero4=56;
		//int numero5=numero4;		//int es mas peque�o que double, por eso no deja copiar el valor
		
		int numero6=(int)numero4;	//como el valor cabe, as� lo intenta meter
	}

}
