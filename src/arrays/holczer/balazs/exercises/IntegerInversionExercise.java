package arrays.holczer.balazs.exercises;

public class IntegerInversionExercise {

    public static int reverseInteger(int n) {
        return getReverseInteger(n);
    }

    private static int getHighestPowerIndex(int n) {
        int i = 1;
        int pow = 1;
        while (n / pow > 10) {
            pow = getPowerOfTen(i);
            i++;
        }
        return i - 1;
    }

    private static int getPowerOfTen(int exponent) {
        return (int) Math.pow(10, exponent);
    }

    private static int getReverseInteger(int n) {
        int result = 0;
        int j = 0;
        int i = getHighestPowerIndex(n);
        while (i >= 0) {
            int pow = getPowerOfTen(i);
            result += (n / pow) * getPowerOfTen(j);
            n -= (n / pow) * pow;
            j++;
            i--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseInteger(12300004));
    }
}
