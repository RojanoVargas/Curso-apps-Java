package libro;

import java.util.ArrayList;
import java.util.Scanner;

public class MainLibreria {

	public static void main(String[] args) {
		Libreria libreria1 = new Libreria();
	
		ArrayList<Libro> listaLibros = new ArrayList<Libro>();
		libreria1.setListaLibros(listaLibros);
		
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		do {opcion = mostrarMenu(sc);
			if(opcion == 1) {
				String isbn = leerDato("ISBN", sc);
				String titulo = leerDato("Título", sc);
				String editorial = leerDato("Editorial", sc);
				Autor autor = leerDatoAutor(sc);
				Libro libro = new Libro(isbn, titulo, editorial, autor);
				libreria1.getListaLibros().add(libro);
				
			}else if(opcion == 2) {
				int i = 1;
				for(Libro lib : libreria1.getListaLibros()) {
 					System.out.print(" " + i + " ");
					System.out.println(lib);
 					i++;
				}
			}else if(opcion == 3) {
				Libro lib = mostrarMenu2(sc, listaLibros);
				if (lib == null) {
					System.out.println("El libro no existe, bro");
				}else {
				System.out.println(lib);
				}
//			}else if(opcion == 4) {
//				System.out.println("Introduzca una editorial para buscar el libro");
//				String editorial = sc.nextLine();
//				ArrayList<Libro> listalibrosEditorial = lib.busquedaEditorial(editorial);
//				libreria(listaLibrosEditorial);	
			}else if(opcion == 5) {
				System.out.println("Introduzca un nombre para buscar el autor");
				String nombre = sc.nextLine();
				ArrayList<Autor> listaAutores = lib.busquedaAutorPorNombre(nombre);
				System.out.println(listaAutores);	
			}
				
		}while(opcion != 0);
		if (opcion == 0) {
			System.out.println("Venga, adiós");
		}
		
	}

	public static int mostrarMenu(Scanner sc) {
		System.out.println("1 - Alta libro");
		System.out.println("2 - Listar libros");
		System.out.println("3 - Buscar libro por isbn");
		System.out.println("4 - Buscar libro por editorial");
		System.out.println("5 - Buscar autor por nombre");
		System.out.println("0 - Salir del programa");
		
		String sOpcion = sc.nextLine();//leo en formato String
		int iOpcion = Integer.parseInt(sOpcion);//convierto el tipo string a entero
		return iOpcion;
	}
	
	public static Libro mostrarMenu2(Scanner sc, ArrayList<Libro> listaLibros) {
		
		System.out.println("Introduzca ISBN");
		String scanner = sc.nextLine();
		for (Libro lib : listaLibros) {
			if (scanner.equalsIgnoreCase(lib.getIsbn())) {
				return lib;
			}	
		}
		return null;
	}
	
	public ArrayList <Libro> busquedaEditorial(String editorial){
		ArrayList <Libro> listaLibrosEditorial = new ArrayList<Libro>();
		for (Libro lib : listaLibrosEditorial) {
			if(lib.getEditorial().equalsIgnoreCase(editorial)) {
				listaLibrosEditorial.add(lib);
			}
		}
		return listaLibrosEditorial;
	}
	
	public ArrayList <Autor> busquedaLibroPorNombreAutor(String nombre){
		ArrayList <Autor> listaLibrosPorAutor = new ArrayList<Libro>();
		for (Libro lib : listaLibros) {
			if(lib.getAutor().getNombre().equalsIgnoreCase(nombre)) {
				listaLibrosPorAutor.add(lib.getAutor());
			}
		}
		return listaLibrosPorAutor;
	}
	
	public static String leerDato(String dato, Scanner sc) {
		System.out.println("Introduzca " + dato);
		String valor = sc.nextLine();//leo en formato String
		return valor;
	}
	public static Autor leerDatoAutor(Scanner sc) {
		String nombreAutor = leerDato(" nombre autor ", sc);
		System.out.println("Introduzca apellidos autor ");
		String apellidosAutor = sc.nextLine(); //leo en formato String
		System.out.println("Introduzca fecha autor ");
		String fechaAutor = sc.nextLine(); //leo en formato String
		int iFechaAutor = Integer.parseInt(fechaAutor);
		
		Autor autor = new Autor();
		autor.setNombre(nombreAutor);
		autor.setApellidos(apellidosAutor);
		autor.setNacimiento(iFechaAutor);
		
		return autor;
	}
}
