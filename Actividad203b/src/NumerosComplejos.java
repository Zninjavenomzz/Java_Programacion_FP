
import java.util.Scanner;

public class NumerosComplejos {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Inserta la parte real: ");
		double numeroreal1 = Double.parseDouble(scan.nextLine());
		System.out.print("Inserta la parte imaginaria: "); 
		double numeroimaginario1 = Double.parseDouble(scan.nextLine());
		System.out.print("Inserta la parte real del numero 2: ");
		double numeroreal2 = Double.parseDouble(scan.nextLine());
		System.out.print("Inserta la parte imaginaria del numero 2: "); 
		double numeroimaginario2 = Double.parseDouble(scan.nextLine());
		
		
		Complejo numero1 = new Complejo(numeroreal1 , numeroimaginario1);
		Complejo numero2 = new Complejo(numeroreal2 , numeroimaginario2);
		
		Complejo sumar =  numero1.sumar(numero2);
		Complejo resta =  numero1.restar(numero2);
		Complejo dividir =  numero1.dividir(numero2);
		Complejo multiplicar =  numero1.multiplicar(numero2);
		
		
		double partereal = sumar.getParteReal();
		double parteimaginaria = sumar.getParteImaginaria();

		System.out.println("La suma de los dos numeros es " + partereal + " + "+ parteimaginaria + "i");
		
		partereal = resta.getParteReal();
		parteimaginaria = resta.getParteImaginaria();

		System.out.println("La suma de los dos numeros es " + partereal + " + "+ parteimaginaria + "i");
		
		partereal = dividir.getParteReal();
		parteimaginaria = dividir.getParteImaginaria();
		
		System.out.println("La suma de los dos numeros es " + partereal + " + "+ parteimaginaria + "i");
		
		partereal = multiplicar.getParteReal();
		parteimaginaria = multiplicar.getParteImaginaria();		
		
		System.out.println("La suma de los dos numeros es " + partereal + " + "+ parteimaginaria + "i");
		
		
		scan.close();
			
	}

}
