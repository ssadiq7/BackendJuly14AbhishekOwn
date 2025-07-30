package producerConsumer.semaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Store store;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    public Producer(Store store,
                    Semaphore producerSemaphore,
                    Semaphore consumerSemaphore)
    {
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
//        any producer needs to constantly produce the item
        while (true) {
            //1. acquire => Decrease the producers
            try {
                producerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //2. Do the task => produce
            store.add(new Object());

            //3. Signal/Release => Increase the consumers
            consumerSemaphore.release();
        }
    }
}