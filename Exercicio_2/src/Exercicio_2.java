/* 
Author: Victor Figueira
Date:  17/09/2019
Task: 2. Faça uma thread Java que realize a leitura de um arquivo
texto com frases e exiba as frases a cada 10 segundos.
*/
public class Exercicio_2{
    public static void main(String[] args) {
            new threadReader("../resources/quotes.txt").start();
    }
}
