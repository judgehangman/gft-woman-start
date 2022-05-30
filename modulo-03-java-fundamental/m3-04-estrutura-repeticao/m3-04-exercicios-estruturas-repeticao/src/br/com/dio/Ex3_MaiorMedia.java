package br.com.dio;

import java.util.Scanner;

public class Ex3_MaiorMedia {

    public static void lerMaiorMedia(Scanner sc){

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do{
            System.out.println("Numero: ");
            numero = sc.nextInt();

            if(numero>maior) maior = numero;
            soma = soma + numero;

            count++;
        }while (count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + soma/5);
    }

}
