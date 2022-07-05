package br.com.dio.objetos;
import java.util.Objects;

public class Serie implements Comparable<Serie>{
    private final String nome;
    private final String genero;private final Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    // Comparable -> identifica a ordem natural
    @Override
    public int compareTo(Serie serie) {
        int tempo = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        int gen = this.getGenero().compareTo(serie.getGenero());

        if(tempo != 0){
            return tempo;
        }else{
            return gen;
        }
    }
}




