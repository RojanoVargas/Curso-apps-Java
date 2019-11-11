import java.util.Scanner;

public class CuadradoNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int cuadrado = 0;
		System.out.println("Introduzca un número: ");
		num = sc.nextInt();
		cuadrado=num*num;
		System.out.println ("El cuadrado de " + num + " es: " + cuadrado);	
		System.out.println("venga, chao");
	}

}
