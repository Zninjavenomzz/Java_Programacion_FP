package ejercicio2;

import java.util.Scanner;

import paquete1.Fraccion;
import paquete2.*;

public class FraccionApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		//Pedimos los datos
		System.out.print("Inserte el numerador de la fracción 1:");
		int numerador1 = scan.nextInt();
		System.out.print("Inserte el denominador de la fracción 1:");
		int denominador1 = scan.nextInt();
		
		System.out.print("Inserte el numerador de la fracción 2:");
		int numerador2 = scan.nextInt();
		System.out.print("Inserte el denominador de la fracción 2:");
		int denominador2 = scan.nextInt();

		//Utilizamos los datos que hemos pedido
		Fraccion fraccion1 = new Fraccion(numerador1, denominador1);
		Fraccion fraccion2 = new Fraccion(numerador2, denominador2);
		
		//Creamos las operaciones
		Fraccion sumar =  fraccion1.suma(fraccion2);
		Fraccion restar =  fraccion1.resta(fraccion2);
		Fraccion dividir =  fraccion1.division(fraccion2);
		Fraccion multiplicar =  fraccion1.producto(fraccion2);
		
		//Imprimimos por pantalla el resultado
		System.out.println("La suma de las 2 fracciones es = " + sumar.getNumerador() + "/" + sumar.getDenominador());
		System.out.println("La suma de las 2 fracciones es = " + restar.getNumerador() + "/" + sumar.getDenominador());
		System.out.println("La suma de las 2 fracciones es = " + dividir.getNumerador() + "/" + sumar.getDenominador());
		System.out.println("La suma de las 2 fracciones es = " + multiplicar.getNumerador() + "/" + sumar.getDenominador());
		
		
		Fraccion simplificada = fraccion1.simplifica();

		

	
		
	}
}