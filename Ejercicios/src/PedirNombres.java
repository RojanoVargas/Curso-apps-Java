import java.util.ArrayList;
import java.util.Scanner;

public class PedirNombres {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<String> listaNombres = new ArrayList<String>();
	String nombre = ""; //as� se inicializa a "0" un string
	System.out.println("Introduzca tantos nombres como quiera (hasta que escriba 'stop')");
	do {
		nombre = sc.nextLine();
		if(!nombre.equalsIgnoreCase ("stop")) { //as� string no se me mete en la lista
			listaNombres.add(nombre);}
	}while (!nombre.equalsIgnoreCase ("stop")); //as� se compara un string (m�todo equals)
	System.out.println("Aqu� est� tu listita:");
	for (String valor : listaNombres) {
		System.out.println(valor);
	}
	System.out.println("Go home, bitch");
	}

}