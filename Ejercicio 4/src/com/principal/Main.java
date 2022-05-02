package com.principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float SUE;

        System.out.println("\n ingrese el valor del sueldo: ");
        SUE= entrada.nextFloat();

        if( SUE <=1000 ){
             SUE = (float) (SUE * 1.15);
        }else{
            SUE=(float) (SUE * 1.12);
        }
        System.out.println("\n nuevo sueldo: "+ SUE);
    }
}
