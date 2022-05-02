package com.principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int MAT =0;
        float CAL1 =0;
        float CAL2=0;
        float CAL3=0;
        float CAL4=0;
        float CAL5=0;

        System.out.println("\n ingrese el numero de la matricula: ");
        MAT= entrada.nextInt();
        System.out.println("\n ingrese la calificacion numero 1: ");
        CAL1= entrada.nextFloat();
        System.out.println("\n ingrese la calificacion numero 2: ");
        CAL2 = entrada.nextFloat();
        System.out.println("\n ingrese la calificacion numero 3: ");
        CAL3= entrada.nextFloat();
        System.out.println("\n ingres la calificacion numero 4: ");
        CAL4= entrada.nextFloat();
        System.out.println("\n ingrese la califiacion numero 5: ");
        CAL5= entrada.nextFloat();

        float promedio = (CAL1+CAL2+CAL3+CAL4+CAL5)/5;

        System.out.println("matricula"+ MAT);
        System.out.println("promedio"+promedio);
        if(promedio>=6){
            System.out.println("aprobado");
        }
        else{
            System.out.println("no aprobado");
        }


    }
}
