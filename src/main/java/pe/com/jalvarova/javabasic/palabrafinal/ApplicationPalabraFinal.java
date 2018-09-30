package pe.com.jalvarova.javabasic.palabrafinal;

public class ApplicationPalabraFinal {

	public static void main(String[] args) {

//		Falla al querer asignar a una variable statica
//		ClassFinal.VAR_PRIMITIVO = 15;

//		No se puede referenciar a un nuevo Objecto de una variable de objecto static
//		ClassFinal.persona = new Persona();

		System.out.println("Nombre de Persona :" + ClassFinal.persona.getNombre());

		ClassFinal.persona.setNombre("Alvaro");
		
		System.err.println("Nombre de Persona :" + ClassFinal.persona.getNombre());

	}

}
