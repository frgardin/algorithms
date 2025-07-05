package com.algorithms.codechef.roadmap.learn.dsa.stack;

import java.util.*;

public class TransformTheExpression {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int TC = Integer.parseInt(sc.nextLine());

        while (TC-->0) {
            StringBuilder sb = new StringBuilder();

            Deque<Character> operators = new ArrayDeque<>();

            String expression = sc.nextLine();
            char[] expressionCharArray = expression.toCharArray();

            for (char c : expressionCharArray) {
                if (c == '(') ;
                else if (c == '+') operators.push(c);
                else if (c == '-') operators.push(c);
                else if (c == '*') operators.push(c);
                else if (c == '/') operators.push(c);
                else if (c == '^') operators.push(c);
                else if (c == ')') sb.append(operators.pop());
                else               sb.append(c);
            }
            System.out.println(sb);
        }
    }
}
