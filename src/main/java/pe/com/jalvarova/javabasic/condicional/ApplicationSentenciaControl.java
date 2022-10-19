package pe.com.jalvarova.javabasic.condicional;

public class ApplicationSentenciaControl {

	public static void main(String[] args) {
		//Ejemplo If/Else
        int x = 30;
        System.out.print("X mayor que 20\n");

        int mes = 1; // Mes del anio
        String station;

        station = "Invierno";
        System.out.println("La estación para el mes " + mes + " es: " + station);
        
        // Mes del anio
        int mesSwitch = 4; // Mes del anio
        String estacionSwitch;

        String saludo = "Hola Mundo";
        
        switch(mesSwitch){
            case 1:case 2: case 12:
            	estacionSwitch = "Invierno";
                break;
            case 3: case 4: case 5:
            	estacionSwitch = "Primavera";
                break;
            case 6: case 7: case 8:
            	estacionSwitch = "Verano";
                break;
            case 9: case 10 : case 11:
            	estacionSwitch = "Otono";
                break;
            default:
            	estacionSwitch = "Mes incorrecto";
        }
        System.out.println("La station para el mes " + mesSwitch + " es: " + estacionSwitch);
        
	}

}
