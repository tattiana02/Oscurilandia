package oscurilandia;

public class Kromi extends Carro {

	private String aniofabricacion;
	private String marca;
	
	public Kromi(String fechaingreso, int posicion_x, int posicion_y, String aniofabricacion, String marca) {
		super(32, fechaingreso, posicion_x, posicion_y);
		// TODO Auto-generated constructor stub
		
		this.aniofabricacion = aniofabricacion;
		this.marca = marca;
		
		
	}
	
	

	public Kromi(int posicion_x, int posicion_y) {
		super(posicion_x, posicion_y);
		
	}



	public Kromi() {
		super ();
	}
	
	public String getAniofabricacion() {
		return aniofabricacion;
	}

	public void setAniofabricacion(String aniofabricacion) {
		this.aniofabricacion = aniofabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	
	@Override
	public String toString() {
		return "Kromi" +  super.toString() + "[aniofabricacion=" + aniofabricacion + ", marca=" + marca + "]";
	}
		
	
}
