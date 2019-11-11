import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int fact = 1;
		System.out.println("Introduzca un número: ");
		num = sc.nextInt();
		for(int i = 1; i<=num;i++) {
			fact = fact * i;
		}
		System.out.println ("El factorial de " + num + " es: " + fact);
	}
}
