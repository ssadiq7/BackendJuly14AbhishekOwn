package producerConsumer.semaphore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
//    we are going to have multiple items
//    private List<Object> items = Collections.synchronizedList(new ArrayList<>());
    private ConcurrentLinkedQueue<Object> items = new ConcurrentLinkedQueue<>();
    private int MAX_SIZE = 5;

    public void add(Object item) {
        System.out.println("Item is being produced : " + items.size());
        items.add(item);
    }

    public void remove() {
        System.out.println("Item is being consumed : " + items.size());
        items.remove();
    }

    public int getMAX_SIZE() {
        return MAX_SIZE;
    }

    public ConcurrentLinkedQueue<Object> getItems() {
        return items;
    }
}