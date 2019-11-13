package milenials;

import java.util.ArrayList;

public class MainHerencia {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.setDni("54789965M");
		p1.setPeso(59);
		p1.setEdad(40);
		
		Milenial m1 = new Milenial();
		m1.setDni("3486952");
		m1.setPeso(80);
		m1.setEdad(27);
		m1.setPereza(95);
		m1.setLlevaGorra(false);
		
		Milenial90 m901 = new Milenial90();
		m901.setDni("57416584F");
		m901.setPeso(60);
		m901.setEdad(26);
		m901.setPereza(80);
		m901.setLlevaGorra(false);
		m901.setVerPokemon(true);
		m901.setSaberIngles(true);
		
		Milenial80 m801 = new Milenial80();
		m801.setDni("5685232L");
		m801.setPeso(44);
		m801.setEdad(34);
		m801.setPereza(65);
		m801.setLlevaGorra(false);
		m801.setVerMazingerZ(true);
		
		
		//una referencia padre puede apuntar a cualquier objeto hijo
		Persona p2 = m1;
		Persona p3 = m901;
		//Aunque pueda apuntar a cualquiera de sus hijos solamente puedo
		//acceder a los métodos y atributos del tipo de la referencia
		System.out.println(p2.getDni());
		System.out.println(p3.getEdad());
		
		Persona p4 = new Milenial();
		p4.setPeso(34);
		
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		listaPersonas.add(p1);
		listaPersonas.add(m901);
		listaPersonas.add(m801);
		
		System.out.println(listaPersonas.get(2).getDni());
		//Milenial80 m802 = listaPersonas.get(2); 
		//con un objeto hijo no puedo apuntar a padre. Solo al revés
		
		//Si sabemos que un objeto es de un tipo concreto podemos
		//hacer un casting
		Milenial80 m802 = (Milenial80)listaPersonas.get(2);
		System.out.println(m802.getPereza());
		System.out.println(m802.isLlevaGorra()); //los booleanos son "is", en vez de "get"
		
		for (Persona p5 : listaPersonas) {
			System.out.println(p5.toString());
		}
	}

}
