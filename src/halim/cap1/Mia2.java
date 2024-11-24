package halim.cap1;

import java.io.File;
import java.util.Scanner;

public class Mia2 {

    private static final String P1 = "Player 1 wins.\n";
    private static final String P2 = "Player 2 wins.\n";
    private static final String T = "Tie.\n";

    private static int score(int a, int b) {
        int score;
        if ((a == 1 && b == 2) || (a == 2 && b == 1)) score = 1000;
        else if (a == b)                              score = 100 * a;
        else if (a > b)                               score = a * 10 + b;
        else                                          score = b * 10 + a;
        return score;
    }

    private static String compare(int p1, int p2) {
        return p1 > p2 ? P1 : p2 > p1 ? P2 : T;
    }

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("src/halim/cap1/file/mia.txt"));
        while (true) {
            int s0, s1, r0, r1;
            s0 = sc.nextInt();
            s1 = sc.nextInt();
            r0 = sc.nextInt();
            r1 = sc.nextInt();

            if (s0 == 0 && s1 == 0 && r0 == 0 && r1 == 0)   break;

            System.out.print(compare(score(s0, s1), score(r0, r1)));
        }
    }
}
