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
				Autor autor = leerDatoAutor( sc);
				
				Libro libro = new Libro(isbn, titulo, editorial, autor);
				libreria1.getListaLibros().add(libro);
			}else if(opcion == 2) {
				for(Libro p : libreria1.getListaLibros()) {
					System.out.println(p);
				}
			}else if(opcion == 3) {
				System.out.println("meter aquí función que lo haga");
				if(
						
						Libro p : libreria1.getListaLibros()) {
					System.out.println(p);
				}
				
			}
		}while(opcion != 0);
		if (opcion == 0) {
			System.out.println(listaLibros);
			System.out.println("Venga, adiós");
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
