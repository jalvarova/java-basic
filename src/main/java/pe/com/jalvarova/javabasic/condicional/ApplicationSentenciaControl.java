package pe.com.jalvarova.javabasic.condicional;

public class ApplicationSentenciaControl {

	public static void main(String[] args) {
		//Ejemplo If/Else
        int x = 30;
        if (x < 20) {
            System.out.print("X menos que 20\n");
        } else {
            System.out.print("X mayor que 20\n");
        }
        
        int mes = 1; // Mes del anio
        String estacion;
        
        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otono";
        } else {
            estacion = "Mes incorrecto";
        }
        System.out.println("La estacion para el mes " + mes + " es: " + estacion);
        
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
        System.out.println("La estacion para el mes " + mesSwitch + " es: " + estacionSwitch);
        
	}

}
