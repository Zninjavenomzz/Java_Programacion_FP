package r01e03;

import java.util.Scanner;

public class Facturas {
	
	public static final double IVA = 0.21;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("Inserte el precio del producto sin IVA: ");
		float base= scanner.nextFloat();
		
		System.out.print("El precio del producto tras añadir el IVA es de: ");
		System.out.print(base+(base*IVA));
		
				
		scanner.close();
		
	}

}
