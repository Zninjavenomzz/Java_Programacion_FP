package prueba;
import java.util.Scanner;

public class CondicionalesPractica {
    
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //hacemos las variables y solicitamos que el usuario ponga las edades
        System.out.print("Ingresa la edad de Juan: ");
        int edadJuan = scanner.nextInt();
        
        System.out.print("Ingresa la edad de Maria: ");
        int edadMaria = scanner.nextInt();
        
        System.out.print("Ingresa la edad de Luisa: ");
        int edadLuisa = scanner.nextInt();
        
        scanner.close();
        
        if (edadJuan > edadMaria && edadJuan <= edadLuisa) {
            System.out.println("1º La edad de Juan es mayor que la de Maria y es menor o igual que la edad de Luisa (True)");
        } else {
            System.out.println("1º La edad de Juan no es mayor que la de Maria y no es menor o igual que la edad de Luisa (False)");
        }
        //Primera condición
        
        if (edadJuan > edadLuisa && edadMaria > edadLuisa) {
        	System.out.println("2º Juan y María son mayores que Luisa (True");
        } else {
        	System.out.println("2º Juan y María no son mayores que Luisa (False)");
        }
        //Segunda condición
        
        if(edadJuan < edadMaria && edadMaria < edadLuisa) {
        	System.out.println("3º La edad de María esta entre la edad de Juan y la edad de Luisa");
        } else {
        	System.out.println("3º La edad de Maria no esta entre la edad de Juan y la edad de Luisa");
        }
        //Tercera Condición
        
        if (edadJuan > edadMaria && edadMaria < edadLuisa) {
        	System.out.println("4º La edad de Maria no esta entre la edad de Juan y la edad de Luisa (TRUE)");
        } else {
        	System.out.println("4º No se cumple...");
        	//Cuarta Condición
        }
        
        if(edadJuan > 20 && (edadMaria<=15) && (21<edadLuisa || 24<=edadLuisa )) {
        	System.out.println("5º Se cumple//...");
        } else {
        	System.out.println("5º No se cumple");
        	//Quinta Condicion
        }
        
        if(edadJuan < edadMaria && ( 10 > edadJuan && edadJuan > 20)) {
        	System.out.println("6º La edad de Juan es menor que la edad de Maria y no esta entre 10 y 20");
        } else {
        	System.out.println("6º No se cumple");
        	//Sexta Condicion
        }
        
        if(edadJuan<edadMaria/2 && (edadMaria==3*edadLuisa)) {
        	System.out.println("7º TRUE");
        } else {
        	System.out.println("8º FALSE");
        	//Septima condición
        }    
        
	
	}     

}
