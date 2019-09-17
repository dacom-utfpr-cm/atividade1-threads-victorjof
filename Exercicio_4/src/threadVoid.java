public class threadVoid extends Thread {
    final private int id;

    @Override
    public void run() {
        while (true) {

        }
    }
    public int getID(){
        return id;
    }
    threadVoid(int id){
        this.id=id;
    }


}
