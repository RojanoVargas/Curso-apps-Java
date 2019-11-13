package milenials;

public class Milenial extends Persona{
	private int pereza;
	private boolean llevaGorra;
	
	public int getPereza() {
		return pereza;
	}
	public void setPereza(int pereza) {
		this.pereza = pereza;
	}
	public boolean isLlevaGorra() {
		return llevaGorra;
	}
	public void setLlevaGorra(boolean llevaGorra) {
		this.llevaGorra = llevaGorra;
	}
	@Override
	public String toString() {
		return "Milenial [pereza=" + pereza + ", llevaGorra=" + llevaGorra + ", getPereza()=" + getPereza()
				+ ", isLlevaGorra()=" + isLlevaGorra() + ", getDni()=" + getDni() + ", getEdad()=" + getEdad()
				+ ", getPeso()=" + getPeso() + "]";
	}
	
	

	
	
}
