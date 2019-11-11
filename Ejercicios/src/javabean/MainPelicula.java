package javabean;
// HECHO POR FÉLIX. HACERLO YO:

import java.util.ArrayList;
import java.util.Scanner;

public class MainPelicula {
	
	public static void main(String[] args) {
		Pelicula p1 = new Pelicula("dfasf", "dfasfddd", "dfasdf", 10);
		System.out.println(p1);
		ArrayList<Pelicula> listaPeliculas = new ArrayList<Pelicula>();
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		do {
			opcion = mostrarMenu(sc);
			if(opcion == 1) {
				String titulo = leerDato("Titulo", sc);
				String director = leerDato("Director", sc);
				String genero = leerDato("Genero", sc);
				String puntacion = leerDato("Puntuacion", sc);
				double dPuntuacion = Double.parseDouble(puntacion);
				
				Pelicula peli = new Pelicula(titulo, director, genero, dPuntuacion);
				listaPeliculas.add(peli);
			}else if(opcion == 2) {
				for(Pelicula p : listaPeliculas) {
					System.out.println(p);
				}
			}
		}while(opcion != 0);
	}
	
	public static int mostrarMenu(Scanner sc) {
		System.out.println("1 - Alta pelicula");
		System.out.println("2 - Listar peliculas");
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
}