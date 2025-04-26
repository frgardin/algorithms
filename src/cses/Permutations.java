package cses;

import java.util.Scanner;

public class Permutations {

private static void printSequence(int n) {
        if (n == 2 || n == 3) {
            System.out.print("NO SOLUTION") ;
            return;
        } 
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= n; i = i + 2){
            sb.append(i).append(" ");
        }
        for (int i = 1; i <= n; i = i + 2){
            sb.append(i).append(" ");
        }    
        System.out.print(sb);
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSequence(n);
        sc.close();
    }

}
