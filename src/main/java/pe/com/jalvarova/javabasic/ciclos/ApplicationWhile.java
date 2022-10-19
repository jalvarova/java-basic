package pe.com.jalvarova.javabasic.ciclos;

import java.util.Scanner;

public class ApplicationWhile {
    public static void main(String[] args) {

        System.out.println("Por favor introduce el número de elementos a iterar:");
        int maxElementos;
        Scanner inputScanner = new Scanner(System.in); //Creacionde objeto Scanner para leer datos
        maxElementos = inputScanner.nextInt(); //Leemos el valor proporcionado por el usuario
        int count = 0;//Initialization the count
        while (count < maxElementos) {
            System.out.println("count = " + count);
            count++;
        }
    }
}
