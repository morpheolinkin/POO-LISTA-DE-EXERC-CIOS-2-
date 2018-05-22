/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios2;

public class Poligo {
    
    
public String invertido (String palindrome){    
    int len;
    len = palindrome.length();//Tamanho da String
    char[] tempCharArray = new char[len];//Array de caracteres 1
    char[] charArray = new char[len];//Array de caracteres 2
    
    // Coloca a String original no Array de caracteres 1
    for (int temp = 0; temp < len; temp++) {
      tempCharArray[temp] = palindrome.charAt(temp);//Coloca cada caracter da string em uma posição do vetor tempCharArray[]
    }
    // Vetor com caracteres invertidos
    for (int j = 0; j < len; j++) {
      charArray[j] = tempCharArray[len - 1 - j];//Coloca no charArray[] a string invertida
    }
    String reversePalindrome = new String(charArray);//Cria um novo objeto de Classe String passando o vetor como parâmetro
    
    return reversePalindrome;//Retorna a String invertida
    }
  }

