/* 
Author: Victor Figueira
Date:  17/09/2019
Task: 5. Faça uma thread Java que fica aguardando uma sequência
numérica de tamanho arbitrário digitado por usuário para
realizar uma soma. Use o join().
*/
public class Exercicio_5  {
    public static void main(String[] args) throws InterruptedException{
        threadSum t_sum =  new threadSum();
        t_sum.start();
        t_sum.join();
        System.out.println("The numbers added are equal to: " + t_sum.getSum());

    }
}
