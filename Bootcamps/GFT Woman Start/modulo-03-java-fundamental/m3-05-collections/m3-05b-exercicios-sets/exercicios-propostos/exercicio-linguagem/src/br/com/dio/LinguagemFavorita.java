package br.com.dio;

import java.util.*;

public class LinguagemFavorita{

    static final Set<Linguagem> LINGUAGEM_SET = new LinkedHashSet<>(){{
        add(new Linguagem("Java",1996,"IntelliJ Idea"));
        add(new Linguagem("Lua", 1993, "ZeroBrane Studio"));
        add(new Linguagem("C#", 2000, "Visual Studio"));

    }};


    public static void sort(){
        for(Linguagem ling : LINGUAGEM_SET){
            System.out.println(ling);
        }
    }

    public static void sortNatural(){

        Set<Linguagem> lingTree = new TreeSet<>(LINGUAGEM_SET);
        for(Linguagem ling : lingTree){
            System.out.println(ling);
        }

    }

    public static void sortIDE(){
        Set<Linguagem> ideTree = new TreeSet<>(new ComparatorIDE());
        ideTree.addAll(LINGUAGEM_SET);

        for(Linguagem ling : ideTree){
            System.out.println(ling);
        }

    }

    public static void sortAN(){
        Set<Linguagem> anTree = new TreeSet<>(new ComparatorAN());
        anTree.addAll(LINGUAGEM_SET);

        for(Linguagem ling : anTree){
            System.out.println(ling);
        }
    }

    public static void sortNAI(){
        Set<Linguagem> naiTree = new TreeSet<>(new ComparatorNAI());
        naiTree.addAll(LINGUAGEM_SET);

        for(Linguagem ling : naiTree){
            System.out.println(ling);
        }
    }

}

class Linguagem implements Comparable<Linguagem>{

    private final String nome;
    private final int anoCriacao;
    private final String ide;

    public Linguagem(String nome, int anoCriacao, String ide) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "\n * "+ nome +
                " (" + anoCriacao + ") " +
                " | IDE: " + ide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Linguagem linguagem = (Linguagem) o;
        return anoCriacao == linguagem.anoCriacao && nome.equals(linguagem.nome) && ide.equals(linguagem.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoCriacao, ide);
    }

    @Override
    public int compareTo(Linguagem linguagem) {

        return this.getNome().compareToIgnoreCase(linguagem.getNome());

    }
}

class ComparatorIDE implements Comparator<Linguagem>{

    @Override
    public int compare(Linguagem l1, Linguagem l2) {

        return l1.getIde().compareToIgnoreCase(l2.getIde());
    }
}

class ComparatorAN implements Comparator<Linguagem>{


    @Override
    public int compare(Linguagem l1, Linguagem l2) {
        int ano = Integer.compare(l1.getAnoCriacao(), l2.getAnoCriacao());
        int nome = l1.getNome().compareToIgnoreCase(l2.getNome());

        if(ano!=0){
            return ano;
        }else{
            return nome;
        }
    }
}

class ComparatorNAI implements Comparator<Linguagem>{


    @Override
    public int compare(Linguagem l1, Linguagem l2) {
        int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
        int ano = Integer.compare(l1.getAnoCriacao(), l2.getAnoCriacao());
        int ide = l1.getIde().compareToIgnoreCase(l2.getIde());

        if(nome!=0){
            return nome;
        }else{
            if(ano!=0){
                return ano;
            }else{
                return ide;
            }
        }

    }
}
