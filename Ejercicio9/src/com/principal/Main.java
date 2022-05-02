package com.principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("numero mayor y menor");
        System.out.println("digite la cantidad de numeros a organizar: ");

        int cantidadNumeros = entrada.nextInt();
        int numeroMenor=0;
        int numeroMayor=0;

        for (int i = 0; i <cantidadNumeros ; i++) {
            System.out.println("dijite el numero de la posicion: "+(i+1));
            int tmp=entrada.nextInt();
            if(i==0){
                numeroMenor=tmp;
                numeroMayor=tmp;
            } else if (tmp<numeroMenor){
                numeroMenor=tmp;
            }else if(tmp>numeroMayor){
                numeroMayor=tmp;
            }
        }
        System.out.println("el numero menor es: "+numeroMenor);
        System.out.println("el numoer mayor es: "+numeroMayor);
    }
}
