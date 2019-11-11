//las clases en java son moldes para la creación de objetos, son planos
//en los que java se va a basar para la creación de los objetos
public class Persona {
	//una clase java (en cualquier lenguaje) tiene atributos y métodos.
	//Los atributos en java se suelen poner dentro de la clase 
	//y al principio de ella
	public String nombre;
	public double peso;
	public int edad;

//este es el constructor por defecto. Se llaman igual que la clase
	public Persona() {
		
	}

public Persona(String nombre, double peso, int edad) {
	super();//En Java existe la herencia y esto invoca al padre de este objeto (es una mera formalidad)
	this.nombre = nombre; //this es una referencia al propio objeto
	this.peso = peso; //(es una referencia al propio objeto)
	this.edad = edad;
}
	
//Pero podemos tener tantos constructores como queramos
//	public Persona(String nombre, double peso, int edad) {
//		nombre = nombre1;
//		peso = peso1;
//		edad = edad1;
//	}
	
}



