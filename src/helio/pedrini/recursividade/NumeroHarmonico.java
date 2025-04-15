package helio.pedrini.recursividade;

public class NumeroHarmonico {

    public static double numeroHarmonicoRecursivo(int n) {
        if (n == 1) return 1;
        return 1.0 / n + numeroHarmonicoRecursivo(--n);
    }

    public static double numeroHarmonico(int n) {
        double acc = 0.0;
        for (int i = 1; i <= n;i++) {
            acc += 1.0 / i;
        }
        return acc;
    }

    public static void main(String[] args) {
        System.out.println(numeroHarmonicoRecursivo(10));
        System.out.println(numeroHarmonico(10));
    }
}