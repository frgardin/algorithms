import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {

    private static final int INITIAL_CAPACITY = 10;
    private Item[] items;
    private int itemsSize;
    private int currentSize;
    private int head;
    private int tail;

    // construct an empty deque
    public Deque() {
        this.itemsSize = INITIAL_CAPACITY;
        this.items = (Item[]) new Object[INITIAL_CAPACITY];
        this.currentSize = 0;
        this.head = 0;
        this.tail = 0;
    }

    // is the deque empty?
    public boolean isEmpty() {
        return currentSize == 0;
    }

    // return the number of items on the deque
    public int size() {
        return currentSize;
    }

    // add the item to the front
    public void addFirst(Item item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }
        if (isEmpty()) {
            items[itemsSize / 2] = item;
            head = itemsSize / 2;
            tail = itemsSize / 2;
        } else if (head - 1 < 0) {
            grow();
            items[head - 1] = item;
            head--;
        } else {
            items[head - 1] = item;
            head--;
        }
        currentSize++;
    }

    // add the item to the back
    public void addLast(Item item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }
        if (isEmpty()) {
            items[itemsSize / 2] = item;
            head = itemsSize / 2;
            tail = itemsSize / 2;
        } else if (tail + 1 >= itemsSize) {
            grow();
            items[tail + 1] = item;
            tail++;
        } else {
            items[tail + 1] = item;
            tail++;
        }
        currentSize++;
    }

    // remove and return the item from the front
    public Item removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Item item = items[head];
        items[head] = null;
        head++;
        currentSize--;
        return item;
    }

    // remove and return the item from the back
    public Item removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Item item = items[tail];
        items[tail] = null;
        tail--;
        currentSize--;
        return item;

    }

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator() {
        return new Iterator<>() {
            private int current = head;

            @Override
            public boolean hasNext() {
                return current <= tail && items[current] != null;
            }

            @Override
            public Item next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Item item = items[current];
                current++;
                return item;
            }
        };
    }

    private void grow() {
        Item[] newOne = (Item[]) new Object[2 * itemsSize];
        for (int i = head; i <= tail; i++) {
            newOne[(2 * itemsSize) / 2 - (itemsSize - i - 1)] = items[i];
        }
        int diff = tail - head;
        this.head = (2 * itemsSize) / 2 - (itemsSize - head - 1);
        this.tail = head + diff;
        this.itemsSize = 2 * itemsSize;
        this.items = newOne;
    }

    // unit testing (required)
    public static void main(String[] args) {
        Deque<String> dq = new Deque<>();

        dq.addFirst("oi");
        dq.addFirst("tudo");
        dq.addFirst("bem");

        dq.addLast("bem");
        dq.addLast("e");
        dq.addLast("vc");

        System.out.println(dq.removeFirst());
        System.out.println(dq.removeFirst());
        System.out.println(dq.removeFirst());

        System.out.println(dq.isEmpty());

        System.out.println(dq.removeLast());
        System.out.println(dq.removeLast());
        System.out.println(dq.removeLast());

        System.out.println(dq.isEmpty());


        dq.addFirst("oi");
        dq.addFirst("tudo");
        dq.addFirst("bem");

        dq.addLast("bem");
        dq.addLast("e");
        dq.addLast("vc");

        for (String s : dq) {
            System.out.println(s);
        }
    }
}

