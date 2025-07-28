package introToMultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client
{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Current thread: " + Thread.currentThread().getName());

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 100000; i++)
        {
            if(i == 80000)
            {
                System.out.println("Current thread: " + Thread.currentThread().getName());
            }
            NumberPrinter numberPrinter = new NumberPrinter(i + 1);
            executorService.execute(numberPrinter);
        }
        executorService.shutdown();
    }
}
