package helio.pedrini.recursividade;

public class PowerFunction {

    private static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n-1);
    }
}
