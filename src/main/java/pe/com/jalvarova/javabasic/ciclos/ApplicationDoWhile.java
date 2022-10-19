package pe.com.jalvarova.javabasic.ciclos;

public class ApplicationDoWhile {

	public static void main(String[] args) {
		int count = 0;
		int limit = 10;
		do {
			System.out.println("count = " + count);
			count++;
		} while (count < limit);
	}
}
