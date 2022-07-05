package br.com.dio;

public class Main {

    public static void main(String[] args) {

        System.out.println("1) Ordem de Inserção");
        LinguagemFavorita.sort();

        System.out.println("2) Ordem Natural: ");
        LinguagemFavorita.sortNatural();

        System.out.println("3) Ordem por IDE: ");
        LinguagemFavorita.sortIDE();

        System.out.println("4) Ordem por Ano de Criação e Nome: ");
        LinguagemFavorita.sortAN();

        System.out.println("5) Ordem por Nome, Ano de Criação e IDE: ");
        LinguagemFavorita.sortNAI();

    }

}
