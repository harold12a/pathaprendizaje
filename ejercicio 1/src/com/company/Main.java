package com.company;

public class Main {

    public static void main(String[] args) {
        int sumPar=0;
        int sumImpar=0;
        int promedioPar= 0;


        for (int i=1; i<=270; i++){
            int num = (int) 270;
            if (num%2!=0){
                sumImpar+=num;
            }else{
                sumPar+=num;
            }
        }
        promedioPar = sumPar/270;

        System.out.println("Suma de Impares: " + sumPar);

        System.out.println("Promedio de números pares: " + promedioPar);
    }
}

