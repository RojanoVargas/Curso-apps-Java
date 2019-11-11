package entidad;

public class MainPersonaJavaBean {
	public static void main(String[] args) {
		Persona p = new Persona();
		p.setNombre("Juanchito");
		p.setEdad(33);
		p.setPeso(67.8);
		
		Direccion d = new Direccion();
		d.setTipoVia("Calle");
		d.setNombreVia("Serrano");
		d.setCiudad("Madrid");
		d.setNumero("56");
		d.setCp("28067");
		
		p.setDireccion(d);
		
		System.out.println(p.getDireccion());
		System.out.println(d.getCp());
		System.out.println(p.getDireccion().getCp());
		d.setCp("01000");
		System.out.println(p.getDireccion().getCp());
		
		System.out.println(p);
		/*
		p.setDireccion("Jogüarts 56 Escalera invisible 2 puerta 3 cp 28987");
		
		System.out.println(p.getDireccion());
		String cp = 
					p.getDireccion().substring(
						p.getDireccion().length()-5, p.getDireccion().length()
					);
		System.out.println(cp);*/
		
		//int cp = 03456;
		//cp = 0xA56B;
		//cp = 0b101010101;
		//System.out.println(cp);
	}
}