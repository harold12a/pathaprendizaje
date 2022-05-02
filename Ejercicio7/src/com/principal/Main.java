package com.principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float acumulador =1;
        float notas =0;

        System.out.println("ingrese la cantidad de califiaciones a promediar: ");
        float CF=entrada.nextFloat(); // cantidad de calificaciones
        while (acumulador<=CF){
            System.out.println("ingrese la califiacion numero: "+acumulador);
            float n = entrada.nextFloat();
            notas += n;
            acumulador++;
        }
        float promedio = notas / CF;

        System.out.println("el promedio es: "+promedio);









    }
}
