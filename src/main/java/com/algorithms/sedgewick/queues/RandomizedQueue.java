import edu.princeton.cs.algs4.StdRandom;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RandomizedQueue<Item> implements Iterable<Item> {

    private static final int INITIAL_CAPACITY = 10;
    private int itemsSize;
    private Item[] items;
    private int currentSize;


    // construct an empty randomized queue
    public RandomizedQueue() {
        this.itemsSize = INITIAL_CAPACITY;
        this.items = (Item[]) new Object[INITIAL_CAPACITY];
        this.currentSize = 0;
    }

    // is the randomized queue empty?
    public boolean isEmpty() {
        return currentSize == 0;
    }

    // return the number of items on the randomized queue
    public int size() {

        return currentSize;
    }

    // add the item
    public void enqueue(Item item) {
        if (item == null) throw new IllegalArgumentException();
        if (currentSize >= itemsSize) resize(2 * itemsSize);
        items[currentSize++] = item;
    }

    // remove and return a random item
    public Item dequeue() {
        if (isEmpty()) throw new NoSuchElementException();
        if (currentSize == 1) {
            Item item = items[0];
            items[0] = null;
            currentSize = 0;
            return item;
        }
        int randomIndex = getRandomIndex();
        Item item = items[randomIndex];
        items[randomIndex] = items[--currentSize];
        if (currentSize > 0 && currentSize == itemsSize / 4) resize(itemsSize / 2);
        return item;
    }

    // return a random item (but do not remove it)
    public Item sample() {
        if (isEmpty()) throw new NoSuchElementException();
        if (currentSize == 1) {
            return items[0];
        }
        return items[getRandomIndex()];
    }

    // return an independent iterator over items in random order
    public Iterator<Item> iterator() {

        return new RandomizedQueueIterator();
    }

    private final class RandomizedQueueIterator implements Iterator<Item> {
        private int copySize;
        private Item[] copyItems;

        public RandomizedQueueIterator() {
            copySize = currentSize;
            copyItems = (Item[]) new Object[copySize];
            System.arraycopy(items, 0, copyItems, 0, copySize);
        }

        @Override
        public boolean hasNext() {
            return copySize > 0;
        }


        @Override
        public Item next() {
            if (hasNext()) {
                int randomIndex = StdRandom.uniform(copySize);
                Item item = copyItems[randomIndex];
                copyItems[randomIndex] = null;
                copyItems[randomIndex] = copyItems[copySize - 1];
                if (copySize > 0 && copySize == copyItems.length / 4) {
                    resizeCopyContainer(copyItems.length / 2);
                }
                copySize--;
                return item;
            }

            throw new NoSuchElementException();
        }


        private void resizeCopyContainer(int n) {
            Item[] resizedContainer = (Item[]) new Object[n];
            for (int i = 0; i < copySize; i++) {
                resizedContainer[i] = copyItems[i];
            }
            copyItems = resizedContainer;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    // unit testing (required)
    public static void main(String[] args) {
        RandomizedQueue<String> rq = new RandomizedQueue<>();

        rq.enqueue("oi");
        rq.enqueue("oi2");
        rq.enqueue("oi3");
        rq.enqueue("oi4");
        rq.enqueue("oi5");
        rq.enqueue("oi6");


        System.out.println(rq.dequeue());
        System.out.println(rq.dequeue());
        System.out.println(rq.dequeue());
        System.out.println(rq.dequeue());
        System.out.println(rq.dequeue());
        System.out.println(rq.dequeue());


        rq.enqueue("oi");
        rq.enqueue("oi2");
        rq.enqueue("oi3");
        rq.enqueue("oi4");
        rq.enqueue("oi5");
        rq.enqueue("oi6");

        for (String s : rq) {
            System.out.println(s) ;
        }

    }

    private void resize(int newSize) {
        Item[] newItems = (Item[]) new Object[newSize];
        for (int i = 0; i < currentSize; i++) {
            newItems[i] = items[i];
        }
        itemsSize = newSize;
        items = newItems;
    }

    private int getRandomIndex() {
        return StdRandom.uniform(currentSize);
    }
}