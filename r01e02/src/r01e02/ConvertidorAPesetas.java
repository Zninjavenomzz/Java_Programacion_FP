package r01e02;

import java.util.Scanner;

public class ConvertidorAPesetas {
  
  public static final double VALOREUROPESETA=166.386;

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		
		System.out.print("Introduzca la cantidad en €: ");
			float euros = scanner.nextFloat();
	
			
			double pesetas = (euros*VALOREUROPESETA);
		
			System.out.print(euros);
			System.out.print(" € pasados a pesetos son: ");
			System.out.print(pesetas);
			
			scanner.close();
		

	}

}
