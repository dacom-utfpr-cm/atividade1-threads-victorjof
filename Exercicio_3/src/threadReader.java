import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class threadReader extends Thread {
    private  Scanner scan;

    @Override
    public void run() {
        try {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                System.out.println(line);
                sleep(10000);

            }
        } catch (InterruptedException e) {
            System.out.println("Thread Reader interrupted");
            e.printStackTrace();
        }


        scan.close();

    }

    threadReader(String filename) {
        try {
            this.scan = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            System.out.format("FILE %s not found %n", filename);
        }
    }
}
