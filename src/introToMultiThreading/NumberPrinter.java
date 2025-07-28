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
        int i = 2;
        int j = 3;
        System.out.println("Number " + number + " is printed " + i + j + "from " + Thread.currentThread().getName());
    }

    @Override
    public void run()
    {
        print();
    }
}
