package br.com.dio.comparators;

import br.com.dio.objetos.Serie;

import java.util.Comparator;

public class ComparatorGen implements Comparator<Serie> {
    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareToIgnoreCase(s2.getNome());
        int gen = s1.getGenero().compareToIgnoreCase(s2.getGenero());

        if(gen!=0){
            return gen;
        }else{
            return nome;
        }
    }
}