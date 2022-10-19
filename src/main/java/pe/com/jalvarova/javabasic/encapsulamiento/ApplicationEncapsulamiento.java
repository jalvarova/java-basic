package pe.com.jalvarova.javabasic.encapsulamiento;

public class ApplicationEncapsulamiento {

	public static void main(String[] args) {
		Person person = new Person("Alvaro Daniel", "Aguinaga Delgado", true);
		Person person2 = new Person("Diego Renato", "Aguinaga Delgado", true);

		System.out.println(person.nombreCompleto());
		System.out.println(person2.nombreCompleto());

		validatePerson(person);
		person.setBorrado(false);
		validatePerson(person);

		System.out.println(Person.getSizePerson());
	}

	private static void validatePerson(Person person) {
		if (person.isBorrado()) {
			System.out.println("\nNueva Persona Creada");
			person.print();
		} else {
			System.err.println("\nPersona Eliminado");
		}
	}
}
