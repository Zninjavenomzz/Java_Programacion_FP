package r01e07;

import java.util.Scanner;

public class EuroPeseta {

  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);

    
    System.out.print("Introduzca la cantidad en €: ");
      float euros = scanner.nextFloat();
      
      double valoreuropeseta= 166.386;
      
      double pesetas = (euros*valoreuropeseta);
    
      System.out.print(euros);
      System.out.print(" € pasados a pesetos son: ");
      System.out.print(pesetas);
      
      scanner.close();
    

  }

}