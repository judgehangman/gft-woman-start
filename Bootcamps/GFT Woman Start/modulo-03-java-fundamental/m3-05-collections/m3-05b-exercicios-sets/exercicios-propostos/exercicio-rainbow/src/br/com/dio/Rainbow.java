package br.com.dio;
import java.util.*;

public class Rainbow {

    static final Set<String> rainbow = new LinkedHashSet<>(){{
        add("Vermelho");
        add("Laranja");
        add("Amarelo");
        add("Verde");
        add("Azul");
        add("Índigo");
        add("Violeta");
    }};
    public static void list(){

        for(String cor : rainbow){
            System.out.println(cor);
        }
    }

    public static void size(){
       int size = rainbow.size();

        System.out.println("O arco-íris tem " + size + " cores");
    }

    public static void sort(){

        Set<String> rainbowSorted = new TreeSet<>(rainbow);

        for(String cor : rainbowSorted){
            System.out.println("* " + cor);
        }

    }

    public static void invert(){

        List<String> rainbowL = new ArrayList<>(rainbow);
        Collections.reverse(rainbowL);

        for(String cor : rainbowL){
            System.out.println(cor);
        }

    }

    public static void showV(){

        for (String cor : rainbow){

            if(cor.startsWith("V")){
                System.out.println(cor);
            }
        }
    }

    public static void removeV(){

        rainbow.removeIf(cor -> !cor.startsWith("V"));

        System.out.println(rainbow);

    }

    public static void clear(){
        rainbow.clear();
    }

    public static void isEmpty(){

        System.out.print("isEmpty?");

        if(rainbow.isEmpty()){
        System.out.print("\tSim");
        }else{
            System.out.print("\tNão");
        }
    }
}