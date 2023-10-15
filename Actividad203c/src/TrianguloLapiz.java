
public class TrianguloLapiz {
	public static void main(String[] args) {
		
		Punto punto1 = new Punto(20,35);
		Punto punto2 = new Punto(50,35);
		Punto punto3 = new Punto(35,61);
		
		
		Linea linea1 = new Linea(punto1,punto2);
		Linea linea2 = new Linea(punto2,punto3);
		Linea linea3 = new Linea(punto3,punto1);
		
		double longlinea1 = linea1.getLongitud();
		double longlinea2 = (int) linea2.getLongitud();
		double longlinea3 = (int) linea3.getLongitud();
		
		
		System.out.println("La longitud de la linea 1 es de " + longlinea1 + " puntos");
		System.out.println("La longitud de la linea 2 es de " + longlinea2 + " puntos");
		System.out.println("La longitud de la linea 3 es de " + longlinea3 + " puntos");
	}
}



