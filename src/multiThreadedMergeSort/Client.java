package multiThreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client
{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = List.of(
                8,2,1,4,9,7,5,6
        );

        ExecutorService executorService = Executors.newCachedThreadPool();
        Sorter sorter = new Sorter(list, executorService);
        Future<List<Integer>> sortedArrayFuture = executorService.submit(sorter);

        List<Integer> sortedArray = sortedArrayFuture.get();

        System.out.println(sortedArray);
        executorService.shutdown();
    }
}
