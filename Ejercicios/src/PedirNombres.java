import java.util.ArrayList;
import java.util.Scanner;

public class PedirNombres {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<String> listaNombres = new ArrayList<String>();
	String nombre = ""; //así se inicializa a "0" un string
	System.out.println("Introduzca tantos nombres como quiera (hasta que escriba 'stop')");
	do {
		nombre = sc.nextLine();
		if(!nombre.equalsIgnoreCase ("stop")) { //así string no se me mete en la lista
			listaNombres.add(nombre);}
	}while (!nombre.equalsIgnoreCase ("stop")); //así se compara un string (método equals)
	System.out.println("Aquí está tu listita:");
	for (String valor : listaNombres) {
		System.out.println(valor);
	}
	System.out.println("Go home, bitch");
	}

}