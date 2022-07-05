package br.com.dio;

import java.util.Scanner;

public class Ex1_NomeIdade {

    public static void lerNomeIdade(Scanner sc){

        String nome;
        int idade;

        while(true){
            System.out.println("Nome: ");
            nome = sc.next();
            if(nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = sc.nextInt();
        }
    }

}
