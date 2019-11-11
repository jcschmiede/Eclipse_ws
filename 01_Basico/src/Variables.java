
public class Variables {

	public static void main(String[] args) {
		
		//En java tenemos dos tipos de variables
		
		//Tenemos variables primitivas ---MINÚS---------------------------------------------------------------
		//Tenemos variables de referencia
		
		//Las siguientes serían variables primitivas
		//int long double boolean
		
		
		int numero=0;     	//variable numérica entera
		System.out.println("El número es " +numero);
		
		long numeroLargo = 67884;  //lower camel case //números más grandes
		double numeroReal = 34.567;					  // números decimales
		boolean cierto = true;							
		cierto= false; 
		System.out.println(numeroLargo);
		System.out.println(numeroReal);
		
		//El otro tipo son las variables de referencia o solo referencias---MAYÚS-----------------------------
		
		String nombre= "Pepe";		//las referencias son de clase, por eso lleva mayuscula
									//se declara la variable, y se le asigna valor
		System.out.println("El nombre es "+nombre);
		nombre = "Laura";			//aqui no se declara, solo se asigna
		System.out.println("El nombre es "+nombre);	
		
		double numero2= 10;
		double numero3=numero2;
		
		double numero4=56;
		//int numero5=numero4;		//int es mas pequeño que double, por eso no deja copiar el valor
		
		int numero6=(int)numero4;	//como el valor cabe, así lo intenta meter
	}

}
