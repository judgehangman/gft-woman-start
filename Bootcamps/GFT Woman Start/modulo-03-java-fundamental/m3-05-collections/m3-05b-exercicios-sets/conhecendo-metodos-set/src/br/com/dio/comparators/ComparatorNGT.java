package br.com.dio.comparators;

import br.com.dio.objetos.Serie;

import java.util.Comparator;

public class ComparatorNGT implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareToIgnoreCase(s2.getNome());
        int gen  = s1.getGenero().compareToIgnoreCase(s2.getGenero());
        int tempo = Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());

        if(nome==0){
            if(gen!=0){
                return gen;
            }else{
                return tempo;
            }
        }else{
            return nome;
        }
    }
}
