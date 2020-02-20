package oscurilandia;

import javax.swing.JOptionPane;

public class Menu {
	private static int accion;
	static Tablero tablero1= new Tablero();

	public static void main(String[] args) {
		
		tablero1.crearCarro();
		tablero1.mostrarMatriz();
		System.out.println((int)(Math.random()*15));
		
	
		
		

	}

}

