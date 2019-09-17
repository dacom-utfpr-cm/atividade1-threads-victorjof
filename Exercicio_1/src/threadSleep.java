package  Exercicio_1;

public class threadSleep extends Thread {

    @Override
    public void run() {
        try{
            long a = (long)(Math.random() * 1000);
            Thread.sleep(a);
            System.out.format("slept %f seconds %n",(double)a/1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
            e.printStackTrace();
        }
    }
}
