package empresa;

import java.util.ArrayList;

public class MainEmpresa {

	public static void main(String[] args) {
		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
		
		Empleado e1 = new Empleado();
		e1.setDni("459996");
		e1.setNombre("Astérix");
		e1.setSalarioBase(600);
		
		Empleado e2 = new Empleado();
		e2.setDni("659552");
		e2.setNombre("Óbelix");
		e2.setSalarioBase(800);
		
		Empleado e3 = new Empleado();
		e3.setDni("612615");
		e3.setNombre("Pánoramix");
		e3.setSalarioBase(1400);

		JefeProyecto jp1 = new JefeProyecto();
		jp1.setDni("4353456");
		jp1.setNombre("Abraracurcix");
		jp1.setSalarioBase(2000);
		jp1.setBonificaciones(300);
		
		JefeProyecto jp2 = new JefeProyecto();
		jp2.setDni("4355866");
		jp2.setNombre("Aseguranceturix");
		jp2.setSalarioBase(2500);
		jp2.setBonificaciones(400);
		
		Director d1 = new Director();
		d1.setDni("651281");
		d1.setNombre("Gargamel");
		d1.setSalarioBase(3000);
		
		ArrayList<Empleado> empleadosDirector = new ArrayList<Empleado>();
		d1.setListaEmpleados(empleadosDirector);
		empleadosDirector.add(e2);
		empleadosDirector.add(jp2);
		empleadosDirector.add(e1);
		
		listaEmpleados.add(e1);
		listaEmpleados.add(e2);
		listaEmpleados.add(e3);
		listaEmpleados.add(jp1);
		listaEmpleados.add(jp2);
		listaEmpleados.add(d1);
		for (Empleado e : listaEmpleados) {
			System.out.println(e.calcularSalario());
		}
	}

}
