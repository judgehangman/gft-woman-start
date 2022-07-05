package br.com.dio;

import java.util.Random;

public class Ex3_NumerosAleatorios {

    public static void gerarAleatorios(Random rd){

        int[] randInt = new int[20];

        for(int i = 0; i< randInt.length; i++){
            int num = rd.nextInt(100);
            randInt[i] = num;
        }

        System.out.print("Numeros: ");
        for(int numero : randInt){
            System.out.print(numero + " ");
        }

        System.out.print("\nPredecessores: ");
        for (int numero : randInt) {
            System.out.print((numero-1) + " ");
        }

        System.out.print("\nSucessores: ");
        for(int numero : randInt){
            System.out.print((numero+1) + " ");
        }

        System.out.println();
    }

}
