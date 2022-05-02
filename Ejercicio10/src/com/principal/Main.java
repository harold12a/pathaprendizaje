package com.principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("total a pagar en la farmacia es: ");
        float compraFarmacia=0;
        float pagar =0;

        compraFarmacia= entrada.nextFloat();

        if(compraFarmacia>= 0 && compraFarmacia <=500){
             pagar = compraFarmacia;
        }else if(compraFarmacia>=501 && compraFarmacia<=1000){
             pagar= compraFarmacia+compraFarmacia*0.05f;
        }else if(compraFarmacia>=1001 && compraFarmacia <=7000){
             pagar =compraFarmacia+compraFarmacia*0.11f;
        }else if(compraFarmacia >=7001 && compraFarmacia<=15000){
             pagar =compraFarmacia+compraFarmacia*0.18f;
        }else{
            pagar=compraFarmacia+compraFarmacia*0.25f;
        }
        System.out.println("el valor a pagar es de: "+pagar);


    }
}
