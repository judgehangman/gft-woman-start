package br.com.dio;


public class Main {

    public static void main(String[] args) {

        System.out.println("1) Exiba as cores uma em baixo da outra: ");
        Rainbow.list();

        System.out.println("\n2) Exiba a quantidade de cores que o arco-íris tem: ");
        Rainbow.size();

        System.out.println("\n3) Exiba as cores em ordem alfabética");
        Rainbow.sort();

        System.out.println("\n4) Exiba as cores em ordem inversa da que foi informada");
        System.out.println("Dica: utilizar List e método da classe Collections");
        Rainbow.invert();

        System.out.println("\n5) Exiba todas as cores que começam com a letra V");
        Rainbow.showV();

        System.out.println("\n6) Remova todas as cores que não começam com a letra V");
        Rainbow.removeV();

        System.out.println("\n7) Limpe o conjunto & Confira se o conjunto está vazio");
        Rainbow.clear();
        Rainbow.isEmpty();

    }
}
