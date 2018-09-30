package pe.com.jalvarova.javabasic.objects;

import pe.com.jalvarova.javabasic.objects.Arithmetic.ArithmeticBuilder;

public class ApplicationMethod {

	public static void main(String[] args) {

		ArithmeticBuilder arithmetic = new Arithmetic.ArithmeticBuilder();

		System.out.println(arithmetic.opertion(1, 2).print());
	}

}
