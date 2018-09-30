package pe.com.jalvarova.javabasic.objects;

public class ApplicationPasoPorReferencia {

	public static void main(String[] args) {
		Persona persona = new Persona();

		persona.cambiarNombre("Jorge");
		imprimirNombre(persona);
		modificarPersona(persona);
		imprimirNombre(persona);
	}

	private static void modificarPersona(Persona persona) {
		persona.cambiarNombre("Juan");

	}

	private static void imprimirNombre(Persona persona) {
		System.out.println("Nombre es : " + persona.obtenerNombre());

	}

}
