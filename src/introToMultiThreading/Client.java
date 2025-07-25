package introToMultiThreading;

public class Client
{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Current thread: " + Thread.currentThread().getName());

//        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
//        helloWorldPrinter.print();
//
//        Thread thread = new Thread(helloWorldPrinter);
//        thread.start();
//
//        Thread thread2 = new Thread(helloWorldPrinter);
//        thread2.start();
//
//        Thread thread3= new Thread(helloWorldPrinter);
//        thread3.start();
//
//        Thread thread4 = new Thread(helloWorldPrinter);
//        thread4.start();
//
//        thread.join();
//        thread2.join();
//        thread3.join();
//        thread4.join();

        for (int i = 0; i < 100; i++)
        {
            NumberPrinter numberPrinter = new NumberPrinter(i + 1);
            Thread thread = new Thread(numberPrinter);
            thread.start();
        }
    }
}
