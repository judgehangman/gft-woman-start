package br.com.dio;

import java.util.*;

public class ExemploOrdenacaoList {

    /* Dadas as seguintes informações sobre meus gatos, crie uma lista
    *  e ordene esta lista exibindo:
    *  (nome - idade - cor);
    *
    *  Gato 1 = nome: Jon, idade: 18, cor: preto
    *  Gato 2 = nome: Simba, idade: 6, cor: tigrado
    *  Gato 3 = nome: Jon, idade: 12, cor: amarelo
    * */

    public static void metodos(){

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon",18,"preto"));
            add(new Gato("Simba",6,"tigrado"));
            add(new Gato("Jon",12,"amarelo"));
        }};

        System.out.println("1) Ordem de inserção: ");
        System.out.println(meusGatos);

        System.out.println("2) Ordem aleatória: ");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("3) Ordem Natural (Nome): ");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("4) Ordem Idade: ");
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("5) Ordem Cor: ");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("6) Ordem Nome/Cor/Idade: ");
        meusGatos.sort(new ComparatorNCI());
        System.out.println(meusGatos);

    }

}

class Gato implements Comparable<Gato>{

    private String nome;
    private Integer idade;
    private String cor;

    // Constructor
    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    // Getters

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome: \"" + nome + '\"' +
                "| idade: " + idade +
                " | cor: \"" + cor + '\"' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

}

class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(),g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNCI implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        int n = g1.getNome().compareToIgnoreCase(g2.getNome());
        int c = g1.getCor().compareToIgnoreCase(g2.getCor());

        if(n!=0){return n;}
        else{
            if(c!=0) return c;
            else return Integer.compare(g1.getIdade(), g2.getIdade());
        }
    }
}
