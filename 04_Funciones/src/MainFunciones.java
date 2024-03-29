import java.util.Scanner;

/* Funciones o m�todos son cajas qeu te tenemos por qu� saber
 * c�mo hacen una funcionalidad (caja negra), pero s� uusarla.
 * B�sicamente una funci�n tiene de 0 a N par�metros de entrada
 * y de 0 a 1 par�metros de salida.
 * Cuando usamos una funci�n tenemos que saber cu�ntos par�metros
 * de entrada tiene y si tiene par�metros de salida. Por ejemplo:
 * System.out.println ("Ola ke ase");
 * La funci�n println tiene 1 par�metro de entrada y 0 de salida
 * int i = sc.nextInt();
 * La funci�n nextInt tiene 0 par�metros de entrada y 1 de salida
 */



public class MainFunciones {
	//Esta tambi�n es una funci�n, una funci�n muy especial porque
	//es la funci�n Main, es decir, el punto de entrada de nuestra
	//aplicaci�n. Esta funci�n tiene un par�metro de entrada y no
	//tiene par�metros de salida (porque pone void).

	public static void main(String[] args) {
		System.out.println("Inicio del programa");
		mostrarMenu();
		imprimirNombre("F�lix");
		System.out.println("Fin del programa");
		imprimirNombreApellidos("Juan", "Romero Fern�ndez");
		System.out.println(leerNumero());
		int n1 = leerNumero();
		int n2 = leerNumero();
		int resultado = n1+n2;
		System.out.println(resultado);
		System.out.println("Fin del programa");
	}
	
	//podemos crear todas las funciones que queramos, las funciones
	//se crean dentro de la clase. No importa la posici�n donde se
	//crea la funci�n, simplemente tiene que estar dentro de la clase.
	//Por ejemplo, 
	//1� se pone la visibilidad, en este caso "public"
	//2� se pone el valor de retorno (si tuviera), en este caso
	//"void", porque no tiene valores de retorno.
	//3� se pone el nombre de la funci�n
	//4� se ponen par�metros de entrada. En caso de tenerlos, van
	//entre par�ntesis y si tiene varios, van separados por ",".
	//En este caso, no tenemos ni par�metros de entrada ni de
	//salida
	public static void mostrarMenu() {
		System.out.println("1 - Crear persona");
		System.out.println("2 - Borrar persona");
		System.out.println("3 - Modificar persona");
		System.out.println("4 - Buscar persona");
		System.out.println("0 - Salir del programa");
	}
	//en esta funci�n quiero imprimir de manera bonita un nombre
	//por pantalla
	public static void imprimirNombre(String nombre) {
		System.out.println(nombre);
	}
	public static void imprimirNombreApellidos(String nombre, String apellidos) {
		System.out.println("***************************");
		System.out.println("***" + nombre + "*" + apellidos + "***");
		System.out.println("***************************");
	}
	public static int leerNumero() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un n�mero: ");
	//el ciclo de vida de esta variable empieza en la siguiente l�nea
		int numero = sc.nextInt();
		return numero; //devuelve el valor a quien haya invocado la funci�n
	}

}
