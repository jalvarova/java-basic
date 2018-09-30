package pe.com.jalvarova.javabasic.objects;

public class Arithmetic implements OperationArithmetic {

	@Override
	public int sumar(int num1, int num2) {

		return num1 + num2;
	}

	public static class ArithmeticBuilder {

		private Arithmetic arithmetic;


		public ArithmeticBuilder() {
			this.arithmetic = new Arithmetic();
		}


		public ArithmeticBuilder opertion(int num1, int num2) {
			arithmetic.sumar(num1, num2);
			return this;
		}

		public int print() {
			
			System.out.println("Result : " + 2);

			return 2;
		}

		public Arithmetic build() {
			arithmetic = new Arithmetic();
			return arithmetic;
		}
	}
}
