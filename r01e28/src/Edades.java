import java.util.Scanner;

public class Edades {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Inserta la edad de la primera persona-->");
		double edad1 = scan.nextDouble();
		
		System.out.print("Inserta la edad de la segunda persona-->");
		double edad2 = scan.nextDouble();
		
		System.out.print("Inserta la edad de la tercera persona-->");
		double edad3 = scan.nextDouble();
		
		System.out.print(edad1 > edad2 && edad1 > edad3 && edad2 > edad3);

		scan.close();

	}

}
