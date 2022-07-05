package br.com.dio;

public class Meses {

    public static void exibirMes(int mesNumero){
        int i = mesNumero-1;

        String[] mesArray ={"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

       if(i <= mesArray.length){
           System.out.println("Mês: " + mesArray[i]);
           if(mesNumero == 1  || mesNumero == 12 || mesNumero == 7){
               System.out.println("Férias");
           }
       }
       else{
           System.out.println("Não é um mês válido");
       }
    }
}
