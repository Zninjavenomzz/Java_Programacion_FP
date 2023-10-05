import java.util.Scanner;

public class CalculoVertical {

  // Hacemos las dos constantes

  public static final double GRAVEDAD = 9.8; // m/s²

  public static final double PIES = 3.28;

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("EXAMEN DE Emilio_Fernández_Gallardo. CALCULO DE LANZAMIENTO VERTICAL");

    System.out.print("Introduzca la velocidad inicial del objeto en (m/s): ");
    Double velocidadInicial = Double.parseDouble(scan.nextLine());

    // Calculamos el tiempo

    double tiempo = (velocidadInicial / GRAVEDAD);

    // Calculamos la altura

    double altura = ((velocidadInicial * tiempo) - (0.5 * GRAVEDAD) * (tiempo * tiempo));

    System.out.println("La altura máxima en metros es de " + altura);

    // Hacemos que se redondee de metros a pies

    int pies = (int) (PIES * altura);

    System.out.println("Esta altura equivale a " + pies + " pies");

    System.out.print("En alcanzar la altura máxima tarda " + tiempo + " segundos");

    scan.close();

  }

}
