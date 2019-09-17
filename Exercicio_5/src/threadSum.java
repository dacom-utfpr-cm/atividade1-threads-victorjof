import java.util.Scanner;

public class threadSum extends Thread{
    private  int sum = 0;
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the quantity of numbers to be add");
        int n  = scanner.nextInt();
        for(int i = 0; i < n; i++){
            sum+=scanner.nextInt();
        }
        scanner.close();
    }

    public int getSum(){
        return sum;
    }
}
