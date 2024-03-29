import java.util.ArrayList;

public class MainArrays {

	public static void main(String[] args) {
		//Java tiene listas din�micas y listas est�ticas
		
		//Lista est�tica:
		int[] arrayNumeros = new int[10];
		arrayNumeros[0] = 23;
		arrayNumeros[1] = 56;
		System.out.println(arrayNumeros[0]);
		System.out.println(arrayNumeros[1]);
		//Da la longitud del array	
		System.out.println(arrayNumeros.length);
		//recorrer array
		for(int i=0;i<=arrayNumeros.length - 1;i++) {
			System.out.println("Valor de la posici�n" + i + " del array es" + arrayNumeros[i]);
		}
		
		/*Si pon�is una posici�n del array que no existe, java para el programa instant�neamente
		ejemplo:
		System.out.println(arrayNumeros[12]);
		12 no existe. De hecho, 10 tampoco, porque siempre es n-1. Por tanto el array acaba en 9*/
		System.out.println("esto se ejecuta despu�s");
		
		//Din�micos, son objetos en java. Va creciendo, no se inicializa con un l�mite
		ArrayList<String> listaStrings = new ArrayList<String>();
		listaStrings.add(0, "jarry"); //primer valor = posici�n, segundo valor = lo que quieres guardar
		listaStrings.add(1, "Ernion"); //puedes ir poniendo as� en posici�nes x
		listaStrings.add("ron"); // o si no pones posici�n, que te la ponga en la siguiente
		System.out.println(listaStrings.get(2));
		
		for(int i = 0; i < listaStrings.size();i++) {
			System.out.println(listaStrings.get(i));
		}
		//LO QUE NORMALMENTE SE UTILIZA PARA RECORRER UN ARRAY ES UN "FOR EACH" (POR CADA).
		//Con ello no te preocupas del tama�o del array ni nada.
		for(String valor: listaStrings) {//ahora valor no representa la posici�n, 
			System.out.println(valor); //sino el valor que le quiero dar. Mejor m�todo
		} //para los arrays est�ticos y din�micos. The very best
		
		System.out.println("Recorriendo el array est�tico: ");
		for(int n : arrayNumeros) {
			System.out.println(n);
		}
		
	}

}
