package lambdasAndStreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client
{
    public static void main(String[] args)
    {
        Runnable someTask = new SomeTask();
        Thread t1 = new Thread(someTask);
        t1.start();

        Runnable anotherTask = () -> {
            System.out.println("Another task");
        };
        Thread t2 = new Thread(anotherTask);
        t2.start();

        /* Sorting rule: Given an array, place the even elements followed by odd elements */
        List<Integer> integerList = new ArrayList<>();
        integerList.add(91);
        integerList.add(22);
        integerList.add(33);
        integerList.add(44);
        integerList.add(75);
        integerList.add(5);

        //Method 1
        Comparator<Integer> evenOddComparator = new EvenOddComparator();
//        Collections.sort(integerList, evenOddComparator);
//        System.out.println(integerList);

        //Method 2
        Collections.sort(integerList, (o1, o2) -> {
            if(o1 % 2 == 0)
            {
                return -1;
            }

            if(o2 % 2 == 0)
            {
                return 1;
            }
            return 0;
        });
        System.out.println(integerList);
    }
}
