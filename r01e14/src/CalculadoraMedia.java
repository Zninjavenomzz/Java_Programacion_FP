import java.util.Scanner;

public class CalculadoraMedia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Dime la nota que sacaste en el primer examen-->");
		double notaExamen1 = scanner.nextDouble();

		System.out.print("Dime la nota media que deseas-->");
		double notaMedia = scanner.nextDouble();

		System.out.print("La nota que necesitas sacar en el segundo examen es: ");
		System.out.print((2 * notaMedia)- notaExamen1 );
		
		scanner.close();


	}

}
