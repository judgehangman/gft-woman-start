package br.com.dio;

import java.util.Scanner;

public class Ex1_OrdemInversa {

    public static void inverterOrdem(Scanner sc){

        int[] vetor = new int[6];

       /* for(int i = 0; i <6;i++){
            System.out.println("Numero " + (i+1));
            int n = sc.nextInt();
            vetor[i] = n;
            i++;
        } */

        int k = 0;
        while(k <6){
            System.out.println("Numero " + (k+1));
            int n = sc.nextInt();
            vetor[k] = n;
            k++;
        }

        for (int m = (vetor.length-1); m >= 0; m--){
            System.out.print(vetor[m] + " ");
        }

    }
}
