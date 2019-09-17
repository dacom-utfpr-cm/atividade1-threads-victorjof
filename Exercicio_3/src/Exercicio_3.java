/* 
Author: Victor Figueira
Date:  17/09/2019
Task: 3. Faça um programa Java que envia interrupções para as
threads dos exercı́cios anteriores. As threads devem fazer o
tratamento dessas interrupções e realizar uma finalização
limpa.
*/
import Exercicio_1.threadSleep;

import java.util.concurrent.TimeUnit;

public class Exercicio_3 {
    public static void main(String[] args) {

        Thread t_read = new threadReader("../resources/quotes.txt");
        Thread t_sleep = new threadSleep();


        t_sleep.start();
        t_sleep.interrupt();

        t_read.start();
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){

        }
        t_read.interrupt();
    }
}
