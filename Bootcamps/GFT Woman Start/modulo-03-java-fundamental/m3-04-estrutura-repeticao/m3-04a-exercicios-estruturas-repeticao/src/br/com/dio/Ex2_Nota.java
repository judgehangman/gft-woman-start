package br.com.dio;

import java.util.Scanner;

public class Ex2_Nota {

    public static void lerNota(Scanner sc){

        float nota;

        System.out.println("Nota: ");
        nota = sc.nextFloat();

        while(nota<0 | nota >10){
            System.out.println("Por favor insira um valor entre 0 e 10");
            System.out.println("Nota: ");
            nota = sc.nextFloat();
        }

    }

}
