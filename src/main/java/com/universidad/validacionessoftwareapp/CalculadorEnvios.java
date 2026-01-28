/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.universidad.validacionessoftwareapp;

public class CalculadorEnvios {
    //Regla de negocio:
    //- Si la distancia es negativa: Error.
    //- Menos de 5km: $10.
    //- Entre 5km y 20km: $20.
    //- Más de 20km: $50.
    public double calcularCosto(int distanciaKm) {
        if (distanciaKm < 0) {
            throw new IllegalArgumentException("La distancia no puede ser negativa");
        }
        
        if (distanciaKm < 5) {
            return 10.0;
        } else if (distanciaKm <= 20) {
            return 20.0;
        } else {
            return 50.0;
        }
    }
}
