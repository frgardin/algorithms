package helio.pedrini.recursividade;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        int i, anterior = 1, atual = 1, proximo;

        for (i = 3; i <= n; i++) {
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        return atual;
    }

    public static int fibonacciRecursivo(int n) {
        if (n == 1 || n == 0) return n;
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }


    public static void main(String[] args) {
        System.out.println(fibonacci(0));
        System.out.println(fibonacciRecursivo(0));
    }
}
