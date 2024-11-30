package halim.cap1;

import java.util.Scanner;

public class Digits {

    public static int howManyDigits(int i, int j) {
        if (i == 1 && j == 1) {
            return 1;
        }
        if (i / 10 > 0) {
            return howManyDigits(i / 10, j + 1);
        } else {
            return j + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        while(!s.contains("END")) {
            int i = Integer.parseInt(s);

            System.out.printf("%d%n", howManyDigits(i, 1));

            s = sc.next();
        }
    }
}
