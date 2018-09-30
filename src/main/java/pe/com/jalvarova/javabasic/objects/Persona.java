package pe.com.jalvarova.javabasic.objects;

import java.util.StringJoiner;

public class Persona {

//	Atributos de clase
	String nombre;
	String apellidoPat;
	String apellidoMat;

	StringJoiner builderObject;

	public void cambiarNombre(String name) {
		nombre =name;
	}
	public String obtenerNombre() {
		return this.nombre;
	}
	public Persona print() {
		System.out.println(leerObject());
		return this;
	}

//	Metodos de clase
	public String leerObject() {
		builderObject = new StringJoiner(",", "[", "]\n");

		builderObject
		.add(nombre)
		.add(apellidoPat)
		.add(apellidoMat);
		
		return "Name Complete : " + builderObject.toString();
	}
}
