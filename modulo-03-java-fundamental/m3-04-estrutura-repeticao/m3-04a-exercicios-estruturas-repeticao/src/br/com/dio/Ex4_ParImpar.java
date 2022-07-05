package br.com.dio;

import java.util.Scanner;

public class Ex4_ParImpar {

    public static void lerValores(Scanner sc){

        int quantidade;
        int proxNumero;
        int pares = 0;
        int impares = 0;

        System.out.println("Quantidade de Numeros: ");
        quantidade = sc.nextInt();

        int count = 0;
        do{
            System.out.println("Número: ");
            proxNumero = sc.nextInt();

            if(proxNumero % 2 == 0){
                pares++;
            }else{
                impares++;
            }
            count++;

        }while(count < quantidade);

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }

}
