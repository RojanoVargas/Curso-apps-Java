import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		int num1 = 0;
		int num2 = 0;
		double num3 = 0;
		double num4 = 0;
		do {
			System.out.println("1 - Sumar");
			System.out.println("2 - Restar");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Dividir");
			System.out.println("0 - Fin");
			opcion = sc.nextInt();
			if(opcion == 1) {
				System.out.println("Ha elegido la opción sumar");
				System.out.println("Introduzca los dos números que quiere sumar");
				num1 = sc.nextInt();
				num2 = sc.nextInt(); 
				System.out.println(num1 + "+" + num2 + "= " + (num1+num2));
			}
			else if(opcion == 2) {
				System.out.println("Ha elegido la opción restar");
				System.out.println("Introduzca los dos números que quiere restar");
				num1 = sc.nextInt();
				num2 = sc.nextInt(); 
				System.out.println(num1 + "-" + num2 + "= " + (num1-num2));
			}
			else if(opcion == 3) {
				System.out.println("Ha elegido la opción multiplicar");
				System.out.println("Introduzca los dos números que quiere multiplicar");
				num1 = sc.nextInt();
				num2 = sc.nextInt(); 
				System.out.println(num1 + "x" + num2 + "= " + num1*num2);
			}
			else if(opcion == 4) {
				System.out.println("Ha elegido la opción dividir");
				System.out.println("Introduzca los dos números que quiere dividir");
				num3 = sc.nextDouble();
				num4 = sc.nextDouble(); 
				System.out.println(num3 + "/" + num4 + "= " + num3/num4);
			}
			
			
		}while (opcion != 0);
		
		System.out.println("Fin del programa");
		
		
		
		
		
		
		
		
		
		/*int num1 = 0;
		int num2 = 0;
		System.out.println("Introduzca primer número: ");*/
		
		/*int opcion = 0;
		System.out.println("Pulse... 1 para sumar, 2 para restar, 3 para multiplicar, 4 para dividir, 0 para salir ");
		opcion = sc.nextInt();	
		if (opcion >= 1 || <= 4) {
			if (opcion == 1){
				System.out.println("has elegido sumar");
			}
			else if (opcion == 2){
				System.out.println("has elegido restar");
			}
			else if (opcion == 3){
				System.out.println("has elegido multiplicar");
			}
			else if (opcion == 4){
				System.out.println("has elegido dividir");
			}
		}else if(opcion == 0) {
				System.out.println("Gracias por venir");
		}else {
			System.out.println("opción no soportada por el programa");
		}*/
		
		
	}

}
