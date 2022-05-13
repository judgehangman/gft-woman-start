package br.com.dio.judgehangman;

public class Main {

    public static void main(String[] args) {

        System.out.println("==========================\b");
        System.out.println("   OPERADORES UNARIOS    \n");
        posFix(10);
        System.out.println("\n");
        preFix(5);
        System.out.println("\n");
        opAritmetico(1);

    }

    // Operadores unarios

    private static void posFix(int i){

        int y= i;
        int x = i;

        int j = y++;
        j = y;

        int k = x--;
        k = x;

        System.out.println("Pós-Fixados: \b");
        System.out.println("i: " + i);
        System.out.println("j: " + j + " (i++)");
        System.out.println("k: " + k + " (i--)");

    }

    private static void preFix(int i){

        int y= i;
        int x = i;
        int z = i;

        int j = ++y;
        int k = --x;

        int iNeg = -i;
        int iComplemento = ~i;

        boolean bool = true;
        boolean notBool = !bool;

        System.out.println("Pré-fixados: \b");
        System.out.println("i: " + i);
        System.out.println("j: " + j + " (++i)");
        System.out.println("k: " + k + " (--i)");
        System.out.println("-i: " + (iNeg));
        System.out.println("complemento:" + (iComplemento));
        System.out.println("bool: " + bool);
        System.out.println("NOT: " + notBool + " (!bool)");
        System.out.println();
    }

    // Operadores aritméticos

    private static void opAritmetico(int i){

        int j = i+10;
        int k = j-i;
        int m = j*k;

        int n = m/2;
        int x = m%2;

        System.out.println("i: " + i);
        System.out.println("j (i+10): " + j);
        System.out.println("k (j-i): " + k);
        System.out.println("m (j*k):  " + m);
        System.out.println("n (m/2): " + n);
        System.out.println("x (m%2): " + x);
    }

}
