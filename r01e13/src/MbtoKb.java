import java.util.Scanner;

public class MbtoKb {
  
  public static final double KB = 1000;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Dime la cantidad de Mb: ");
      double mb = scanner.nextDouble();
      
    System.out.print( mb );
    System.out.print(" Mb son--> " );
    System.out.print( mb*KB );
    System.out.print( " Kb" );
    
    scanner.close();
      
    


  }

}
