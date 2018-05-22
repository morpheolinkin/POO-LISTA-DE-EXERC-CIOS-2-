package listaexercicios2;

import java.util.Scanner;

public class ListaExercicios2 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);//CRIA UM OBJETO TECLADO DA CLASSE SCANNER
       
        System.out.println("Enter the name: ");
        String palavra = teclado.nextLine();//RECEBE ENTRADA DO TECLADO
        
        int carac = palavra.length();//CONTA QUANTOS CARACTERES TEM A PALAVRA        
        String maiusc = palavra.toUpperCase();//PASSA A PALAVRA PARA MAIUSCULA
        String prefixo;
        
        //VOGAIS
        int vogais = 0;//INICIA O CONTADOR COM 0
        int num = 0;//INICIA O CONTADOR COM 0
        String[] novo_palavra = maiusc.split("");//CRIA UM VETOR novo_palavra[] E RECEBE AS PALAVRA MAIUSCULA E QUEBRA COM O SPLINT
        
        for (String string: novo_palavra){//FOREACH PARA O VETOR DE STRING
            switch (string){//VERIFICA AS VOGAIS A, E, I ,O ,U
                case("A"):
                    vogais++;break;
                case("E"):
                    vogais++; break;
                case("I"):
                    vogais++;break;
                case("O"):
                    vogais++; break;
                case("1"):
                    num++; break;
                case("2"):
                    num++; break;
                case("3"):
                    num++;break;
                case("4"):
                    num++; break;
                case("5"):
                    num++;break;
                case("6"):
                    num++; break;
                case("7"):
                    num++;break;
                case("8"):
                    num++; break;
                case("9"):
                    num++;break;
                case("0"):
                    num++; break;
            }
        }
        
        //SE A STRING DIGITADA COMEÇA COM UNI
        
        if (maiusc.startsWith("UNI")){
            prefixo = maiusc;
            System.out.println("Sua palavra é prefixo UNI");
        }else {
            System.out.println("Sua palavra não é prefixo UNI");
        }
        //SE A STRING DIGITADA TERMINA COM RIO
        if (maiusc.endsWith("RIO")){
            System.out.println("Sua palavra é sufixo RIO");
        }else {
            System.out.println("Sua palavra não é sufixo RIO");
        }
        
        Poligo inverter = new Poligo();//Criado o objeto inverter da classe Poligo
        
        if (inverter.invertido(maiusc).equals(maiusc)){//Testa com o método equals()se a palavra invertida é igual, se for é um polídromo
            System.out.println("Esta palavra é um palídromo!");
        }else{
            System.out.println("Esta palavra não é um palídromo");
        }
       System.out.println("Sua palavra tem: "+vogais+" Vogais e: "+num+" numeros");
       
        
       
        
    }
    
}
