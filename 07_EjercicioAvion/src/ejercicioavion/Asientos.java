package ejercicioavion;

public class Asientos {

	private String tipoAsiento; 
	private String fila; 
	private String posicion; 
	private Pasajeros pasajero;
	
	//----- GETTERS AND SETTERS -----
	
	public String getTipoAsiento() {
		return tipoAsiento;
	}
	public void setTipoAsiento(String tipoAsiento) {
		this.tipoAsiento = tipoAsiento;
	}
	public String getFila() {
		return fila;
	}
	public void setFila(String fila) {
		this.fila = fila;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public Pasajeros getPasajero() {
		return pasajero;
	}
	public void setPasajero(Pasajeros pasajero) {
		this.pasajero = pasajero;
	}
	
	
	@Override
	public String toString() {
		return "Asientos [tipoAsiento=" + tipoAsiento + ", fila=" + fila + ", posicion=" + posicion + ", pasajero="
				+ pasajero + "]";
	} 
	
	
	
}
