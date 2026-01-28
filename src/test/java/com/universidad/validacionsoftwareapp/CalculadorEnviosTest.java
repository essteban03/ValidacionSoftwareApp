/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.universidad.validacionsoftwareapp;

import com.universidad.validacionessoftwareapp.CalculadorEnvios;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadorEnviosTest {

    CalculadorEnvios calculadora = new CalculadorEnvios();

    // PRUEBA 1: Distancia corta (Debe cobrar $10)
    @Test
    public void testDistanciaCorta() {
        double resultado = calculadora.calcularCosto(3);
        assertEquals(10.0, resultado, "El costo para 3km debería ser 10.0");
    }

    // PRUEBA 2: Distancia media (Debe cobrar $20)
    @Test
    public void testDistanciaMedia() {
        double resultado = calculadora.calcularCosto(15);
        assertEquals(20.0, resultado, "El costo para 15km debería ser 20.0");
    }

    // PRUEBA 3: Borde exacto (20km exactos debe ser $20)
    @Test
    public void testLimiteExacto() {
        double resultado = calculadora.calcularCosto(20);
        assertEquals(20.0, resultado, "El costo para 20km debería ser 20.0");
    }

    // PRUEBA 4: Manejo de Errores (Distancia negativa)
    @Test
    public void testDistanciaNegativa() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularCosto(-5);
        });
        assertEquals("La distancia no puede ser negativa", exception.getMessage());
    }
    
}
