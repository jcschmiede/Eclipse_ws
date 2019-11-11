//Las clases en Java son moldes para la creación de objetos.
//Son planos en los que Java se va a basar para la creación de los objetos. 



public class Persona {

	//Una clase (en cualquier lenguaje) tiene atributos y métodos. 
	//Los atributos en Java se suelen poner dentro de la clase y al principio de ella
	
	public String nombre; 
	public double peso; 
	public int edad; 
	
	public Persona() {				//constructor por defecto
		
	}
	
	public Persona(String nombre, double peso, int edad) {
		super();								//Invoca al padre de este objeto
		this.nombre = nombre;					//this es una referencia al propio objeto
		this.peso = peso;						//el que tiene this es el nombre del atributo; el otro del parámetro por el que llamas
		this.edad = edad;
	}

	/*public Persona (String nombre1, double peso1, int edad1) {
		
		nombre=nombre1; 
		peso=peso1;
		edad=edad1;
	}	*/
	
}
