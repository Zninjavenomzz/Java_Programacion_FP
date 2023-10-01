import java.util.Scanner;

public class Circunferencia {
  
  public static final double PI = 3.1416;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Cuanto mide el radio: ");
    double radio = scanner.nextDouble();
    
    System.out.print("EL perimetro de la circunferencia es: ");
    System.out.print( 2 * PI * radio );
    System.out.println(" cm ");
    
    
    System.out.print("EL area de la circunferencia es: ");
    System.out.print( PI * (radio * radio) );
    System.out.print(" cm² ");
    
    scanner.close();
  }

}
