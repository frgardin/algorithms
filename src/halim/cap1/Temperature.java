package halim.cap1;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        if (x == 0 && y == 1)   System.out.printf("ALL GOOD");
        else if (y == 1)        System.out.printf("IMPOSSIBLE");
        else                    System.out.printf("%.6f", x / (1.0 - y));
    }
}
