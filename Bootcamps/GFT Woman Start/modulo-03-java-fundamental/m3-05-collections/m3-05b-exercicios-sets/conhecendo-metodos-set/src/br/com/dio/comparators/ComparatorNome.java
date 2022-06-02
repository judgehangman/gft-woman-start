package br.com.dio.comparators;

import br.com.dio.objetos.Serie;

import java.util.Comparator;

public class ComparatorNome implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareToIgnoreCase(s2.getNome());
        int gen = s1.getGenero().compareToIgnoreCase(s2.getGenero());

        if(nome!=0){
            return nome;
        }else{
            return gen;
        }
    }
}
