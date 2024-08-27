package com.itsolutioncompany.capitulo001;

import com.itsolutioncompany.bean.ClientePropuestosNaturalBuilder;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Pruebas {


    @Test
    public void NumeroDePlacas() {


        int minLength = 9;
        int maxLength = 12;

        // Usar un conjunto para asegurar que no haya cadenas duplicadas
        Set<String> uniqueStrings = new HashSet<>();

        // Generar cadenas únicas hasta llegar a 100
        Random random = new Random();

        while (uniqueStrings.size() < 10) {
            // Generar una longitud aleatoria dentro del rango
            int length = random.nextInt((maxLength - minLength) + 1) + minLength;

            // Resta 1 porque la primera posición será ocupada por 'N'
            int numericLength = length - 1;

            // Generar el número aleatorio de la longitud especificada
            StringBuilder sb = new StringBuilder();
            sb.append("N");  // Agregar la letra 'N' al inicio

            for (int i = 0; i < numericLength; i++) {
                int digit = random.nextInt(10);  // Genera un dígito entre 0 y 9
                sb.append(digit);
            }

            // Agregar la cadena al conjunto si es única
            uniqueStrings.add(sb.toString());
        }

        // Imprimir todas las cadenas generadas
        System.out.println("Cadenas generadas:");
        for (String s : uniqueStrings) {
            System.out.println(s);
        }
    }


    @Test
    public void Pruebas() {

        ClientePropuestosNaturalBuilder cliente = new ClientePropuestosNaturalBuilder.Builder()
                .setApellidom("Perez").build();

        System.out.println("Datos del Cliente: " + cliente.getApellidom());

    }

}
