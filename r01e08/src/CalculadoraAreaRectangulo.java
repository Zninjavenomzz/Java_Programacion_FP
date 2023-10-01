import java.util.Scanner;

public class CalculadoraAreaRectangulo {

  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
    
    System.out.print("Dime cuanto mide la base del rectángulo-->");
      double base = scanner.nextDouble();
      
    System.out.print("Dime cuanto mide la altura del rectángulo-->");
      double altura = scanner.nextDouble();
      
    System.out.print("El area del triangulo es: ");
    System.out.print(base*altura);
    System.out.print(" m²");
    
    scanner.close();
    
  }

}


