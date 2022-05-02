package com.principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            int base=0;
            int exponente=0;
            int resultado=0;
            System.out.println("ingrese la basa: ");
            base= entrada.nextInt();
            System.out.println("ingrese el exponente: ");
            exponente=entrada.nextInt();

            resultado=base;
            int i =1;
            while(i<exponente){
                resultado=resultado*base;
                i++;
            }
        System.out.println(" el resultado de la opereacion es: ");
        System.out.println(resultado);








        }

        }


