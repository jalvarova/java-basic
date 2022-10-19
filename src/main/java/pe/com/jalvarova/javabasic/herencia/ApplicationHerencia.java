package pe.com.jalvarova.javabasic.herencia;

import java.util.Date;

public class ApplicationHerencia {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Alvaro Aguinaga", 10002.00);

		employee.setGenero('M');
		employee.setEdad(26);
		employee.setDireccion("Calle San Miguel 488");
		System.out.println(employee.toString());

		Client susan = new Client("Susan Aracelli", new Date(), true);
		
		susan.setGenero('F');
		susan.setEdad(25);
		susan.setDireccion("AA.HH Pedro Laos");
		System.out.println(susan.toString());
		
		Client hector = new Client("Hector Andre", new Date(), false);
		
		hector.setGenero('M');
		hector.setEdad(18);
		hector.setDireccion("AA.HH Pedro Laos");
		System.out.println(hector.toString());
		
	}

}
