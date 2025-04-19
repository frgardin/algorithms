package helio.pedrini.recursividade;

public class Permutacao {

    private static void troca(StringBuilder sb, int a, int b) {
        char aux = sb.charAt(a);
        sb.setCharAt(a, sb.charAt(b));
        sb.setCharAt(b, aux);
    }

    public static void permutacao(String s, int k, int n) {
        StringBuilder sb = new StringBuilder(s);
        if (k == n - 1) {
            System.out.println("sb = " + sb);
            return;
        }
        permutaUm(k, n, sb, k);
    }

    private static void permutaUm(int k, int n, StringBuilder sb, int i) {
        if (i == n) return;
        troca(sb, k, i);
        permutacao(sb.toString(), k + 1, n);
        troca(sb, k, i);
        permutaUm(k, n, sb, ++i);
    }


    public static void main(String[] args) {
        permutacao("abc", 0, 3);
    }
}
