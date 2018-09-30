package pe.com.jalvarova.javabasic.variable;

public class ApplicationVariablesHandled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaracion de variable
		boolean bool1;
		// Inicializacion de Variable
		bool1 = true;
		boolean bool2 = false;

		System.out.println("Valor bool1 " + bool1);
		System.out.println("Valor bool1 " + bool2);
		System.out.println();
		// Variable byte

		byte b1 = 10;

		byte b2 = 0xa;

		System.out.println("Valor byte1 " + b1);
		System.out.println("Valor byte2 " + b2);
		System.out.println();
		
		short s1 = 2;
		
		System.out.println("Char byte2 " + s1);
		System.out.println();
		
		//Declaracion en unicode y char como caracter
		char ch1= 65, ch2= 'A';
		System.out.println("Valor byte1 " + ch1);
		System.out.println("Valor byte2 " + ch2);
		System.out.println();
		
		//Variable enteras
        int decimal = 100;
        int octal = 0144;//Valor octal inicia con 0
        int hexa = 0x64;//Valor hexadecimal onicia con 0x
        System.out.println("Valor int decimal:" + decimal);
        System.out.println("Valor int octal:" + octal);
        System.out.println("Valor int hexadecimal:" + hexa);
        System.out.println();
        
        //Variables long
        long long1 = 10, long2 = 20L;
        System.out.println("Valor long1:" + long1);
        System.out.println("Valor long2:" + long2);
        System.out.println();
        
        //Variables float
        float f1 = 15, f2 = 22.3F;
        System.out.println("Valor float1:" + f1);
        System.out.println("Valor float2:" + f2);
        System.out.println();

        //Variables double
        double d1 = 11.0, d2 = 30.15D;
        System.out.println("Valor double1:" + d1);
        System.out.println("Valor double2:" + d2);
        System.out.println();

	}

}
