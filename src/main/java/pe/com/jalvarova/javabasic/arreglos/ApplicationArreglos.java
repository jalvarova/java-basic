package pe.com.jalvarova.javabasic.arreglos;

import pe.com.jalvarova.javabasic.palabrafinal.Persona;

public class ApplicationArreglos {
	public static void main(String[] args) {

		int[] ages = new int[3];
		
		ages[0]= 14;
		ages[1]=13;
		
		System.out.println("Index 0 = " + ages[0]);
		System.out.println("Index 1 = " + ages[1]);

		Persona[] persons = new Persona [4];
	
		persons[0] = new Persona("Alvaro");
		persons[1] = new Persona("Gonza");
		
		System.out.println(persons[0]);
		System.out.println(persons[1]);
		
		String[] names = {"Diego","Alvaro","Gonzalo","Maruja"};
		
		for(int i =0; i < names.length; i++) {
			System.out.println("Name Person "+ i + " de "+ names[i]);
		}
	}
}
