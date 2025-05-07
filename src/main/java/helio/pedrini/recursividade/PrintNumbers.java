package helio.pedrini.recursividade;

import java.util.Map;

public class PrintNumbers {

    private static final Map<Integer, String> MAP = Map.of(
            0, "zero",
            1, "one",
            2, "two",
            3, "three",
            4, "four",
            5, "five",
            6, "six",
            7, "seven",
            8, "eight",
            9, "nine"
    );

    private static void printNumbers(int n) {
        if (n / 10 == 0) {
            System.out.printf("%s ", MAP.get(n));
            return;
        }
        printNumbers(n / 10);
        System.out.printf("%s ", MAP.get(n % 10));
    }

    public static void main(String[] args) {
        printNumbers(2021);
    }
}
