package helio.pedrini.recursividade;

import java.util.Arrays;

import static helio.pedrini.recursividade.Fatorial.fatorialRecursivo;

public class Combinacao {

    public static int combinacao(int n, int m) {
        return fatorialRecursivo(n) / fatorialRecursivo(n - m) / fatorialRecursivo(m);
    }

    public static double[] baskarar1(double a, double b, double c) {
        return new double[]{(-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a), (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a)};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.asList(baskarar1(1, -1, 66)));
    }
}
