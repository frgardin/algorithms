package leetcode;

import java.util.HashMap;

public class leetcode12 {

    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        HashMap<Integer, String> m = new HashMap<>() {
        };

        m.put(1, "I");
        m.put(5, "V");
        m.put(10, "X");
        m.put(50, "L");
        m.put(100, "C");
        m.put(500, "D");
        m.put(1000, "M");

        while (num > 0) {
            if (num < 1000) {
                if (num < 100) {
                    if (num < 10) {
                        num = mountRoman(num, sb, 1, m);
                        continue;
                    }
                    num = mountRoman(num, sb, 10, m);
                    continue;
                }
                num = mountRoman(num, sb, 100, m);
                continue;
            }
            num = mountRoman(num, sb, 1000, m);
        }
        return sb.toString();
    }

    private static int mountRoman(int num, StringBuilder sb, int multiplier, HashMap<Integer, String> m) {
        if ((num / multiplier) == 4) {
            sb.append(m.get(multiplier));
            sb.append(m.get(5 * multiplier));
            return num - 4 * multiplier;
        }
        if ((num / multiplier) == 9) {
            sb.append(m.get(multiplier));
            sb.append(m.get(10 * multiplier));
            return num - 9 * multiplier;
        }
        if ((num / multiplier) == 5) {
            sb.append(m.get(5 * multiplier));
            return num - 5 * multiplier;
        }
        if ((num / multiplier) > 5) {
            sb.append(m.get(5 * multiplier));
            return num - 5 * multiplier;
        }
        int a = num / multiplier;
        for (int i = 0; i < a; i++) {
            sb.append(m.get(multiplier));
            num -= multiplier;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(58));
    }
}
