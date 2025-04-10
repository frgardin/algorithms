package leetcode;

public class leetcode3306 {

    //TODO: WA
    public static long countOfSubstrings(String word, int k) {
        int c = 0;
        int l = 0;
        while (l <= word.length() - 4 - k) {
            int a = 0;
            int e = 0;
            int i = 0;
            int o = 0;
            int u = 0;
            int consCount = 0;
            int lastCons = 0;
            for (int r = l; r < word.length(); r++) {
                if (word.charAt(r) == 'a') {
                    if (a == 0) {
                        a++;
                    } else if (e > 0 && i > 0 && o > 0 && u > 0) {
                        a++;
                    }

                } else if (word.charAt(r) == 'e') {
                    if (e == 0) {
                        e++;
                    } else if (a > 0 && i > 0 && o > 0 && u > 0) {
                        e++;
                    }
                } else if (word.charAt(r) == 'i') {
                    if (i == 0) {
                        i++;
                    } else if (a > 0 && e > 0 && o > 0 && u > 0) {
                        i++;
                    }
                } else if (word.charAt(r) == 'o') {
                    if (o == 0) {
                        o++;
                    } else if (a > 0 && e > 0 && i > 0 && u > 0) {
                        o++;
                    }
                } else if (word.charAt(r) == 'u') {
                    if (u == 0) {
                        u++;
                    } else if (a > 0 && e > 0 && i > 0 && o > 0) {
                        u++;
                    }
                } else {
                    if (consCount > k) {
                        break;
                    }
                    lastCons = consCount < k - 1 ? r : lastCons;
                    consCount++;
                }
            }
            if (a > 0 && e > 0 && i > 0 && o > 0 && u > 0 && consCount >= k) {
                c += (a + e + i + o + u) / 5 + (a + e + i + o + u) % 5;
                l = lastCons;
            }
            l++;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(countOfSubstrings("iqeaouqi", 2));
    }
}
