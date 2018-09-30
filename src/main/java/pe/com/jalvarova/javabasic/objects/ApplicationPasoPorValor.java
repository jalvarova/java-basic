package pe.com.jalvarova.javabasic.objects;

public class ApplicationPasoPorValor {

	public static void main(String[] args) {

		int x = 10;
		imprimir(x);
		cambiarValor(x);
		imprimir(x);
		
	}

	private static void cambiarValor(int x) {
		x=200;
		
	}

	private static void imprimir(int i) {
		System.out.println("Valor recibido " + i);

	}
	

}
