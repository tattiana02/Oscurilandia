package game;

/**
 * Juego Oscurilandia La Secuela
 * @author Alvaro Alvarez Olivares, Mirko Bravo Hidalgo, Yesenia Llanos Perez, Natalia Ponce Avila.
 * @see https://github.com/AlvarezAO/Oscurilandia
 * @version 20/02/2020
 * 
 */

public class Carro {
	
	//Atributos de la clase.	
	private int cantOcupantes;
	private String fechaIngreso;
	private int posicionX;
	private int posicionY;
	
	/**
	 * Metodo constructor para crear los carros.
	 * @param cantOcupantes
	 * @param fechaIngreso
	 * @param posicionX
	 * @param posicionY
	 */
	
	public Carro(int cantOcupantes, String fechaIngreso, int posicionX, int posicionY) {
		
		this.cantOcupantes = cantOcupantes;
		this.fechaIngreso = fechaIngreso;
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		
	}//Cierre del constructor.
	
	/**
	 *Metodo constructor por defecto.
	 */

	public Carro() {
		// TODO Auto-generated constructor stub
	}//Cierre del constructor.

	public int getCantOcupantes() {
		return cantOcupantes;
	}

	public void setCantOcupantes(int cantOcupantes) {
		this.cantOcupantes = cantOcupantes;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

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

	/**
	 *Metodo que imprime por consola la clase Carro. 
	 */
	
	@Override
	public String toString() {
		return "\nCantidad Ocupantes: " + cantOcupantes + "\nFecha Ingreso: " + fechaIngreso + "\nPosicion X: " + posicionX
				+ "\nPosicion Y: " + posicionY;
	}//Cierre del Metodo.
	
	
}//Cierre de la clase.
