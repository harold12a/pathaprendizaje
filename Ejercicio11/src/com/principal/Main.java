package com.principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("sueldo de trabajadores: ");
        System.out.println("ingrese la cantidad de sueldos de los trabajadores a calcular: ");

        float cantidadSueldo= entrada.nextFloat();
        float sueldoMayor=0;

        for (int i = 0; i <cantidadSueldo ; i++) {
            System.out.println("dijite el sueldo: "+(i+1));
            int tmp= entrada.nextInt();
            if(i==0){
                sueldoMayor=tmp;
            }else if (tmp>sueldoMayor) {
                sueldoMayor=tmp;

            }
        }
        System.out.println("el sueldo mayo es: "+sueldoMayor);

    }
}
