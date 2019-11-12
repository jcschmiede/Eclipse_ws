package libreria;

//Libros y autores. Pueden darse de alta los libros, buscarlos por ISBN, y listar todos los libros que tenemos. 
//Lo que quiero guardar es el ISBN, el título, la editorial, el autor y su fecha de nacimiento

public class Libro {

	private String isbn;
	private String titulo; 
	private String editorial; 
	private Autor autor;
	
	
	//----- CONSTRUCTORES ------
	
	public Libro() {
		
	}

	public Libro(String isbn, String titulo, String editorial, Autor autor) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.editorial = editorial;
		this.autor = autor;
	}
	
	//----- GETTERS AND SETTERS ------

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	
	//----- TO STRING -----
	
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", editorial=" + editorial + ", autor=" + autor + "]";
	} 
	
	
	
}
