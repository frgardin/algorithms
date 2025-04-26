package cses;

import java.util.Scanner;

public class MissingNumber2 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0;
        int sum = n;

        for (int i = 1; i < n; i++) {
            a += sc.nextInt();
            sum += i;
        }

        System.out.println(sum - a);

        sc.close();
    }
}