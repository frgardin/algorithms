package com.algorithms.linkedlist;

public class DoubleLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    public Node<T> getHead() {
        if (this.head == null) {
            return null;
        }
        return this.head;
    }

    public Node<T> getTail() {
        if (this.tail == null) {
            return null;
        }
        return this.tail;
    }


    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addToFront(T value) {
        Node<T> newNode = new Node<>(value);
        if (head != null) {
            this.head.setPrev(newNode);
            newNode.setNext(this.head);
        } else {
            this.tail = newNode;
        }
        this.head = newNode;
    }

    public void addToEnd(T value) {
        Node<T> newNode = new Node<>(value);
        if (tail != null) {
            this.tail.setNext(newNode);
            newNode.setPrev(this.tail);
        } else {
            this.head = newNode;
        }
        this.tail = newNode;
    }

    public T removeFromFront() {
        if (this.head == null) {
            return null;
        }
        Node<T> next = this.head.getNext();
        if (next == null) {
            T removedHeadValue = this.head.getValue();
            this.tail = null;
            this.head = null;
            return removedHeadValue;
        }
        next.setPrev(null);
        T removedHeadValue = this.head.getValue();
        this.head = next;
        return removedHeadValue;
    }

    public T removeFromEnd() {
        if (this.tail == null) {
            return null;
        }
        Node<T> prev = this.tail.getPrev();
        if (prev == null) {
            T removedTailValue = this.tail.getValue();
            this.tail = null;
            this.head = null;
            return removedTailValue;
        }
        prev.setNext(null);
        T removedTailValue = this.tail.getValue();
        this.tail = prev;
        return removedTailValue;
    }

    public String displayForward() {
        StringBuilder sb = new StringBuilder()
                .append("[");
        Node<T> actual = this.getHead();
        while(actual != null) {
            sb.append(actual.getValue());
            sb.append(", ");
            actual = actual.getNext();
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        return sb.toString();
    }

    public String displayBackward() {
        StringBuilder sb = new StringBuilder()
                .append("[");
        Node<T> actual = this.getTail();
        while(actual != null) {
            sb.append(actual.getValue());
            sb.append(", ");
            actual = actual.getPrev();
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {

        DoubleLinkedList<Integer> ll = new DoubleLinkedList<>();

        ll.addToEnd(1);
        ll.addToEnd(2);
        ll.addToEnd(3);
        ll.addToEnd(4);
        ll.addToEnd(5);

        System.out.println(ll.displayForward());
        System.out.println(ll.displayBackward());
    }
}
