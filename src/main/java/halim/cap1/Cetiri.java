package halim.cap1;

import java.util.Arrays;
import java.util.Scanner;

public class Cetiri {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();

        Arrays.sort(a);

        int a21 = a[2] - a[1];
        int a10 = a[1] - a[0];

        if (a21 == a10) {
            System.out.println(a[2] + a21);
        } else if (a10 > a21){
            System.out.println(a[0] + a21);
        } else {
            System.out.println(a[1] + a10);
        }
    }
}
