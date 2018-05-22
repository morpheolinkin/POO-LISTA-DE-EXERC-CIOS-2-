/*
*UNIRIO - TÉCNICAS DE PROGRAMAÇÃO II - LISTA DE EXERCÍCIOS 2 
*Faça um programa que, a partir de um texto digitado pelo usuário, 
*conte o número de caracteres total e o número de palavras 
*(palavra é definida por qualquer sequência de caracteres 
*delimitada por espaços em branco) e exiba o resultado. 

*#JEFFERSON MEDEIROS DA SILVA
*/

package pooatividade4;
import java.util.Scanner;

public class PooAtividade4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);//Classe Scanner, cria objeto teclado para receber entrada de dados padrão
        System.out.println("Informe o texto: ");//Terminal
        String texto = teclado.nextLine().toUpperCase();//Variável recebe dados do usuário com método toUpperCase()
        
        int carac = texto.length();//Conta quantos caracteres tem o texto/Tamanho da string
        
        int cont = 0;//Inicia o contador com 0
        
        /*
        O método split quebra uma String em várias substrings
        a partir de um caracter definido por você. Por exemplo,
        a String nome;teste;10, se você escolher como caracter o ";" 
        ele quebrará a string em nome teste 10, ou seja, um vetor de três posições.
        */
        String[] palavra = texto.split("");//Quebra a string onde tem espaço em branco
        
        for (String string: palavra){
            if (string.equals(" ")){//Compara quantos espaços em branco tem na string
                cont++;//Soma mais um a cada espaço em branco
            }
        }
        System.out.println("O texto tem "+carac+" caracteres");//Exibe a quantidade de caracter
        System.out.print("E tem "+(cont+1)+" palavras");//Exibe a quantidade de espaços em branco + 1, para dizer quantas palavras tem.
    }   
}
