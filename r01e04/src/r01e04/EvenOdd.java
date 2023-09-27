package r01e04;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Inserte un numero entero--> ");
		 int numero = scanner.nextInt();
		
		 
		 
		 scanner.close();
		
		if(numero%2 == 0){
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
		
	}
	
}
		