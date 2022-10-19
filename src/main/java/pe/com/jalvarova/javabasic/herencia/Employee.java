package pe.com.jalvarova.javabasic.herencia;

import java.util.StringJoiner;

public class Employee extends Person {

	private int idEmplado;
	private Double sueldo;
	private static int contadorEmpleado;

	public Employee(String nombre, Double sueldo) {
		super(nombre);
		contadorEmpleado++;
		this.idEmplado = contadorEmpleado;
		this.sueldo = sueldo;

	}

	public int getIdEmplado() {
		return idEmplado;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		StringJoiner builderObject = new StringJoiner(", ", this.getClass().getSimpleName(), "\n");

		builderObject.add("\t");
		builderObject.add(Integer.toString(idEmplado));
		builderObject.add(String.valueOf(sueldo));

		return super.toString() + builderObject.toString();
	}

}
