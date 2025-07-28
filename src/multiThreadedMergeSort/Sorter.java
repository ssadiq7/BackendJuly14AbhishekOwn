package multiThreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>>
{
    private final List<Integer> arrayToBeSorted;
    private final ExecutorService executorService;

    public Sorter(List<Integer> arrayToBeSorted,
                  ExecutorService executorService)
    {
        this.arrayToBeSorted = arrayToBeSorted;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception
    {
        System.out.println("Sorting logic in thread " + Thread.currentThread().getName());
        System.out.println("Array to be sorted: " + arrayToBeSorted);

        if(arrayToBeSorted.size() <= 1)
        {
            return arrayToBeSorted;
        }

        // 1. Divide the array into two parts
        int size = arrayToBeSorted.size();
        int mid = size / 2;

        // 2. Call mergesort recursively for each half
        Sorter leftArrayTask = new Sorter(arrayToBeSorted.subList(0, mid), executorService);
        Sorter rightArrayTask =  new Sorter(arrayToBeSorted.subList(mid, size), executorService);

//        ExecutorService executorService = Executors.newFixedThreadPool(2);
        /*
        * Runnable => execute
        * Callable => submit
        * */
        Future<List<Integer>> sortedLeftArrayFuture = executorService.submit(leftArrayTask);
        Future<List<Integer>> sortedRightArrayFuture = executorService.submit(rightArrayTask);

        List<Integer> sortedLeftArray = sortedLeftArrayFuture.get();
        List<Integer> sortedRightArray = sortedRightArrayFuture.get();

        // 3. merge the results
        int i= 0;
        int j = 0;

        List<Integer> sortedArray = new ArrayList<>();

        while (i < sortedLeftArray.size() && j < sortedRightArray.size()) {
            if (sortedLeftArray.get(i) <= sortedRightArray.get(j)) {
                sortedArray.add(sortedLeftArray.get(i));
                i += 1;
            } else {
                sortedArray.add(sortedRightArray.get(j));
                j += 1;
            }
        }

        while (i < sortedLeftArray.size()) {
            sortedArray.add(sortedLeftArray.get(i));
            i += 1;
        }

        while (j < sortedRightArray.size()) {
            sortedArray.add(sortedRightArray.get(j));
            j += 1;
        }

        return sortedArray;
    }
}
