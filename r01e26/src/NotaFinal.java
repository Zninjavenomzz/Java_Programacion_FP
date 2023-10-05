import java.util.Scanner;

public class NotaFinal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Nota Primera Evaluacion-->");
		double evaluacion1 = scan.nextDouble();
		
		System.out.print("Nota Primera Evaluacion-->");
		double evaluacion2 = scan.nextDouble();
		
		System.out.print("Nota Primera Evaluacion-->");
		double evaluacion3 = scan.nextDouble();

		System.out.print(((evaluacion1 + evaluacion2 + evaluacion3) / 3) > 5);

		scan.close();

	}

}
