package game;

/**
 * Juego Oscurilandia La Secuela
 * @author Natalia Ponce, Yesenia LLanos, Mirko Bravo y Alvaro Alvarez.
 * https://github.com/AlvarezAO/Oscurilandia
 *
 */
public class Huevo {

	//Atributos de la clase.
	private int posicionX;
	private int posicionY;
	private int puntaje;
	
	/**
	 * Metodo para indicar posicion del huevo y la suma de puntaje.
	 * @param posicionX
	 * @param posicionY
	 * @param puntaje
	 */
	
	public Huevo(int posicionX, int posicionY, int puntaje) {
		
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.puntaje = puntaje;
	}//Cierre del  constructor.

	public int getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	public int getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	/**
	 * Metodo que imprime por consola los datos de la clase Huevo.
	 */
	@Override
	public String toString() {
		return "Huevo [Posicion X: " + posicionX + " | Posicion Y: " + posicionY + " | Puntaje: " + puntaje + "]";
	}//Cierre del Metodo.
	
}//Cierre de la clase.
