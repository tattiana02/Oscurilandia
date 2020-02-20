package game;

/**
 * Juego Oscurilandia La Secuela
 * @author Álvaro Álvarez Olivares, Mirko Bravo Hidalgo, Yesenia Llanos Pérez, Natalia Ponce Ávila.
 * @see https://github.com/AlvarezAO/Oscurilandia
 * @version 20/02/2020
 * 
 */
public class Caguano extends Carro {

	private int alcanceTiro;
	private String colorConfeti;
	private int x2;
    private int y2;
    	
	public Caguano() {
		super();
	}
	
	public Caguano(int cantidadOcupantes, String fechaIngreso, int posicionX,
					int posicionY, int alcanceTiro, String colorConfeti, int x2, int y2) {
		super (32, "fechaIngreso", posicionX, posicionY);
		
		this.alcanceTiro = alcanceTiro;
		this.colorConfeti = colorConfeti;
		this.x2 = posicionX;
		this.y2 = posicionY+1;
	}

	public int getAlcanceTiro() {
		return alcanceTiro;
	}

	public void setAlcanceTiro(int alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}

	public String getColorConfeti() {
		return colorConfeti;
	}

	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	}

	@Override
	public String toString() {
		return "\nDatos Caguano" + super.toString()+ "\nAlcance de Tiro: " + alcanceTiro + "Mts.\nColor Confeti: " + colorConfeti;
	}
	
	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
}

