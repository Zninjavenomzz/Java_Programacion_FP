package r01e06;

import java.util.Scanner;

public class ConvertidorAEuros {

  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);

    
    System.out.print("Introduzca la cantidad en pesetas: ");
      double pesetas = scanner.nextDouble();
      
      double valorpesetaeuro= 0.0060;
      
      double euros = (valorpesetaeuro*pesetas);
    
      System.out.print(pesetas);
      System.out.print(" pesetas pasadas a euros son: ");
      System.out.print(euros);
      
      scanner.close();
    

  }

}
