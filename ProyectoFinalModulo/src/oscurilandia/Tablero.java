package oscurilandia;

public class Tablero {

	private Carro lista_carros[]= new Carro[18];
	//ArrayList <Huevo> lista_huevos = new ArrayList<Huevo>();
	private char matriz [][]= new char[15][15];
	
	public void crearCarro() {
		
		
		
		lista_carros[0] = crearKromi();
		lista_carros[1] = crearKromi();
		lista_carros[2] = crearKromi();
		lista_carros[3] = crearCaguano();
		lista_carros[4] = crearCaguano();
		lista_carros[5] = crearCaguano();
		lista_carros[6] = crearCaguano();
		lista_carros[7] = crearCaguano();
		lista_carros[8] = crearTrupalla();
		lista_carros[9] = crearTrupalla();
		lista_carros[10] = crearTrupalla();
		lista_carros[11] = crearTrupalla();
		lista_carros[12] = crearTrupalla();
		lista_carros[13] = crearTrupalla();
		lista_carros[14] = crearTrupalla();
		lista_carros[15] = crearTrupalla();
		lista_carros[16] = crearTrupalla();
		lista_carros[17] = crearTrupalla();
		
		
		
	}
	
	public Kromi crearKromi() {
		int x;
		int y;
		boolean vacio= false;
		
		do {
			x=(int)(Math.random()*13);
			y=(int)(Math.random()*15);
		
			if (matriz[x][y]!='T' && matriz[x][y]!='C' && matriz[x][y]!='K') {
			
				if (matriz[x+1][y]!='T' && matriz[x+1][y]!='C' && matriz[x+1][y]!='K') {
					if (matriz[x+2][y]!='T' && matriz[x+2][y]!='C' && matriz[x+2][y]!='K') {
						vacio = true ;
						matriz[x][y]='K';
						matriz[x+1][y]='K';
						matriz[x+2][y]='K';
						
					}
				}
			}
			
		
		
		}while(!vacio);
		
		return new Kromi(x,y);
		
	}
	
	public Caguano crearCaguano() {

		int x;
		int y;
		
		boolean vacio= false;
		
		do {
			x=(int)(Math.random()*15);
			y=(int)(Math.random()*14);
		
			if (matriz[x][y]!='T' && matriz[x][y]!='C' && matriz[x][y]!='K') {
			
				if (matriz[x][y+1]!='T' && matriz[x][y+1]!='C' && matriz[x][y+1]!='K') {
					
						vacio = true ;
						matriz[x][y]='C';
						matriz[x][y+1]='C';
						
						
					
				}
			}
			
		
		
		}while(!vacio);
		
		return new Caguano(x,y);
		
		
		
	}
	
	public Trupalla crearTrupalla() {
		int x;
		int y;
		
		boolean vacio= false;
		
		do {
			x=(int)(Math.random()*15);
			y=(int)(Math.random()*15);
		
			if (matriz[x][y]!='T' && matriz[x][y]!='C' && matriz[x][y]!='K') {
			
				
					
						vacio = true ;
						matriz[x][y]='T';
						
						
						
					
				
			}
			
		
		
		}while(!vacio);
		
		return new Trupalla(x,y);
		
		
		
	}
	public void lanzarHuevo() {
		
		
	}
	
	public void mostrarMatriz() {
		
		for (int i = 0; i < 15; i++) {
			System.out.print("|");
			for (int j = 0; j <15; j++) {
				
				System.out.print(matriz[i][j]+"|");
			
				
			}
			System.out.println("");
		}
		
	}
	
	public void calcularPuntaje() {
		
		
	}
	
	
}
