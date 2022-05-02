package com.principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor1 = 0;
        int boleto1=0;

        int valor2 = 0;
        int boleto2=0;

        int valor3= 0;
        int boleto3=0;

        int valor4 = 0;
        int boleto4=0;

        int valor5 = 0;
        int boleto5=0;

        System.out.println("ingrese la cantidad de compras del boleto1: ");
        System.out.println("cantidad boletos1:"+boleto1);
        boleto1=entrada.nextInt();
        System.out.println("valor de boletos1: "+valor1);
        valor1= entrada.nextInt();
        System.out.println("ingrese la cantidad de compras del boleto2: ");
        System.out.println("cantidad boletos2 :"+boleto2);
        boleto2= entrada.nextInt();
        System.out.println("valor de boletos2: "+valor2);
        valor2= entrada.nextInt();
        System.out.println("ingrese la cantidad de compras del boleto3: ");
        System.out.println("cantidad boletos3:"+boleto3);
        boleto3= entrada.nextInt();
        System.out.println("valor de boletos3: "+valor3);
        valor3= entrada.nextInt();
        System.out.println("ingrese la cantidad de compras del boleto4: ");
        System.out.println("cantidad boletos4:"+boleto4);
        boleto4= entrada.nextInt();
        System.out.println("valor de boletos4: "+valor4);
        valor4= entrada.nextInt();
        System.out.println("ingrese la cantidad de compras del boleto5: ");
        System.out.println("cantidad boletos5:"+boleto5);
        boleto5= entrada.nextInt();
        System.out.println("valor de boletos5: "+valor5);
        valor5= entrada.nextInt();


        int subTotalBoleto1= valor1+boleto1;
        int subTotalBoleto2= valor2+boleto2;
        int subTotalBoleto3= valor3+boleto3;
        int subTotalBoleto4= valor4+boleto4;
        int subTotalBoleto5= valor5+boleto5;
        int totalBoletos= subTotalBoleto1+subTotalBoleto2+subTotalBoleto3+subTotalBoleto4+subTotalBoleto5;

        System.out.println("valor boleto 1"+subTotalBoleto1);
        System.out.println("valor boleto 2"+subTotalBoleto2);
        System.out.println("valor boleto 3"+subTotalBoleto3);
        System.out.println("valor boleto 4"+subTotalBoleto4);
        System.out.println("valor boleto 5"+subTotalBoleto5);
        System.out.println("boletos totales : "+totalBoletos);
        
    }
}
