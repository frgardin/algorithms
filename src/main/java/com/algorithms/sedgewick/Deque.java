package com.algorithms.sedgewick;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {

    private Item[] items;
    private int N;
    private int n;
    private int head;
    private int tail;

    // construct an empty deque
    public Deque() {
        this.N = 2;
        this.items = (Item[])new Object[10];
        this.n = 0;
        this.head = 0;
        this.tail = 0;
    }

    // is the deque empty?
    public boolean isEmpty() {
    	return n == 0;
    }

    // return the number of items on the deque
    public int size() {
    	return n;
    }

    // add the item to the front
    public void addFirst(Item item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }
        if (isEmpty()) {
            items[N/2] = item;
            head=N/2;
            tail=N/2;
        } else if (head - 1 < 0) {
            grow();
            items[head-1] = item;
            head--;
        } else {
            items[head-1] = item;
            head--;
        }
        n++;
    }

    // add the item to the back
    public void addLast(Item item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }
        if (isEmpty()) {
            items[N/2] = item;
            head=N/2;
            tail=N/2;
        } else if (tail + 1 >=N) {
            grow();
            items[tail+1] = item;
            tail++;
        } else {
            items[tail+1] = item;
            tail++;
        }
        n++;
    }

    // remove and return the item from the front
    public Item removeFirst() {
    	if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Item item =items[head];
        items[head] = null;
        head++;
        n--;
        return item;
    }

    // remove and return the item from the back
    public Item removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Item item =items[tail];
        items[tail] = null;
        tail--;
        n--;
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
        Item[] newOne = (Item[]) new Object[2*N];
        for (int i = head; i <= tail;i++) {
            newOne[(2*N)/2-(N-i-1)] = items[i];
        }
        int diff = tail-head;
        this.head = (2*N)/2-(N-head-1);
        this.tail = head+diff;
        this.N = 2*N;
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
    }
}

