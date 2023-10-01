package r01e08;

import java.util.Scanner;

public class CalculadoraAreaTriangulo {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Dime cuanto mide la base del triángulo-->");
      double base = scanner.nextDouble();
      
    System.out.print("Dime cuanto mide la base del triángulo-->");
      double altura = scanner.nextDouble();
      
    System.out.print("El area del triangulo es: ");
    System.out.print((base*altura)/2);
    System.out.print(" m²");
    
    scanner.close();
    
  


  }

}
