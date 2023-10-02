import java.util.Scanner;

public class PrecioLlamadas {

  public static final int SEGUNDOSPORMINUTO = 60;

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("FACTURA TELEFÓNICA");
    System.out.println("-·-·-·-·-·-·-·-·-·");

    System.out.print("Introduce el coste de establecimiento de llamada (€): ");
    double estLlamada = Double.parseDouble(scan.nextLine());

    System.out.print("Introduce el coste por minuto (€): ");
    double costeMinuto = Double.parseDouble(scan.nextLine());

    System.out.print("Introduce la duración de la llamada (en segundos): ");
    int duracion = Integer.parseInt(scan.nextLine());

    int minutos = duracion / SEGUNDOSPORMINUTO;
    double coste = estLlamada + costeMinuto * minutos;
    System.out.println("El coste de la llamada es de " + coste + " euros");

    scan.close();
  }

}