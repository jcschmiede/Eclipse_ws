package javabean;

public class PeliculaBean {


		private String titulo;
		private String genero; 
		private String director; 
		private double puntuacion;
		
		
		public PeliculaBean() {
			super();
		}


		public PeliculaBean(String titulo, String genero, String director, double puntuacion) {
			super();
			this.titulo = titulo;
			this.genero = genero;
			this.director = director;
			this.puntuacion = puntuacion;
		}


		public String getTitulo() {
			return titulo;
		}


		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}


		public String getGenero() {
			return genero;
		}


		public void setGenero(String genero) {
			this.genero = genero;
		}


		public String getDirector() {
			return director;
		}


		public void setDirector(String director) {
			this.director = director;
		}


		public double getPuntuacion() {
			return puntuacion;
		}


		public void setPuntuacion(double puntuacion) {
			this.puntuacion = puntuacion;
		} 
		
		

	
}
