package pe.com.jalvarova.javabasic.herencia;

import java.util.Date;

public class ApplicationHerencia {

	public static void main(String[] args) {
		
		Empleado empleado = new Empleado("Alvaro Aguinaga", 10002.00);

		empleado.setGenero('M');
		empleado.setEdad(26);
		empleado.setDireccion("Calle San Miguel 488");
		System.out.println(empleado.toString());

		Cliente susan = new  Cliente("Susan Aracelli", new Date(), true);
		
		susan.setGenero('F');
		susan.setEdad(25);
		susan.setDireccion("AA.HH Pedro Laos");
		System.out.println(susan.toString());
		
		Cliente hector = new  Cliente("Hector Andre", new Date(), false);
		
		hector.setGenero('M');
		hector.setEdad(18);
		hector.setDireccion("AA.HH Pedro Laos");
		System.out.println(hector.toString());
		
	}

}
