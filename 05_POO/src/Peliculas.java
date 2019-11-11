//Programa que muestre un menú
//1.- Alta película
//2.- Listar película (mostrar todas las peliculas)
//0.- Salir del programa

//que tenga título, genero, director, puntuacion; 
public class Peliculas {

	public String titulo;
	public String genero; 
	public String director; 
	public double puntuacion; 
	
	public Peliculas() {

	}

	@Override
	public String toString() {
		return "Peliculas [Título=" + titulo + ", Género=" + genero + ", Director=" + director + ", Puntuación="
				+ puntuacion + "]";
	}
	
	
}
