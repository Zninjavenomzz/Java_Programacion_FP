
import java.util.Scanner;

public class LitrosAGalones {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Inserte cuantos litros has producido hoy-->");
     double litros = scanner.nextDouble();
     
     System.out.print("Has producido-->");
     System.out.print(litros / 3.785);
     System.out.print(" galones");
     
    scanner.close();
  }

}
