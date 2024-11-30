package halim.cap1;

import java.util.Scanner;

public class ArticHoke {

    private static double price(
            double p,
            double a,
            double b,
            double c,
            double d,
            double k
    ) {
        return p * (Math.sin(a * k + b) + Math.cos(c * k + d) + 2.0);
    }

    private static void print(double d) {
        System.out.printf("%.7f", d);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p, a, b, c, d;
        int n;

        p = sc.nextDouble();
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();
        n = sc.nextInt();

        double p1 = price(p, a, b, c, d, 1);
        double de = 0.0;
        for (int i = 2; i <= n; i++){
            double pk = price(p, a, b, c, d, i);
            if (pk < p1) {
                de = Math.max(p1 - pk, de);
            } else if (pk > p1) {
                p1 = pk;
            }
        }
        print(de);
    }
}
