//mostrar un menú que tenga 
//1 - alta película
//2 - listar películas
//0 - salir del programa
// titulo, genero, director, puntuar(opcional)
// HECHO POR FÉLIX. HACERLO YO:
public class Pelicula {
	
	public String titulo;
	public String director;
	public String genero;
	public double puntuacion;
	
	public Pelicula(String titulo, String director, String genero, double puntuacion) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.genero = genero;
		this.puntuacion = puntuacion;
	}

	
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", director=" + director + ", genero=" + genero + ", puntuacion="
				+ puntuacion + "]";
	}

}