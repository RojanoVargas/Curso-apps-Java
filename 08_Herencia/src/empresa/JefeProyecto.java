package empresa;

public class JefeProyecto extends Empleado {
	private double bonificaciones;

	public double getBonificaciones() {
		return bonificaciones;
	}

	public void setBonificaciones(double bonificaciones) {
		this.bonificaciones = bonificaciones;
	}
	
	public double calcularSalario() {
		double salarioTotal = getSalarioBase() + bonificaciones;
		return salarioTotal;
	}
}
