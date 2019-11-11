package javabean;

public class Habitacion {
	private String tipoHabitacion;
	private double metros;

	
	public Habitacion() {
		super();
	}

	public Habitacion(String tipoHabitacion) {
		super();
		this.tipoHabitacion = tipoHabitacion;
	}

	public String getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	public double getMetros() {
		return metros;
	}

	public void setMetros(double metros) {
		this.metros = metros;
	}

	@Override
	public String toString() {
		return "Habitacion [tipoHabitacion=" + tipoHabitacion + ", metros=" + metros + "]";
	}
	
	
}
