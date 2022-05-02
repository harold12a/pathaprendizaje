package com.principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float salarioInferior = 1000;
        float salarioMayor =1000;

        System.out.println("ingrese el salario inferior a 1000");
        salarioInferior= entrada.nextFloat();
        System.out.println("ingrese el salario mayor a 1000");
        salarioMayor= entrada.nextFloat();

        salarioInferior+=salarioInferior*0.15f;
        salarioMayor+=salarioMayor*0.12f;


        System.out.println("el salario final menor a 1000 es: "+ salarioInferior);
        System.out.println("el salario mayor a 1000 es: "+ salarioMayor);



    }
}
