
public class Variables {

	public static void main(String[] args) {
		/*En java tenemos dos tipos de variables
		tenemos variables primitivas y variables de referencia.
		Estas son primitivas: 
		int, long, double, boolean*/
		
		int numero = 0; //variable numérica
		System.out.println("El número es: " + numero);
		
		//otros tipos de variables
		long numeroLargo = 676; //números más grandes que en int, pero ya entra bastante en int (en plan millones)
		int x = 5; //el simbolito de ! indica que hay un error, pero no grave (no se está usando la x para nada)
		double numeroReal = 34.33;
		boolean cierto = true; //solo true o false
		cierto = false;
		System.out.println(numeroLargo);
		System.out.println(numeroReal);
		System.out.println(cierto);

		//El otro tipo son las variables de referencia o directamente referencias
		String nombre = "pepe"; //string es una clase, por eso usa CamelCase upper
		System.out.println("El nombre es: " + nombre);
		nombre = "laura";
		System.out.println("El nombre es: " + nombre);
		int numero3; //esto se puede hacer, pero es buena costumbre inicializarla
		numero3 = 7; //con esto se inicializa, pero es un paso extra. Mejor de la siguiente manera:
		int numero4 = 9; //Así es como toca
		double numero5 = 10; 
		double numero6 = numero5;
		
		//esto que viene ahora puede no ser súper útil, pero ahí viene:
		
//		double numero7 = 56; ESTO no funciona porque el double es más grande que el int, y no le cabe
//		int numero8 = numero7;
		double numero7 = 56;
		int numero8 = (int)numero7; //Así si funcionaría, porque le pides que busque si cabe (esto se llama "cast")
	}

}
