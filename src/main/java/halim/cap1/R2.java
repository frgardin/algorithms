package halim.cap1;

import java.util.Scanner;

public class R2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int s = sc.nextInt();
        System.out.println(Math.round(2 * s - a));
    }
}
