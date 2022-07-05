package br.com.dio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploMetodosList {

    public static void metodos(){

        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 6, 0, 3.6], faça:

        System.out.println("1) Crie uma lista e adicione as 7 notas: ");
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(6.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);

        System.out.println("\n2) Exiba a posição da nota 5.0: ");
        System.out.print(notas.indexOf(5.0) + "\n");

        System.out.println("\n3) Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("\n4) Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);

        System.out.println("\n5) Confira se a nota 5.0 está na lista: ");
        System.out.println(notas.contains(5.0));

        System.out.println("\n6) Exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota: notas) {
            System.out.print(nota + " ");
        }

        System.out.println("\n \n7) Exiba a terceira nota adiciona: ");
        System.out.println(notas.get(2));

        System.out.println("\n8) Exiba a menor nota: ");
        System.out.println(Collections.min(notas));

        System.out.println("\n9) Exiba a maior nota: ");
        System.out.println(Collections.max(notas));

        System.out.println("\n10) Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("\n10) Exiba a média das notas: ");
        System.out.println(soma/notas.size());

        System.out.println("\n11) Remova a nota 0: ");
        notas.remove(0.0d);

        System.out.println("\n12) Remova a nota da posição 0: ");
        notas.remove(0);

        System.out.println("\n13) Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> i = notas.iterator();
        /* while (i.hasNext()){
            Double next = i.next();
            if(next<7){
                i.remove();
            }
        } */
        notas.removeIf(next -> next < 7);
        System.out.println(notas);

        System.out.println("\n14) Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("\n15) Confira se a lista está vazia: ");
        System.out.println(notas.isEmpty());

    }

}
