
public class Referencias {

  public static void main(String[] args) {

   
   Persona persona1 = new Persona();
   persona1.edad = 33;
   persona1.numeroHijos = 1;
   persona1.peso = 80.43;
   
   Persona persona2 = new Persona();
   persona2.edad = persona1.edad;
   persona2.numeroHijos = persona1.numeroHijos;
   persona2.peso = 79.65;
   
   System.out.println("La persona 1 tiene " + persona1.edad + " años " + persona1.numeroHijos + 
       " hijos " + "y pesa " + persona1.peso + " kilos ");
   
   System.out.println("La persona 2 tiene " + persona2.edad + " años " + persona2.numeroHijos + 
       " hijos " + "y pesa " + persona2.peso + " kilos ");
   
   System.out.print(persona1 == persona2);

   //Tienen la misma edad y los mismos hijos pero pesan diferente
   
  }

}
