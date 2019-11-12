package libro;
//String titulo, String isbn, String editorial, Autor autor 

public class Libro {
	private String isbn;
	private String titulo;
	private String editorial;
	private Autor autor;
	
	
	
	public Libro(String isbn, String titulo, String editorial, Autor autor) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.editorial = editorial;
		this.autor = autor;
	}
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
	
	@Override
	public String toString() {
		return "El libro tiene los siguientes datos: ISBN=" + isbn + ", título=" + titulo + ", editorial=" + editorial + ", autor=" + autor;
		//int i = 0;
		//return "El libro " + i + " tiene los siguientes datos: ISBN=" + isbn + ", título=" + titulo + ", editorial=" + editorial + ", autor=" + autor;
//		i=i++; esto no va, porque es un array dinámico, no hay un orden
	}
}
