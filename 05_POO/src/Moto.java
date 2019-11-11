
public class Moto {
	public String matricula;
	public String marca;
	public int posicion;
	public int velocidad;
	private int velocidadInicial; 	//esto debería no poder cambiarse, así que podemos modificar la visibilidad (private)
									//private es que solo se puede acceder desde la propia clase
	public Moto() {
		super();
	}

	public Moto(String matricula, String marca, int posicion, int velocidad) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.posicion = posicion;
		this.velocidad = velocidad;
		this.velocidadInicial=velocidad;
	}

	@Override
	public String toString() {
		return "Moto [matricula=" + matricula + ", marca=" + marca + ", posicion=" + posicion + ", velocidad="
				+ velocidad + "]";
	}

	public int acelerar(boolean adelante) {
		if (adelante) {
			this.posicion = this.posicion + this.velocidad;// es igual que poner posicion = posicion + velocidad
		} else {
			this.posicion = this.posicion - this.velocidad;
		}
		return this.posicion;
	}
	/*
	 * public int acelerarAtras() { this.posicion = this.posicion - this.velocidad;
	 * //es igual que poner posicion = posicion - velocidad return this.posicion; }
	 */
	public void irAPosicionDeSalida() {
		this.posicion=0;
	}
	public void meterseEnBoxes() {
		this.velocidad = velocidadInicial; 	
	}
	
	public int getVelocidadInicial(){			//metodo get para que puedan ver la velocidadInicial (privada) fuera de la clase
		return this.velocidadInicial;			//retorna el valor de la variable privada 
	}
	
	
	
}
