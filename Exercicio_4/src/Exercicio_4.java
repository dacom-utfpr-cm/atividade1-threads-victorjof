/* 
Author: Victor Figueira
Date:  17/09/2019
Task: 4. Faça uma Thread que monitora um conjunto de threads e
exiba quais threads receberam sinais de interrupção.
*/
public class Exercicio_4  {
    public static void main(String[] args) throws InterruptedException{
        threadVoid t1 = new threadVoid(1);
        threadVoid t2 = new threadVoid(2);
        threadVoid t3 = new threadVoid(3);

        t1.start();
        t2.start();
        t3.start();

        new threadWatchman(t1,t2,t3).start();

        Thread.sleep(5000);
        t1.interrupt();
        Thread.sleep(5000);
        t2.interrupt();
    }
}
