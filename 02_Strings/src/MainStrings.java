
public class MainStrings {

	public static void main(String[] args) {
	/*Las cadenas en java no son primivitvos
	son objetos*/
	String cadena = "Jarry Potter";
	String cadena2 = "Ernion";
	String cadena3 = "Ron Güesley";

	String valor = "Homer";
	String valor2 = "Homer";
	
//	Si quiero comprobar si dos valores son iguales, tengo que usar equals
		if(valor.equals(valor2)) {
			System.out.println("Los nombres son iguales");
		}
	
	String valor3 = "homer";
		if(valor.contentEquals(valor3)) {
			System.out.println("Los nombres son iguales");
		}else {
			System.out.println("Los nombres son diferentes");
		}
		//esto ignora mayúsculas o minúsculas
		if(valor.equalsIgnoreCase(valor3)) { 
			System.out.println("Los nombres son iguales");
		}else {
			System.out.println("Los nombres son diferentes");
		}
		//busca en la frase algo que contenga el string
		String frase = "Homer se comió un pollo";
		if(frase.contains("Homer")) {
			System.out.println("Sí que existe Homer");
		}else {
			System.out.println("No existe Homer");
		}
		//pone frase en mayúsculas
		String mayusculas = valor.toUpperCase();
		System.out.println(mayusculas);
		
//		se imprime desde 0 hasta n-1
		String subcadena = frase.substring(0, 10);
		System.out.println(subcadena);
		System.out.println(frase.substring(0,22) + "ón enorme");
	}
}
