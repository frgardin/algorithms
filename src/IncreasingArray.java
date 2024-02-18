import java.util.Scanner;


public class IncreasingArray {

    private static int evaluateSum(long[] ar, int index) {
        long candidate = ar[index];
        for (int i = index - 1; i >= 0; i--) {
            if (ar[i] < candidate) return index - i;
        }

        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        long sum = 0;
        long[] ar = new long[t];

        for (int i = 0; i < t; i++) {
            ar[i] = sc.nextInt();
            if (i == 0) continue;
            if (ar[i - 1] > ar[i]) {
                sum += evaluateSum(ar, i);
            }
        }
        System.out.println(sum);
    }

}