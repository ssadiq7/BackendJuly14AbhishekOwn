package introToMultiThreading;

public class NumberPrinter implements Runnable
{
    int number;
    public NumberPrinter(int number)
    {
        this.number = number;
    }

    public void print()
    {
        System.out.println("Number " + number + " is printed from " + Thread.currentThread().getName());
    }

    @Override
    public void run()
    {
        print();
    }
}
