package linkedlist;

public class Node<T> {

    private Node<T> next;
    private Node<T> prev;
    private T value;

    public Node(T value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public Node<T> getPrev() {
        return this.prev;
    }

    public T getValue() {
        return this.value;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
