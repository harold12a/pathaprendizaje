package com.principal;

public class Main {

    public static void main(String[] args) {
        System.out.println("tablas de multiplicar");
        for (int mult = 1; mult <=10 ; mult++) {
            System.out.println();
            for (int multiplicando = 1; multiplicando <=10 ; multiplicando++) {
                System.out.printf("%2d x %2d = %3d \t",multiplicando,mult,(multiplicando*mult));

            }

        }

    }
}
