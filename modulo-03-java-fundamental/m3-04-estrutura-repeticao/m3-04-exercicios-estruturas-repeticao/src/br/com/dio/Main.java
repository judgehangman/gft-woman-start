package br.com.dio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome e Idade \n");
        Ex1_NomeIdade.lerNomeIdade(scanner);
        System.out.println("\n");
        System.out.println("------------------ \n");
        System.out.println("Notas \n");
        Ex2_Nota.lerNota(scanner);
        System.out.println("\n");
        System.out.println("------------------ \n");
        System.out.println("Maior e Media \n");
        Ex3_MaiorMedia.lerMaiorMedia(scanner);
        System.out.println("\n");
        System.out.println("------------------ \n");
        System.out.println("Par e Impar \n");
        Ex4_ParImpar.lerValores(scanner);
        System.out.println("\n");
        System.out.println("------------------ \n");
        System.out.println("Tabuada \n");
        Ex5_Tabuada.geradorTabuada(scanner);
        System.out.println("\n");
        System.out.println("------------------ \n");
        System.out.println("Fatorial \n");
        Ex6_Fatorial.calcularFatorial(scanner);
        System.out.println("\n");
        System.out.println("------------------ \n");


    }
}
