package libro;
//array de libros
import java.util.ArrayList;

public class Libreria {

	private ArrayList <Libro> listaLibros;

	public ArrayList<Libro> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(ArrayList<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}

	@Override
	public String toString() {
		return "Libreria [listaLibros=" + listaLibros + "]";
	}
}
