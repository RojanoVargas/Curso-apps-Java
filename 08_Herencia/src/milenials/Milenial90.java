
package milenials;

public class Milenial90 extends Milenial {
	private boolean verPokemon;
	private boolean saberIngles;
	
	public boolean isVerPokemon() {
		return verPokemon;
	}
	public void setVerPokemon(boolean verPokemon) {
		this.verPokemon = verPokemon;
	}
	public boolean isSaberIngles() {
		return saberIngles;
	}
	public void setSaberIngles(boolean saberIngles) {
		this.saberIngles = saberIngles;
	}
	@Override
	public String toString() {
		return "Milenial90 [verPokemon=" + verPokemon + ", saberIngles=" + saberIngles + ", isVerPokemon()="
				+ isVerPokemon() + ", isSaberIngles()=" + isSaberIngles() + ", getPereza()=" + getPereza()
				+ ", isLlevaGorra()=" + isLlevaGorra() + ", getDni()=" + getDni() + ", getEdad()=" + getEdad()
				+ ", getPeso()=" + getPeso() + "]";
	}
	
	
	
}