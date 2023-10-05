import java.util.Scanner;

public class EdadCarnet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("CARNET DE CONDUCIR -DGT-");
		System.out.println("------------------------");
		
		System.out.print("Inserte su edad-->");
		int edad = scan.nextInt();


		System.out.print(edad >= 18);

		scan.close();

	}

}
