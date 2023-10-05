
public class PersonaNull {

	public static void main(String[] args) {

		Persona persona1 = new Persona();
		persona1.edad = 25;
		persona1.peso = 40.5;

		Persona persona2 = new Persona();
		persona2.edad = 35;
		persona2.peso = 55.6;
		
		Persona persona3 = persona2;
		persona3.edad = 40;
		persona3 = null;
		

		System.out.println("La persona 1 tiene " + persona1.edad + " años y pesa " + persona1.peso + " kilos ");

		System.out.println("La persona 2 tiene " + persona2.edad + " años y pesa " + persona2.peso + " kilos ");
		
		System.out.println("La persona 3 tiene " + persona3.edad + " años y pesa " + persona3.peso + " kilos ");

		
	}

}
