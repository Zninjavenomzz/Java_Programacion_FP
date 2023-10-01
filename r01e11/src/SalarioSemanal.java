import java.util.Scanner;

public class SalarioSemanal {
  
  public static final int EUROSHORA = 12;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("¿Cuantas horas has trabajado?: ");
    int htrabajo = scanner.nextInt();
    
    System.out.print("Si has trabajado ");
    System.out.println(htrabajo);
    System.out.print("Tu salario es: ");
    System.out.print(htrabajo*EUROSHORA);
    
    scanner.close();

  }

}
