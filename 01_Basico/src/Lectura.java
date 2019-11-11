import java.util.Scanner; //he puesto "scann" en la línea 6 y pulsado contrl+espacio

public class Lectura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		System.out.println("Introduzca un número: ");
		//leer número en pseudocódigo, sc en java. Ponemos "sc." y salen sugerencias en Eclipse
		numero = sc.nextInt(); /*coge el siguiente entero y guárdamelo en la siguiente variable. 
		El programa se parará esperando a que el usuario ponga un número y pulse enter*/
		for(int i = 1;i<=numero;i++) { //normalmente las variables de este tipo son i, j, k
			System.out.println(i);
		}
		//Capturar texto
		sc.nextLine(); /*La clase scanner no siempre va bien, así que se lía. Con esto limpias
		lo anterior y pones algo nuevo */
		System.out.println("Introduzca un palabra: ");
		String cadena = sc.nextLine();
		System.out.println("El texto introducido: " + cadena);
	}
}
