import java.util.Scanner;

public class ConstructoraArea {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Cuanto mide el B: ");
    double medidaB = scanner.nextDouble();

    System.out.print("Cuanto mide el C: ");
    double medidaC = scanner.nextDouble();

    double areaRectangulo = (medidaC * medidaB);

    double medidaA = (2 * medidaC);

    double areaTriangulo = (((medidaA / 2) * medidaB) / 2);
    
    System.out.print("El area del terreno es de: ");
    System.out.print(areaRectangulo + areaTriangulo); 
    System.out.print(" m²");
    
    

    scanner.close();
  }

}
