package ejercicioavion;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class MainAvion {

	public static void main(String[] args) {

		Avion avion = new Avion();
		
		avion.setTipoAvion("Boeing 747");
		
		ArrayList<Maleta> maletas = new ArrayList<Maleta>();
		registrarMaleta(maletas, 20, "Facturada");
		registrarMaleta(maletas, 3.5, "Equipaje de mano");
		
		ArrayList<Pasajeros> listaPasajeros = new ArrayList<Pasajeros>();
		registrarPasajero(listaPasajeros, "Juan García", "7394057E", "679157358", maletas);
		avion.setListaPasajeros(listaPasajeros);
		
		ArrayList<Asientos> listaAsientos = new ArrayList<Asientos>();
		elegirAsiento(listaAsientos, "Primera clase", "3", "C");
		asignarAsiento(listaPasajeros.get(0), listaAsientos.get(0));
		avion.setListaAsientos(listaAsientos);
		
		System.out.println(avion.contarMaletas());
		System.out.println(avion.contarMaletasTipo("Facturada"));		
	}
	public static void registrarMaleta(ArrayList<Maleta> maletas, double peso, String tipo) {
		Maleta maleta = new Maleta(); 
		maleta.setPeso(peso);
		maleta.setTipoMaleta(tipo);
		maletas.add(maleta);
	}
	
	public static void registrarPasajero(ArrayList<Pasajeros> listaPasajeros, String nombre, String dni, String telefono, ArrayList<Maleta> maletas) {
		Pasajeros pasajero = new Pasajeros(); 
		pasajero.setNombre(nombre);		
		pasajero.setDni(dni);
		pasajero.setTelefono(telefono);
		pasajero.setMaleta(maletas);
		listaPasajeros.add(pasajero); 
	}
	public static void elegirAsiento(ArrayList<Asientos> listaAsientos, String tipoAsiento, String fila, String posicion) {
		Asientos asiento = new Asientos(); 
		asiento.setTipoAsiento(tipoAsiento);
		asiento.setFila(fila);
		asiento.setPosicion(posicion);
		listaAsientos.add(asiento);
	}
	public static void asignarAsiento(Pasajeros pasajero, Asientos asiento) {
		asiento.setPasajero(pasajero);
		
	}
	

}
