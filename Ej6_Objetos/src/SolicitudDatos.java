import java.util.Scanner;

public class SolicitudDatos {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    Persona persona1 = new Persona();

    System.out.println("DATOS PERSONAS");
    System.out.println("--------------");

    System.out.print("Inserta el peso de la persona: ");
    persona1.peso = scan.nextDouble();

    System.out.print("Inserta la edad de la persona: ");
    persona1.edad = scan.nextInt();

    System.out.print("Inserta el numero de hijos de la persona: ");
    persona1.numeroHijos = scan.nextInt();

    System.out.println("La persona 1 pesa " + persona1.peso + " Kg");

    System.out.println("La persona  1 tiene " + persona1.edad + " años");

    if (persona1.numeroHijos <= 1) {
      System.out.print("La persona  1 tiene " + persona1.numeroHijos + " hijo");

    } else {
      System.out.print("La persona  1 tiene " + persona1.numeroHijos + " hijos");
    }
    scan.close();
  }
}
