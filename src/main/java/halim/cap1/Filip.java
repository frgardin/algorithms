package halim.cap1;

import java.util.Scanner;

public class Filip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int a1 = a % 10;
        int a2 = (a % 100) / 10;
        int a3 = (a % 1000) / 100;
        int ar = a1 * 100 + a2 * 10 + a3;

        int b1 = b % 10;
        int b2 = (b % 100) / 10;
        int b3 = (b % 1000) / 100;
        int br = b1 * 100 + b2 * 10 + b3;

        if (ar > br) {
            System.out.print(ar);
            return;
        }
        System.out.print(br);
    }
}
