package br.com.dio;

public class Comparacoes {

    public static void compararInteiros(int i1, int i2){

        System.out.println("i1 == i2 " + (i1 == i2));
        System.out.println("i1 != i2 " + (i1 != i2));
        System.out.println("i1 > i2 " + (i1 > i2));
        System.out.println("i1 < i2 " + (i1 < i2));

    }

    public static void compararFloat(float f1, float f2){
        System.out.println("f1 == f2 " + (f1 == f2));
        System.out.println("f1 != f2 " + (f1 != f2));
        System.out.println("f1 > f2 " + (f1 > f2));
        System.out.println("f1 < f2 " + (f1 < f2));
    }

    public static void compararTexto(String s1, String s2, String s3){
        System.out.println("s1 == s2 " + (s1.equals(s2)));
        System.out.println("s1 == s2 (ignore case) " + (s1.equalsIgnoreCase(s2)));
        System.out.println("s1 != s2 " + (!s1.equals(s2)));
        System.out.println("s1 != s2 (ignore case) " + (!s1.equalsIgnoreCase(s2)));
        System.out.println("s1 > s2 " + (s1.length() > s2.length()));
        System.out.println("s1 < s2 " + (s1.length() < s2.length()));
    }

    public static void compararBool(boolean b1, boolean b2){
        System.out.println("b1 == b2 " + (b1 == b2));
        System.out.println("b1 != b2 " + (b1 != b2));
    }

    public static void compararLong(long l1, long l2){
        System.out.println("l1 == l2 " + (l1 == l2));
        System.out.println("l1 != l2 " + (l1 != l2));
        System.out.println("l1 > l2 " + (l1 > l2));
        System.out.println("l1 < l2 " + (l1 < l2));
    }

}
