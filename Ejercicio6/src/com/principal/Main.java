package com.principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner multiplicar = new Scanner(System.in);
        
        int numero;
        System.out.println("ingrese el numero a multiplicar: ");
        numero=multiplicar.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(numero+"x"+i+"="+numero*i);

            
        }
        
    }
}
