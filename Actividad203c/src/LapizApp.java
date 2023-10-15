
public class LapizApp {
	public static void main(String[] args) {
		
		Punto punto1 = new Punto(0,0);
		Punto punto2 = new Punto(0,-20);
		Punto punto3 = new Punto(20,-20);
		Punto punto4 = new Punto(20,0);
		
		Linea linea1 = new Linea(punto1, punto2);
		Linea linea2 = new Linea(punto2, punto3);
		Linea linea3 = new Linea(punto3, punto4);
		Linea linea4 = new Linea(punto4, punto1);
		
		double longlinea1 = linea1.getLongitud();		
		double longlinea2 = linea2.getLongitud();
		double longlinea3 = linea3.getLongitud();
		double longlinea4 = linea4.getLongitud();
		
		
		Lapiz lapiz1 = new Lapiz();
		
		
		lapiz1.gira(270);
		lapiz1.baja();
		lapiz1.desplaza(20);
		
		Linea trazo1 = lapiz1.getTrazo(1);
					
		
		lapiz1.gira(90);
		lapiz1.desplaza(20);
		
		
		lapiz1.gira(90);
		lapiz1.desplaza(20);
	
		
		lapiz1.gira(90);
		lapiz1.desplaza(20);
				
		System.out.println("El dibujo del trazo es " + trazo1);				
		
		
		
		
	}

}
