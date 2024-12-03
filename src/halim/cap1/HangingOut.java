package halim.cap1;

import java.util.Scanner;

public class HangingOut {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int x = sc.nextInt();
        int acc = 0;
        int f = 0;
        while (x-- > 0) {
            String s = sc.next();
            int p = sc.nextInt();

            if (s.equals("enter")) {
                if ((acc + p) > L) {
                    f++;
                    continue;
                }
                acc += p;
                continue;
            }
            acc = (acc - p) >= 0 ? acc - p : acc;
        }

        System.out.print(f);
    }
}
