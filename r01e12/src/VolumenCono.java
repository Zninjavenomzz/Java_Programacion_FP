import java.util.Scanner;

public class VolumenCono {

  public static final double PI = 3.1416;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Dime el radio de la base del Cono (metros)-->");
    double radio = scanner.nextDouble();

    System.out.print("Dime la altura del Cono (metros)-->");
    double altura = scanner.nextDouble();

    System.out.print("El volumen del Cono es--> ");
    System.out.print(0.33 * PI * ((radio * radio) * altura));
    System.out.print(" m³ ");

    scanner.close();

  }

}