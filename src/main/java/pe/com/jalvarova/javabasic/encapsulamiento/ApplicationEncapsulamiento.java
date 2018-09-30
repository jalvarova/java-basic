package pe.com.jalvarova.javabasic.encapsulamiento;

public class ApplicationEncapsulamiento {

	public static void main(String[] args) {
		Persona persona = new Persona("Alvaro Daniel", "Aguinaga Delgado", true);
		Persona persona2 = new Persona("Diego Renato", "Aguinaga Delgado", true);

		System.out.println(persona.nombreCompleto());
		System.out.println(persona2.nombreCompleto());

		validatePersona(persona);
		persona.setBorrado(false);
		validatePersona(persona);

		System.out.println(Persona.getSizePerson());
	}

	private static void validatePersona(Persona persona) {
		if (persona.isBorrado()) {
			System.out.println("\nNueva Persona Creada");
			persona.print();
		} else {
			System.err.println("\nPersona Eliminado");
		}
	}
}
