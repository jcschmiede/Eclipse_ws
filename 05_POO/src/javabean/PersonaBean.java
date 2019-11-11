package javabean;

public class PersonaBean {
	
	private String nombre; 
	private int edad; 
	private double peso;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		if (edad>=0) {						//ventajas del set
			this.edad = edad;
		}else {
			this.edad=0;
		}

	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	} 
	
	
}
