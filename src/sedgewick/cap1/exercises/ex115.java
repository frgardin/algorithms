package sedgewick.cap1.exercises;

import java.util.*;

public class ex115 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = Double.parseDouble(sc.next());
        double b = Double.parseDouble(sc.next());

        System.out.println(a > 0 && a < 1 && b > 0 && b < 1);
    }
}
