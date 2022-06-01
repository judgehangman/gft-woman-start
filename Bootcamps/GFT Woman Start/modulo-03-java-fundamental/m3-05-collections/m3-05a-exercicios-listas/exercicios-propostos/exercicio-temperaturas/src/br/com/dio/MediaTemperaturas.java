package br.com.dio;


import java.util.*;

public class MediaTemperaturas {

    public static void exibirMedias(Scanner sc){

        List<Double> temperaturas = new ArrayList<>();

        // Inputs
        System.out.println("Temperatura média de Janeiro: ");
        temperaturas.add(sc.nextDouble());
        System.out.println("Temperatura média de Fevereiro: ");
        temperaturas.add(sc.nextDouble());
        System.out.println("Temperatura média de Março: ");
        temperaturas.add(sc.nextDouble());
        System.out.println("Temperatura média de Abril: ");
        temperaturas.add(sc.nextDouble());
        System.out.println("Temperatura média de Maio: ");
        temperaturas.add(sc.nextDouble());
        System.out.println("Temperatura média de Junho: ");
        temperaturas.add(sc.nextDouble());

        // Calcula a soma dos valores
        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        Double media = soma/temperaturas.size(); // Calcula a média dos valores

        // Determina os meses e exibe-os
        System.out.println("Acima da média: ");
        for (Double valor : temperaturas) {
            if(valor>media){
                int index = temperaturas.indexOf(valor);

                switch(index){
                    case 0:
                        System.out.println("Janeiro (" + valor +"C)");
                        break;
                    case 1:
                        System.out.println("Fevereiro (" + valor +"C)");
                        break;
                    case 2:
                        System.out.println("Março (" + valor +"C)");
                        break;
                    case 3:
                        System.out.println("Abril (" + valor +"C)");
                        break;
                    case 4:
                        System.out.println("Maio (" + valor +"C)");
                        break;
                    case 5:
                        System.out.println("Junho (" + valor +"C)");
                        break;
                }
            }
        }
    }

}
