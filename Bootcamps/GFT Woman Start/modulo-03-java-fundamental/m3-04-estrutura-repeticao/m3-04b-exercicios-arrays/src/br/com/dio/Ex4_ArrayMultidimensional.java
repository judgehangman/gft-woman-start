package br.com.dio;

import java.util.Random;

public class Ex4_ArrayMultidimensional {

    public static void gerarMatriz(Random rd){

        int[][] M = new int[4][4];

        for(int i = 0; i< M.length; i++){
            for(int j = 0; j< M[i].length; j++){
                M[i][j] = rd.nextInt(9);
            }
        }

        System.out.println("\nMatriz: ");
        for (int[] linha : M) {
            for(int elemento : linha){
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

    }
}
