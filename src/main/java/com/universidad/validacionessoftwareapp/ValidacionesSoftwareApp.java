
package com.universidad.validacionessoftwareapp;
import java.util.Scanner;
public class ValidacionesSoftwareApp {

    public static void main(String[] args) {
        CalculadorEnvios calc = new CalculadorEnvios();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- PRUEBA MANUAL DE SISTEMA ---");
        System.out.println("Ingrese una distancia en KM:");
        
        try {
            int distancia = scanner.nextInt();
            double costo = calc.calcularCosto(distancia);
            System.out.println("El costo calculado es: $" + costo);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
