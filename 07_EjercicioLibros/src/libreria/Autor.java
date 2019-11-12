package libreria;

public class Autor {

	private String nombre; 
	private String apellidos; 
	private int nacimiento;
	
	
	//----- CONSTRUCTORES ------
	
	public Autor() {
		
	}
	
	
	
	public Autor(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}



	public Autor(String nombre, String apellidos, int nacimiento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nacimiento = nacimiento;
	}
	
	//----- GETTERS AND SETTERS ------
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(int nacimiento) {
		this.nacimiento = nacimiento;
	}
	
	//----- TO STRING -----
	
	@Override
	public String toString() {
		return "Autor: " +apellidos+", "+nombre+"\nNacimiento: "+nacimiento;
	}
	
	
	
}
