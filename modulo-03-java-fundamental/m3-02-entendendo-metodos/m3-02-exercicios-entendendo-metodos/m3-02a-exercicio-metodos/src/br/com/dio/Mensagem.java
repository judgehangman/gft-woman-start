package br.com.dio;

public class Mensagem {

    public static void enviarMensagem(int hora){

        if(hora >= 5 && hora <= 12){
            System.out.println("Bom dia!");
        }else if(hora > 12 && hora <= 18){
            System.out.println("Boa tarde!");
        }else if ((hora >= 0 && hora <=4) || (hora > 18 && hora <= 24)){
            System.out.println("Boa noite!");
        }else{
            System.out.println("Hora inválida");
        }
    }
}
