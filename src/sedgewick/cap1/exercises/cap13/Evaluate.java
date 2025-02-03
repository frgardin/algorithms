package sedgewick.cap1.exercises.cap13;

import java.util.Scanner;
import java.util.Stack;

public class Evaluate {

    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<Double> variables = new Stack<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            switch (s) {
                case "(" -> {
                }
                case "+", "-", "*", "/", "sqrt" -> ops.push(s);
                case ")" -> {
                    String op = ops.pop();
                    double v = variables.pop();
                    v = switch (op) {
                        case "+" -> variables.pop() + v;
                        case "-" -> variables.pop() - v;
                        case "*" -> variables.pop() * v;
                        case "/" -> variables.pop() / v;
                        case "sqrt" -> Math.sqrt(variables.pop());
                        default -> v;
                    };
                    variables.push(v);
                }
                default -> variables.push(Double.parseDouble(s));
            }
        }
        System.out.println(variables.pop());
        sc.close();
    }
}
