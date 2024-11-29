package halim.cap1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArticHoke {

    private static double price(double p, double a, double b, double c, double d, double k) {
        return p * (Math.sin((a * k + b)) + Math.cos(c * k + d) + 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p, a, b, c, d, n;
        p = sc.nextDouble();
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();
        n = sc.nextDouble();

        double price = price(p, a, b, c, d, 1);
        double minPrice = Double.MAX_VALUE;
        double maxPrice = 0.0;
        double maxDecline = 0.0;
        double actualDecline = 0.0;
        for (int k = 2; k <= n; k++) {
            double newPrice = price(p, a, b, c, d, k);
            if (newPrice < price) {
                actualDecline = maxPrice - newPrice;
            } else if (newPrice > price) {
                maxDecline = Math.max(actualDecline, maxDecline);
                actualDecline = 0;
            }
            if (newPrice > maxPrice) {
                maxPrice = newPrice;
            }
            price = newPrice;   
        }
        System.out.printf("%.7f", maxDecline);
    }
}
