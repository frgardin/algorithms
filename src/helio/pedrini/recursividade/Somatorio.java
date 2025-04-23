package helio.pedrini.recursividade;

public class Somatorio {

    public static int somatorio(int n) {
        int acc = 0;
        for (int i = 1; i <= n; i++) {
            acc +=i;
        }
        return acc;
    }

    public static int somatorioRecursivo(int n) {
        if (n == 0 || n == 1) return n;
        return somatorioRecursivo(n - 1) + n;
    }

    public static void main(String[] args) {
        System.out.println(somatorio(11));
        System.out.println(somatorioRecursivo(10));
    }
}
