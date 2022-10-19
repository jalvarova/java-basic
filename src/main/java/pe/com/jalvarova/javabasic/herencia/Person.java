package pe.com.jalvarova.javabasic.herencia;

import java.util.StringJoiner;

public class Person {

	private String nombre;
	private char genero;
	private int edad;
	private String direccion;

	public Person() {
		super();
	}

	public Person(String nombre) {
		this.nombre = nombre;
	}

	public Person(String nombre, char genero, int edad, String direccion) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.direccion = direccion;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		StringJoiner builderObject = new StringJoiner(",", "[", "]\n");

		String genero = this.getGenero() == 'M' ? "Masculino" : "Femenino";
		builderObject.add(nombre);
		builderObject.add(genero);
		builderObject.add(Integer.toString(edad));
		builderObject.add(direccion);
		return builderObject.toString();
	}

}
