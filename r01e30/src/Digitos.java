import java.util.Scanner;

public class Digitos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Inserte un número-->");
		int numero = scan.nextInt();
		

		System.out.print( numero < 10);

		scan.close();

	}

}
