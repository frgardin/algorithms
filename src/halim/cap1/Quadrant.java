package halim.cap1;

import java.util.Scanner;

public class Quadrant {

    public static void main(String[] args) {
        int x, y, r;
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        if (x > 0 && y > 0) r = 1;
        else if (x < 0 && y > 0) r = 2;
        else if (x < 0 && y < 0) r = 3;
        else r = 4;

        System.out.print(r);
    }
}
