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
				String titulo = leerDato("T�tulo", sc);
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
				Libro libr = mostrarMenu2(sc, listaLibros);
				if (libr == null) {
					System.out.println("El libro no existe, bro");
				}else {
				System.out.println(libr);
				}
			}
				
		}while(opcion != 0);
		if (opcion == 0) {
			System.out.println("Venga, adi�s");
		}
		
	}

	public static int mostrarMenu(Scanner sc) {
		System.out.println("1 - Alta libro");
		System.out.println("2 - Listar libros");
		System.out.println("3 - Buscar libro por isbn");
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
