package empresa;

import java.util.ArrayList;

public class Director extends Empleado {
	private ArrayList<Empleado> listaEmpleados;
	private static final int BONIFICACION_POR_EMPLEADO = 50; //constantes en java
	
	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}
	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	@Override
	public double calcularSalario() {
		double salarioTotal = getSalarioBase() + (listaEmpleados.size() * BONIFICACION_POR_EMPLEADO);
		return salarioTotal;
	}
	
}
