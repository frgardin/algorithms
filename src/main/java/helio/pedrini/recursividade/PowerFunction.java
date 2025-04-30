package helio.pedrini.recursividade;

public class PowerFunction {

    private static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n-1);
    }

    private static int powerFaster(int a, int n) {
        if (n == 0) return 1;

        if ((n&1) == 1) {
            return a * powerFaster(a, n / 2) * powerFaster(a, n / 2);
        } else {
            return powerFaster(a, n / 2) * powerFaster(a, n / 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(power(3, 10));
        System.out.println(powerFaster(3, 10));
    }
}
