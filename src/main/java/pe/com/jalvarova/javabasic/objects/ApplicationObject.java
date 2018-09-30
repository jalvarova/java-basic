package pe.com.jalvarova.javabasic.objects;

public class ApplicationObject {

	public static void main(String[] args) {
//		Creacion y Declaracion de Objecto
		Persona persona = new Persona();
		
		persona.nombre = "Alvaro";
		persona.apellidoPat = "Aguinaga";
		persona.apellidoMat = "Delgado";
		
		persona.print();
		
//		Creacion de Objecto
		Persona persona2 = new Persona();
		
		persona2.nombre = "Diego";
		persona2.apellidoPat = "Aguinaga";
		persona2.apellidoMat = "Delgado";
		
		persona2.print();
	}

}
