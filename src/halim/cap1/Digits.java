package halim.cap1;

import java.util.Scanner;

public class Digits {

    public static int howManyDigitsRecursive(long i, int j) {
        if (i == 1 && j == 1) {
            return 1;
        }
        if (i / 10 > 0) {
            return howManyDigitsRecursive(i / 10, j + 1);
        } else {
            return j + 1;
        }
    }

    public static int howManyDigitsWhileLoop(long i) {
        if (i == 1) return 1;
        int j = 1;
        while (i / 10 > 0) {
            i /= 10;
            j++;
        }
        return j + 1;
    }


    public static int howManyDigitsForLoop(long i) {
        if (i == 1) return 1;
        int j = 1;
        for (i = i; i / 10 > 0; i /= 10) {
            j++;
        }
        return j + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        while (!s.contains("END")) {
            long i = Long.parseLong(s);

            //System.out.printf("%d%n", howManyDigitsRecursive(i, 1));
            //System.out.printf("%d%n", howManyDigitsWhileLoop(i));
            System.out.printf("%d%n", howManyDigitsForLoop(i));

            s = sc.next();
        }
    }
}
