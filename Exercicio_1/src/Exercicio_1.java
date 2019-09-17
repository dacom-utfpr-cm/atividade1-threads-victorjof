/* 
Author: Victor Figueira
Date:  17/09/2019
Task: 1. Faça um programa em Java que inicie três threads e, cada
thread, espere um tempo aleatório para terminar.
*/


package Exercicio_1;

public class Exercicio_1 {

    public static void main(String[] args) {
        for(int i = 0; i<3; i++){
            new Thread( () -> {try{
                long a = (long)(Math.random() * 1000);
                Thread.sleep(a);
                System.out.format("slept %f seconds %n",(double)a/1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
                e.printStackTrace();
            }}).start();
        }
    }
}


