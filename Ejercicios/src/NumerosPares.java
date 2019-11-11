import java.util.Scanner;

public class NumerosPares {
//Todos los números pares entre el 0 y el del user
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int pares = 0;
		System.out.println("Introduzca un número: ");
		num = sc.nextInt();
		
		do {
			if (num % 2 == 0) {
				System.out.println(num);
			}
			num = num--;
			
		}while (num>0);
	}

}
