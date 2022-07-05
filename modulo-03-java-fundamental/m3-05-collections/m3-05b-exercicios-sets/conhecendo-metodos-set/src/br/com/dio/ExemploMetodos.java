package br.com.dio;

import java.util.*;

public class ExemploMetodos {

    public static void metodos(){

        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        System.out.println("1) Crie um conjunto e adicione suas notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5d, 9.3d, 5.0d, 7d, 0d, 3.6d));
        System.out.println(notas);
        System.out.println("Valores duplicados são inseridos apenas 1 vez");
        System.out.println("Os números não ficam na ordem de inserção,");
        System.out.println("mas de forma aleatória.");

        System.out.println("\n2) Exiba a posição da nota 5.0: ");
        System.out.println("Não é possível realizar pesquisa através de index");
        System.out.println("utilizando o Set, especialmente o HashSet.");
        System.out.println("Sets não possuem membros ordenados.");

        System.out.println("\n3) Adicione ao conjunto a nota 8.0 na posição 4: ");
        System.out.println("Vide acima.");

        System.out.println("\n4) Substitua a nota 5.0 pela nota 6.0: ");
        System.out.println("Sets não possuem métodos set & get");

        System.out.println("\n5) Confira se a nota 5.0 está no conjunto: ");
        System.out.println(notas.contains(5.0d));

        System.out.println("\n6) Exiba a terceira nota adicionada: ");
        System.out.println("Sets não possuem membros ordenados");
        System.out.println("ou métodos set & get.");

        System.out.println("\n7) Exiba a menor nota: ");
        System.out.println(Collections.min(notas));

        System.out.println("\n8) Exiba a maior nota: ");
        System.out.println(Collections.max(notas));

        System.out.println("\n9) Exiba a soma dos valores: ");

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("\n10 Exiba a média das notas: ");
        System.out.println("Média: " + soma/notas.size());

        System.out.println("\n11) Remova a nota 0.0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("\n12) Remova a nota na posição 0: ");
        System.out.println("Sets não possume membros ordenados.");

        System.out.println("\n13) Remova as notas menores que 7 e exiba a lista: ");
        notas.removeIf(next -> next < 7); // Usando Predicate
        /*
        Iterator<Double> i = notas.iterator();
        while(i.hasNext()){
            Double next = i.next();
            if(next < 7) i.remove();
        }
         */
        System.out.println(notas);

        System.out.println("\n14) Exiba todas as notas na ordem que foram informadas: ");
        System.out.println("HashSet não possui ordenação.");
        System.out.println("É necessário usar LinkedHashSet: ");
        Set<Double> notasLinked = new LinkedHashSet<>();
        notasLinked.add(7d);
        notasLinked.add(8.5d);
        notasLinked.add(9.3d);
        notasLinked.add(5d);
        notasLinked.add(0d);
        notasLinked.add(3.6d);
        System.out.println(notasLinked);

        System.out.println("\n15) Exiba todas as notas na ordem crescente: ");
        System.out.println("É necessário usar TreeSet: ");
        Set<Double> notasTree1 = new TreeSet<>(notas);
        Set<Double> notasTree2 = new TreeSet<>(notasLinked);
        System.out.println("HashSet:" + notasTree1);
        System.out.println("LinkedHashSet: " + notasTree2);

        System.out.println("\n16) Apague todo o conjunto: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("\n17) Confira se o conjunto está vazio: ");
        System.out.println("notas.isEmpty() == " + notas.isEmpty());
        System.out.println("notasLinked.isEmpty() == " + notasLinked.isEmpty());
    }


}
