package ejercicioavion;

import java.util.ArrayList;

public class Avion {
	
	private ArrayList<Pasajeros> listaPasajeros; 
	private String tipoAvion; 
	private ArrayList<Asientos> listaAsientos;
	
	//----- GETTERS AND SETTERS -----
	
	public ArrayList<Pasajeros> getListaPasajeros() {
		return listaPasajeros;
	}
	public void setListaPasajeros(ArrayList<Pasajeros> listaPasajeros) {
		this.listaPasajeros = listaPasajeros;
	}
	public String getTipoAvion() {
		return tipoAvion;
	}
	public void setTipoAvion(String tipoAvion) {
		this.tipoAvion = tipoAvion;
	}
	public ArrayList<Asientos> getListaAsientos() {
		return listaAsientos;
	}
	public void setListaAsientos(ArrayList<Asientos> listaAsientos) {
		this.listaAsientos = listaAsientos;
	}
	
	//----------- CONTAR MALETAS ------------
	
	public int contarMaletas() {
		listaPasajeros.size();
		int numMaletas=0;
		for(Pasajeros valor: listaPasajeros) {
			int numero = valor.maletas.size();
			numMaletas = numMaletas + numero;
		}
		return numMaletas;
	}
	public int contarMaletasTipo(String tipo) {
		int contadorMaletas=0;
		for(Pasajeros valor: listaPasajeros) {
			for (Maleta maleta : valor.maletas) {
				if (maleta.getTipoMaleta().equalsIgnoreCase(tipo)) {
					contadorMaletas++;
				}
			}
		}
		return contadorMaletas;
	}
	
	
	@Override
	public String toString() {
		return "Tipo de avión: "+tipoAvion+"\nAsignación de asientos: "+listaAsientos+".";
	}
	
	
	
}
