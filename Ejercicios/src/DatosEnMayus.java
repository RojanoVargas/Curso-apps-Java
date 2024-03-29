
public class DatosEnMayus {

	public static void main(String[] args) {

		imprimirDatos("Juan", "Velasco", 19, 654987123, true);
		imprimirDatos("Fran", "Cisco", 20, 654987196, true);
		imprimirDatos("Pepe", "Viyuela", 48, 654987523, false);
		imprimirDatos("Antonio", "Huevo", 19, 698787123, false);
		imprimirDatos("Fernando", "de la Torre", 90, 659123123, false);
		imprimirDatos("Juan", "Francisco de la nueva", 96, 645123456, true);
	}

	
	public static void imprimirDatosMinus(String nombre, String apellidos, int edad, int telefono) {
		System.out.println("***************************");
		System.out.println("***" + nombre.toLowerCase() + " "+ apellidos.toLowerCase() + "***" + edad + "***" + telefono);
		System.out.println("***************************");
	}
	public static void imprimirDatosMayus(String nombre, String apellidos, int edad, int telefono) {
		System.out.println("***************************");
		System.out.println("***" + nombre.toUpperCase() + " "+ apellidos.toUpperCase() + "***" + edad + "***" + telefono);
		System.out.println("***************************");
	}
	public static void imprimirDatos (String nombre, String apellidos, int edad, int telefono, boolean mayusculas) {
		if(mayusculas) {
			imprimirDatosMayus(nombre, apellidos, edad, telefono);
		}else {
			imprimirDatosMinus(nombre, apellidos, edad, telefono);
		}
	}
	
}
