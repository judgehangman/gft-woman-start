package br.com.dio;

import java.util.Scanner;

public class Ex5_Tabuada {

    public static void geradorTabuada(Scanner sc){

        int multiplicador;

        System.out.println("Tabuada do Número: ");
        multiplicador = sc.nextInt();

        for(int i = 1; i<=10; i++){
            int r = multiplicador * i;
            System.out.println(multiplicador + " x " + i + " = " + r);
        }
    }

}
