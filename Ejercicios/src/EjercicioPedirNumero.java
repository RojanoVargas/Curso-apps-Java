import java.util.Scanner;

public class EjercicioPedirNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		do {
			System.out.println("Introduzca un número: ");
			
			numero = sc.nextInt();
			for(int i = 1;i<=numero;i++) {
				System.out.println(i);
			}
			
			do {
				System.out.println("Pulse 0 si desea introducir otro número, pulse 1 para finalizar");
				numero = sc.nextInt();
			}while(numero < 0 || numero > 1);
		}while(numero == 0);
			System.out.println("Gracias por venir");
		
	}
}