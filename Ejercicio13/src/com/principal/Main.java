package com.principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int base , exponente;
        System.out.println("ingrese la basa: ");
        base= entrada.nextInt();
        System.out.println("ingrese el exponente: ");
        exponente=entrada.nextInt();
        System.out.println("resultado: "+pot(base,exponente));
        System.out.println("resultado: "+Math.pow((double) base,(double) exponente));

    }
    public static int pot(int a, int b){
        int acumulador =1;
        for (int i = 1; i <=b ; i++) {
            acumulador=acumulador*a;

        }
        return (acumulador);
    }



}
