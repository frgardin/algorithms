package halim.cap1;

import java.util.*;

public class MoscowDream {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a, b, c, n;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        n = sc.nextInt();

        String yes = "YES";
        String no = "NO";

        boolean problemCondition = (a + b + c) >= n;
        boolean minimumCondition = n >=3;
        boolean easyCondition = a > 0;
        boolean mediumCondition = b > 0;
        boolean hardCondition = c > 0;
        boolean finalCondition =    problemCondition &&
                minimumCondition &&
                easyCondition &&
                mediumCondition &&
                hardCondition;

        String finalAnswer = finalCondition ? yes : no;

        System.out.print(finalAnswer);
    }
}