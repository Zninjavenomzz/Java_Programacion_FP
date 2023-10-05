
public class Actividad202 {

  public static void main(String[] args) {
   
   Persona persona1 = new Persona();
   persona1.edad = 25;
   persona1.numeroHijos = 0;
   persona1.peso = 75.4;
   
   Persona persona2 = new Persona();
   persona2.edad = 65;
   persona2.numeroHijos = 3;
   persona2.peso = 65;
   
   System.out.println("La persona 1 tiene " + persona1.edad + " años " + persona1.numeroHijos + 
       " hijos " + "y pesa " + persona1.peso + " kilos ");
   
   System.out.println("La persona 2 tiene " + persona2.edad + " años " + persona2.numeroHijos + 
       " hijos " + "y pesa " + persona2.peso + " kilos ");
   
   System.out.print(persona1 == persona2);
  }

}
