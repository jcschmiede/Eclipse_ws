
public class Coche {
	//clase coche, con atributos: matricula, marca, modelo y si es esNuevo o de segunda mano;
	//Crear tres objetos coche e imprimirlos por pantalla
	
	public String matricula; 
	public String marca; 
	public String modelo; 
	public boolean esNuevo; 
	
	
	//este es el constructor por defecto
	//se llaman igual que la clase
	//pero podemos tener todos los constructores que queramos
	public Coche() {
		super();
		//Si pongo aquí parámetros... (v. this();)
		this.matricula = ""; 
		this.marca = "";
		
	}
	public Coche(String matricula) {
		this(); //esto llama al constructor sin parámetros
		this.matricula = matricula;
	}
	
	public Coche(String matricula, String marca) {
		this.matricula=matricula;
		this.marca=marca;
	}
	public Coche(String matricula, String marca, String modelo, boolean esNuevo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.esNuevo = esNuevo;
	}
	
}
