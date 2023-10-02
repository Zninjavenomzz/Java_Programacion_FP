import java.util.Scanner;

public class PotenciaVatios {
  
  public static final int RESISTENCIA = 4; //ohmios
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  
    // P = I² * R I = Intensidad  R = Resistencia
    
    System.out.print("Que corriente se utiliza-->");
    double intensidad = scanner.nextDouble();
    
    double potencia = ((intensidad * intensidad) * RESISTENCIA);
    
    System.out.print("Se consumen: ");
    System.out.print(potencia);
    System.out.print(" W");
    
    scanner.close();
  
  }
  
}
