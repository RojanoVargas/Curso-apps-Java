import java.util.Scanner;

public class BuscarNumeroMayor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int numMayor = 0;
		do {
			numMayor = 0;
			do {
				System.out.println("Introduzca un número: ");
				num = sc.nextInt();
				if (num > numMayor) {
					numMayor = num;
				}
			} while (num != 0);
			System.out.println("El numero mayor es: " + numMayor);
			System.out.println("¿deseas introducir otra secuencia? 0-sí 1-no");
			num = sc.nextInt();
		}while(num == 0);
		System.out.println("Gracias por venir");

	}

}
