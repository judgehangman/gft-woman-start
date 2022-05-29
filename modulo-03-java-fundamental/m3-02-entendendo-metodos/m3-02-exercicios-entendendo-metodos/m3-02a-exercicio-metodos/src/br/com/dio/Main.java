/* Crie uma aplicação que resolva as seguintes situações:
Calcule 4 operações basicas: soma, subtração, divisão e multiplicação
Sempre dois valores devem ser passados.

A partir da hora do dia, informe a mensagem adequada: bom dia, boa tarde, boa noite

Calcule o valor final de um empréstimo a partir do valor solicitado. Taxas e parcelas influenciam.
Defina arbitrariamente as faixas que influenciam nos valores.

Tente ao máximo criar métodos que trabalhem sozinhos ou em conjunto
Pode chamar um método dentro do outro
Pode passar como parâmetro a chamada de outro método

*/
package br.com.dio;

public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("### Calculadora ### \n");
        Calculadora.somar(44,22);
        Calculadora.subtrair(43,19.2);
        Calculadora.multiplicar(4,1.7);
        Calculadora.dividir(15,2);
        System.out.println("\n");

        // Mensagem
        System.out.println("### Mensagem ### \n");
        Mensagem.enviarMensagem(9);
        Mensagem.enviarMensagem(14);
        Mensagem.enviarMensagem(1);
        System.out.println("\n");

        //Emprestimo
        System.out.println("### Empréstimo ###");
        Emprestimo.calcularEmprestimo(1000,Emprestimo.getDuasParcelas());
        Emprestimo.calcularEmprestimo(1000,Emprestimo.getTresParcelas());
        Emprestimo.calcularEmprestimo(1000,5);
    }

}
