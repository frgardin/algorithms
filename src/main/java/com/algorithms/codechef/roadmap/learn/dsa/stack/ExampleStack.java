package com.algorithms.codechef.roadmap.learn.dsa.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExampleStack {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        // Adding elements (push)
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Accessing the top element
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Removing elements (pop)
        stack.pop();
        topElement = stack.peek();
        System.out.println("Top element after pop: " + topElement);
    }
}