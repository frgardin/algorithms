package halim.cap1;

import java.util.Scanner;

public class Tarifa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int acc = X;
        while(N-- > 0) {
            int p = sc.nextInt();
            acc += X - p;
        }
        System.out.print(acc);
    }
}
