package pe.com.jalvarova.javabasic.arreglos;

import pe.com.jalvarova.javabasic.palabrafinal.Persona;

public class ApplicationArreglos {
	public static void main(String[] args) {

		int edades[] = new int[3];
		
		edades[0]= 14;
		edades[1]=13;
		
		System.out.println("Indice 0 = " + edades[0]);
		System.out.println("Indice 1 = " + edades[1]);

		Persona personaa[] = new Persona [4]; 
	
		personaa[0] = new Persona("Alvaro");
		personaa[1] = new Persona("Gonza");
		
		System.out.println(personaa[0]);
		System.out.println(personaa[1]);
		
		String[] names = {"Diego","Alvaro","Gonzalo","Maruja"};
		
		for(int i =0; i < names.length; i++) {
			System.out.println("Nombre de personas "+ i + " de "+ names[i]);
		}
	}
}
