package halim.cap1;

import java.util.Scanner;

public class JudgingMoose {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        if (l == 0 && r == 0) System.out.println("Not a moose");
        else if (l > r)       System.out.printf("Odd %d", l * 2);
        else if (r > l)       System.out.printf("Odd %d", r * 2);
        else                  System.out.printf("Even %d", r + l);
    }
}
