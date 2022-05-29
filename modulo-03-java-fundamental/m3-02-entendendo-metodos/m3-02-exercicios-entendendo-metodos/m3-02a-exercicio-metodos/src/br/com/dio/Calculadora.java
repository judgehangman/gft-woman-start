package br.com.dio;

public class Calculadora {

    public static void somar(double num1, double num2){
        double resultado = num1 + num2;
        System.out.println("Soma de " + num1 + " e " + num2 + " é: " + resultado);

    }

    public static void subtrair(double num1, double num2){
        double resultado = num1 - num2;
        System.out.println("Subtração de " + num1 + " e " + num2 + " é: " + resultado);
    }

    public static void multiplicar(double num1, double num2){
        double resultado = num1 * num2;
        System.out.println("Multiplicação de " + num1 + " por " + num2 + " é: " + resultado);
    }

    public static void dividir(double num1, double num2){
        double resultado = num1 / num2;
        System.out.println("Divisão de " + num1 + " por " + num2 + " é: " + resultado);
    }

}
