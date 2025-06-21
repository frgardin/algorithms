package com.algorithms.codechef.roadmap.learn.dsa.stackandqueues;

import java.util.*;

public class EvaluateExpression {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int TC = sc.nextInt();

        while(TC-->0) {
            Deque<Integer> operands = new ArrayDeque<>();

            int n  = sc.nextInt();
            String expression = sc.next();

            for (char c : expression.toCharArray()) {
                if (c == '+' || c == '-' || c == '*') {
                    int op1 = operands.pop();
                    int op2 = operands.pop();
                    operands.push(operate(op2, op1, c));
                } else {
                    operands.push(c - '0');
                }
            }


            System.out.println(operands.pop());
        }

    }


    private static int operate(int a, int b, char op) {
        if (op == '+')  return a+b;
        if (op == '-')  return a-b;
        if (op == '*')  return a*b;
        return 0;
    }
}
