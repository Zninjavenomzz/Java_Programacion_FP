
import java.util.Scanner;

public class PiscinaCalculadora {
  
  //m³
  public static final double PRECIOAGUA = 0.0025;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    

    System.out.print("El precio del litro del agua es: ");
    System.out.print(PRECIOAGUA);
    System.out.println(" €");
    
    
    System.out.print("Dime el largo de la piscina-->");
    double x = scanner.nextDouble();
        

    System.out.print("Dime el ancho de la piscina-->");
    double y = scanner.nextDouble();
    

    System.out.print("Dime la altura de la piscina-->");
    double z = scanner.nextDouble();
    
    //Volumen de paralelepípedo = X*Y*Z
    //Paso de m³ a litros
    
    double volumenPiscina = ((x * y * z) * 1000 );
    
    
    System.out.print("Para llenar una piscina  con un volumen de ");
    System.out.print(volumenPiscina);
    System.out.println(" L hacen falta: ");
    
    System.out.print((volumenPiscina ) * PRECIOAGUA );
    System.out.print(" €");
    
    scanner.close(); 
   
  }

}
