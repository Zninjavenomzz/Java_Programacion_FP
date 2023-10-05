import java.util.Scanner;

public class NumerosReales {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Numeros");
		System.out.println("-------");
		
		System.out.print("Inserte un numero real-->");
		double numeroReal = scan.nextDouble();


		System.out.print(numeroReal >= 20 && numeroReal < 30);

		scan.close();

	}

}
