package helio.pedrini.recursividade;

public class Hanoi {

    private static final String MESSAGE = "mover o disco %d do pino %c para o pino %c%n";

    private static void hanoi(int n, char a, char c, char b) {
        if (n == 1) {
            System.out.printf(MESSAGE, n, a, c);
        } else {
            hanoi(n - 1, a, b, c);
            System.out.printf(MESSAGE, n, a, c);
            hanoi(n - 1, b, c, a);
        }
    }

    public static void main(String[] args) {
        hanoi(3, 'a', 'c', 'b');
    }
}
