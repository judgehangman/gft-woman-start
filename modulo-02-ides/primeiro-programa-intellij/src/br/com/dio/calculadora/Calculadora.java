package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro numero inteiro: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        b = sc.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);

        System.out.println("Somar: " + somar);
        System.out.println("Subtrair: " + subtrair);
        System.out.println("Multiplicar: " + multiplicar);
        System.out.println("Dividir: " + dividir);
    }

    public static int somar(int a, int b){
        return a + b;
    }
    public static int subtrair(int a, int b){
        return a - b;
    }
    public static int multiplicar(int a, int b){
        return a * b;
    }
    public static double dividir(double a, double b){
        return a/b;
    }
}
