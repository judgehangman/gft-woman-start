package br.com.dio;

import java.util.Scanner;

public class Ex6_Fatorial {

    public static void calcularFatorial(Scanner sc){

        System.out.println("Numero: ");
        int fatorial = sc.nextInt();

        int multiplicacao = 1;


        for(int i = fatorial; i >=1; i--){
            multiplicacao = multiplicacao * i;
        }

        System.out.println(fatorial + "! = " + multiplicacao);

    }


}
