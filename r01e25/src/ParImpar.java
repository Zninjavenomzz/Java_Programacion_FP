import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Inserta un numero entero-->");
		int numero = scan.nextInt();

		System.out.print(numero % 2 == 0);

		scan.close();

	}

}
