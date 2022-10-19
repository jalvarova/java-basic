package pe.com.jalvarova.javabasic.encapsulamiento;

import java.util.StringJoiner;

public class Person {

//	Atributos de clase
	private int codigo;
	private String nombre;

	private String apellido;

	private boolean borrado;
	private static int contadorPersonas;

	public Person(String nombre, String apellido, boolean borrado) {
		super();
		contadorPersonas++;
		this.codigo = contadorPersonas;
		this.nombre = nombre;
		this.apellido = apellido;
		this.borrado = borrado;
	}
	
	public static int getSizePerson() {
		return contadorPersonas;
	}

	private StringJoiner builderObject;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public boolean isBorrado() {
		return borrado;
	}

	public void setBorrado(boolean borrado) {

		this.borrado = borrado;
	}

	public Person print() {
		System.out.println(toString());
		return this;
	}

	public String nombreCompleto() {
		builderObject = new StringJoiner(", ");
		builderObject.add(nombre);
		builderObject.add(apellido);
		return builderObject.toString();
	}

//	Metodos de clase
	public String toString() {
		builderObject = new StringJoiner(", ", "[", "]\n");

		builderObject.add(nombre);
		builderObject.add(apellido);
		builderObject.add(String.valueOf(borrado));
		
		return "Informacion de la Persona : " + builderObject.toString();
	}
}
