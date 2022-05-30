package br.com.dio;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

       // Ex1_OrdemInversa.inverterOrdem(scanner);
       // Ex2_Consoantes.lerConsoantes(scanner);
        Ex3_NumerosAleatorios.gerarAleatorios(random);
        Ex4_ArrayMultidimensional.gerarMatriz(random);
    }

}
