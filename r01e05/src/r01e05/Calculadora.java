package r01e05;

import java.util.Scanner;

public class Calculadora {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Inserte un número entero-->");
      int numero1 = scanner.nextInt();
      
      System.out.print("Inserte otro número entero-->");
      int numero2 = scanner.nextInt();
     
    System.out.print("La suma de los dos numeros insertados es: ");
    System.out.println(numero1+numero2);
    //Suma
    
    System.out.print("La resta de los dos numeros insertados es: ");
    System.out.println(numero1-numero2);
    //Resta
    
    System.out.print("El producto de los dos numeros insertados es: ");
    System.out.println(numero1*numero2);
    //Multiplicacion  
    
    System.out.print("La división de los dos numeros insertados es: ");
    System.out.println(numero1/numero2);
    //Division
    
    System.out.print("La resta de los dos numeros insertados es: ");
    System.out.println((numero1*numero1)+(numero2*numero2));
    //Modulo
    
    scanner.close();
      


  }

}
