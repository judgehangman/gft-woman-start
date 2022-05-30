package br.com.dio;

public class Main {

    public static void main(String[] args) {

        System.out.println("TRUE e FALSE");
        System.out.println("Conjunção: " + Operacoes.doConjuncao(true,false));
        System.out.println("Disjunção: " + Operacoes.doDisjuncao(true, false));
        System.out.println("Disjunção Exclusiva: " + Operacoes.doDisjuncaoExclusiva(true, false));

        System.out.println("TRUE e TRUE");
        System.out.println("Conjunção: " + Operacoes.doConjuncao(true, true));
        System.out.println("Disjunção: " + Operacoes.doDisjuncao(true, true));
        System.out.println("Disjunção Exclusiva: " + Operacoes.doDisjuncaoExclusiva(true, true));

        System.out.println("FALSE e FALSE");
        System.out.println("Conjunção: " + Operacoes.doConjuncao(false,false));
        System.out.println("Disjunção: " + Operacoes.doDisjuncao(false, false));
        System.out.println("Disjunção Exclusiva: " + Operacoes.doDisjuncaoExclusiva(false, false));


    }
}
