import java.util.ArrayList;
import java.util.Scanner;

 public class Calculadora2 {

	public static void main(String[] args) {
				Scanner sc = new Scanner (System.in);
				ArrayList<Double> listaResultados = new ArrayList <Double>  ();
				ArrayList<String> fraseResultado = new ArrayList<String>();
			    int numero = 0;
				double resultado = 0;
				int i = 0;
				do {
					System.out.println("Elija un opción : ");
					System.out.println("1-Sumar");
					System.out.println("2-Restar");
					System.out.println("3-Multiplicar");
					System.out.println("4-Dividir");
					System.out.println("0-Salir");
					numero = sc.nextInt();
					if(numero == 1) {
						System.out.println("Ha elegido la opción sumar");
						System.out.println("Introduzca un número y pulse enter para introducir otro número");
					    double numero2=0; double numero3=0;
					    numero2 = sc.nextDouble();
					    numero3 = sc.nextDouble();
					    resultado = numero2 + numero3;
					    System.out.println("El resultado es : " + resultado);
					    listaResultados.add(resultado);
					    String frase ="La suma de " + numero2 + " y " + numero3 + " es : " + resultado ;
					    fraseResultado.add(frase);
					}else if( numero == 2) {
						System.out.println("Ha elegido la opción restar");
						System.out.println("Introduzca un número y pulse enter para introducir otro número");
					    double numero2=0; double numero3=0;
					    numero2 = sc.nextDouble();
					    numero3 = sc.nextDouble();
					    resultado = numero2 - numero3;
					    System.out.println("El resultado es : " + resultado);
					    listaResultados.add(resultado);
					    String frase ="La resta de " + numero2 + " y " + numero3 + " es : " + resultado ;
					    fraseResultado.add(frase);
					    
					    
					}else if(numero == 3) {
						System.out.println("Ha elegido la opción multiplicar");
						System.out.println("Introduzca un número y pulse enter para introducir otro número");
					    double numero2=0; double numero3=0;
					    numero2 = sc.nextDouble();
					    numero3 = sc.nextDouble();
					    resultado = numero2 * numero3;
					    System.out.println("El resultado es : " + resultado);
					    listaResultados.add(resultado);
					    String frase ="La multiplicacion de " + numero2 + " y " + numero3 + " es : " + resultado ;
					    fraseResultado.add(frase);
					    
					    
					}else if(numero == 4) {
						System.out.println("Ha elegido la opción dividr");
						System.out.println("Introduzca un número y pulse enter para introducir otro número");
					    double numero2=0; double numero3=0;
					    numero2 = sc.nextDouble();
					    numero3 = sc.nextDouble();
					    resultado = numero2 / numero3;
					    System.out.println("El resultado es : " + resultado);
					    listaResultados.add(resultado);
					    String frase ="La division de " + numero2 + " y " + numero3 + " es : " + resultado ;
					    fraseResultado.add(frase);
					 }
					
				    
				}while(numero != 0);
				
				for(Double n : listaResultados) {
					System.out.println(n);
				}
				for(String valor : fraseResultado) {
					System.out.println(valor);
					
				}
				
				System.out.println("Ha elegido la opción salir");
				System.out.println("Fin del progrma");
				System.out.println("Gracias por utilizarlo , ADIOS!!!");
                
			}

		}