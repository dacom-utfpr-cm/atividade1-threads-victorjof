import java.util.ArrayList;
import java.util.Arrays;

public class threadWatchman extends Thread{
    private ArrayList<Thread> watchlist;


    public void checkThread(Thread t){
        if(t.isInterrupted()){
            System.out.printf("I can see Thread %d  is interrupted %n",t.getId());
        }
        else{
            System.out.printf("keep it up Thread %d %n", t.getId());
        }

    }

    public void run(){
        while(!watchlist.isEmpty()){
            try {
                System.out.format("i'm watching ()_() %d workers %n",watchlist.size());
                Thread.sleep(5000);
                for (Thread t : watchlist) {
                    checkThread(t);
                }
                //neat filter, as it's not a good idea to iterate and remove elements at the same time at the same list
                watchlist.removeIf(t -> t.isInterrupted());
            }
            catch (InterruptedException e ){

            }
        }
    }


    threadWatchman(Thread ... threads){
        watchlist = new ArrayList<Thread>();
        watchlist.addAll(Arrays.asList(threads));
    }




}
