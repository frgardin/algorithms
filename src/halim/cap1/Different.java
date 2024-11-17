package halim.cap1;

import java.util.Scanner;

public class Different {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.printf("%d%n", Math.abs(a - b));
        }
    }
}
