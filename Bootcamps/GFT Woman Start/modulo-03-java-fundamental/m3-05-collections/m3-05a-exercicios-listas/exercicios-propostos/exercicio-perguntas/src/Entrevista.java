import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Entrevista {

    public static void fazPerguntas(Scanner sc){

        List<String> categorias = Arrays.asList("Suspeita", "Cúmplice", "Assassina");
        List<String> respostasValidas = Arrays.asList("SIM", "NAO", "NÃO");

        List<String> perguntas = new ArrayList<>();
        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        // Checa Respostas
        int total = 0;
        for (String q : perguntas) {
            boolean isError = false;
            do {
                System.out.println(q);
                String resposta = sc.next();

                if (resposta.equalsIgnoreCase("Sim")){
                    isError = false;
                   total++;
                }else if(resposta.equalsIgnoreCase("Não")){
                    isError = false;
                }else if (!respostasValidas.contains(resposta.toUpperCase())){
                    System.out.println("Por favor, responda SIM ou NÃO");
                    isError = true;
                }
            } while (isError);
        }

        // Checa Classificação
        System.out.println("Classificação: ");
        if (total >= 2) {
            switch (total) {
                case 2:
                    System.out.print(categorias.get(0));
                    break;
                case 3:
                case 4:
                    System.out.print(categorias.get(1));
                    break;
                case 5:
                    System.out.print(categorias.get(2));
                    break;
                default:
                    System.out.println("Erro! Total acima do permitido!");
            }
        } else {
            System.out.print("Inocente");
        }

    }


}
