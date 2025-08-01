package multiThreadingProblems.scrapUrl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client
{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<ScrapURL> urls = new ArrayList<>();
        for (int i = 0; i < 100; i++)
        {
            urls.add(new ScrapURL("https://example.com/page" + i));
        }

        long start = System.currentTimeMillis();
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);
//        List<Future<Void>> futures = new ArrayList<>();
//        for (ScrapURL url : urls)
//        {
//            Future<Void> future = fixedThreadPool.submit(url);
//            futures.add(future);
//        }
//
//        for (Future<Void> future : futures)
//        {
//            future.get();
//        }

        fixedThreadPool.invokeAll(urls);

        fixedThreadPool.shutdown();
        long end = System.currentTimeMillis();
        System.out.println("Time taken for fixedThreadPool: " + (end - start));

        start = System.currentTimeMillis();
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
//        futures.clear();
//        for (ScrapURL url : urls)
//        {
//            Future<Void> future = cachedThreadPool.submit(url);
//            futures.add(future);
//        }
//
//        for (Future<Void> future : futures)
//        {
//            future.get();
//        }

        cachedThreadPool.invokeAll(urls);

        cachedThreadPool.shutdown();
        end = System.currentTimeMillis();
        System.out.println("Time taken for cachedThreadPool: " + (end - start));
    }

}
