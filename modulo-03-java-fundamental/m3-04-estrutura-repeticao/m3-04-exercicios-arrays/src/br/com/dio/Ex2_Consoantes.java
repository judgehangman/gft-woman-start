package br.com.dio;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2_Consoantes {

    public static void lerConsoantes(Scanner sc){

        String[] vogais = {"a", "e", "i", "o", "u"};
        String[] consoantes = new String[6];

        int totalConsoantes = 0;

        int k = 0;
        while(k < 6){
            System.out.println("Caracter: ");
            String c = sc.next();
            if(!(Arrays.asList(vogais).contains(c))){
                consoantes[k] = c;
                totalConsoantes++;
            }
            k++;
        }

        System.out.println("Total de Consoantes: " + totalConsoantes);
        System.out.println("Consoantes: ");
        for(String consoante : consoantes){
            if(consoante != null){
                System.out.print(consoante + " ");
            }
        }
    }


}
