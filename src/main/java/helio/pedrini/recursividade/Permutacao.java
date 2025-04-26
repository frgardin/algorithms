package helio.pedrini.recursividade;

public class Permutacao {

    private static void troca(StringBuilder sb, int a, int b) {
        char aux = sb.charAt(a);
        sb.setCharAt(a, sb.charAt(b));
        sb.setCharAt(b, aux);
    }

    public static void permutacao(String s, int k, int n) {
        int i;
        StringBuilder sb = new StringBuilder(s);

        if (k == n - 1) {
            System.out.println("sb = " + sb);
        }
        else {
            for (i = k; i < n; i++) {
                troca(sb, k, i);
                permutacao(sb.toString(), k + 1, n);
                troca(sb, k, i);
            }
        }
    }

    public static void main(String[] args) {
        permutacao("abcd", 0, 4);
    }
}
