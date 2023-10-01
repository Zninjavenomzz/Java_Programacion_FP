import java.util.Scanner;

public class FacturaIva {
  
  public static final double IVA = 0.21;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    
    
    System.out.print("Inserte el precio del producto sin IVA: ");
    double base= scanner.nextDouble();
    
    System.out.print("El precio del producto tras añadir el IVA es de: ");
    System.out.print(base+(base*IVA));
    
        
    scanner.close();
    
  }

}
