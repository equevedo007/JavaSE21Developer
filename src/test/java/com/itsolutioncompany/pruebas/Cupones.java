package com.itsolutioncompany.pruebas;

import org.testng.annotations.Test;

import java.util.Random;

public class Cupones {

    private static final String LETRAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMEROS = "0123456789";

    @Test
    public void GenerarCupones(){

        for (int i = 0; i < 10000; i++) {
            System.out.println(generarCodigo());
        }

    }

    // Método para generar un código alfanumérico aleatorio
    public static String generarCodigo() {
        Random random = new Random();
        StringBuilder codigo = new StringBuilder();

        // Generar 4 grupos separados por guiones
        codigo.append(generarGrupo(random, 2, true)); // Primer grupo (puede ser letras y números)
        codigo.append("-");
        codigo.append(generarGrupo(random, 2, false)); // Segundo grupo (solo números)
        codigo.append("-");
        codigo.append(generarGrupo(random, 2, true)); // Tercer grupo (puede ser letras y números)
        codigo.append("-");
        codigo.append(generarGrupo(random, 2, true)); // Cuarto grupo (puede ser letras y números)

        return codigo.toString();
    }

    // Método para generar un grupo de longitud especificada (puede contener letras y números)
    private static String generarGrupo(Random random, int longitud, boolean mezcla) {
        StringBuilder grupo = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            if (mezcla) {
                // Mezclar letras y números
                if (random.nextBoolean()) {
                    grupo.append(LETRAS.charAt(random.nextInt(LETRAS.length())));
                } else {
                    grupo.append(NUMEROS.charAt(random.nextInt(NUMEROS.length())));
                }
            } else {
                // Solo números
                grupo.append(NUMEROS.charAt(random.nextInt(NUMEROS.length())));
            }
        }

        return grupo.toString();
    }



}
