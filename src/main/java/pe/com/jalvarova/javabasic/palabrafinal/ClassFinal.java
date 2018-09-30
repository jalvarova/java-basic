package pe.com.jalvarova.javabasic.palabrafinal;

public final class ClassFinal {
	public static final int VAR_PRIMITIVO = 10;
	public static final Persona persona = new Persona("Alvaro");

	static {
		persona.setNombre("Gonza");
	}

	public final void medotoFinal() {
	}

}
