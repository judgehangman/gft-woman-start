package br.com.dio;

public class Operacoes {

    public static boolean doConjuncao(boolean b1, boolean b2){
        return b1 && b2;
    }

    public static boolean doDisjuncao(boolean b1, boolean b2){
        return b1 || b2;
    }

    public static boolean doNegacaoBoolean1(boolean b1){
        return !b1;
    }

    public static boolean doNegacaoBoolean2(boolean b2){
        return !b2;
    }

    public static boolean doDisjuncaoExclusiva(boolean b1, boolean b2){
        return b1^b2;
    }

}
