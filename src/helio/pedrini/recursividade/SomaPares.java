package helio.pedrini.recursividade;

public class SomaPares {

    public static int somaPares(int n) {
        if (n <= 0) return 0;
        if (n % 2 == 0) return n + somaPares(n - 2);
        return somaPares(n-1);
    }

    public static void main(String[] args) {
        System.out.println(somaPares(10));
    }
}
