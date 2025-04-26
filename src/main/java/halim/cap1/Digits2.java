package halim.cap1;

import java.util.Scanner;

public class Digits2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (String s = sc.next(); !s.equals("END"); s = sc.next()) {
            int l = s.length();
            if (l < 8 && Integer.parseInt(s) == l) System.out.println(1);
            else System.out.println(seq(l));
        }

    }

    private static int seq(int prev) {
        int i = 2;
        while (true) {
            int curr = Integer.toString(prev).length();
            if (curr == prev) {
                return i;
            } else {
                i++;
                prev = curr;
            }
        }
    }
}
