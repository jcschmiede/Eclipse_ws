package ejercicioavion;

import java.util.ArrayList;

public class Pasajeros {

	private String nombre; 
	private String dni; 
	private String telefono; 
	ArrayList<Maleta> maletas;
	
	//----- GETTERS AND SETTERS -----
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public ArrayList<Maleta> getMaleta() {
		return maletas;
	}
	public void setMaleta(ArrayList<Maleta> maletas) {
		this.maletas = maletas;
	}
	
	@Override
	public String toString() {
		return "Pasajeros [nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono + ", maleta=" + maletas + "]";
	} 
	
	
	
}
