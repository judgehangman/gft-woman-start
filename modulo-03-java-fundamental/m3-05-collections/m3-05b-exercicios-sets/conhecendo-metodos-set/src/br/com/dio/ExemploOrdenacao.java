package br.com.dio;
import java.util.*;
import br.com.dio.comparators.*;
import br.com.dio.objetos.Serie;

/* Dadas as seguintes informações sobre minhas séries favoritas,
   crie um conjunto e ordene este conjunto, exibindo:
   (nome - genero - tempo de episódio);

   Série 1 = Nome: Game of Thrones, genero: fantasia, tempoEpisodio: 60
   Série 2 = Nome: Dark, genero: drama, tempoEpisodio: 60
   Série 3 = Nome: That 70s show, genero: comédia, tempoEpisodio: 25
 */
public class ExemploOrdenacao{
    static Set<Serie> minhasSeries = new HashSet<>(){{
        add(new Serie("That '70s Shows", "comédia", 25));
        add(new Serie("Dark", "drama", 60));
        add(new Serie("Game of Thrones", "fantasia", 60));

    }};
    public static void ordemPadrao(){

        System.out.println("1) Ordem aleatória: ");
        for (Serie serie : minhasSeries) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

    }

    public static void ordemInsercao(){

        System.out.println("\n2) Ordem de inserção: ");

        Set<Serie> minhasSeriesLinked = new LinkedHashSet<>(){{
            add(new Serie("That '70s Shows", "comédia", 25));
            add(new Serie("Dark", "drama", 60));
            add(new Serie("Game of Thrones", "fantasia", 60));

        }};

        for (Serie serie : minhasSeriesLinked) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

    }

    public static void ordemNatural(){

        System.out.println("\n3) Ordem Natural (tempoEpisodio)");

        Set<Serie> minhasSeriesTree = new TreeSet<>(minhasSeries);

        for(Serie serie : minhasSeriesTree){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

    }

    public static void ordemNGT(){

        System.out.println("\n4) Ordem Nome/Genero/tempoEpisodio): ");

        Set<Serie> minhasSeriesComp = new TreeSet<>(new ComparatorNGT());

        minhasSeriesComp.addAll(minhasSeries);

        for(Serie serie : minhasSeriesComp){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

    }

    public static void ordemGenero(){

        System.out.println("\n5) Ordem por genero: ");

        Set<Serie> minhasSeriesGen = new TreeSet<>(new ComparatorGen());

        minhasSeriesGen.addAll(minhasSeries);

        for(Serie serie : minhasSeriesGen){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

    }

    public static void ordemNome(){

        System.out.println("\n6) Ordem por Nome: ");

        Set<Serie> minhasSeriesNome = new TreeSet<>(new ComparatorNome());

        minhasSeriesNome.addAll(minhasSeries);

        for(Serie serie : minhasSeriesNome){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

    }

}
