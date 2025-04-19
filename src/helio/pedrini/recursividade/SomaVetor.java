package helio.pedrini.recursividade;

public class SomaVetor {

    public static int somaVetor(int[] a, int n) {
        if (n == 0) return 0;
        return somaVetor(a, --n) + a[n - 1];
    }
}
