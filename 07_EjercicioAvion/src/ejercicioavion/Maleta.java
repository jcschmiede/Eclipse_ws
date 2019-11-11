package ejercicioavion;

public class Maleta {

	private double peso; 
	private String tipoMaleta;
	
	//----- GETTERS AND SETTERS -----
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getTipoMaleta() {
		return tipoMaleta;
	}
	public void setTipoMaleta(String tipoMaleta) {
		this.tipoMaleta = tipoMaleta;
	}
	
	@Override
	public String toString() {
		return "Maleta [peso=" + peso + ", tipoMaleta=" + tipoMaleta + "]";
	}
	
	
	
}
