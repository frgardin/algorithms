package helio.pedrini.recursividade;

import java.util.Optional;

public class MaiorElemento {

    public static int maiorElemento(int[] v, int n) {
        return Optional.of(n)
                .filter(no -> no == 1)
                .map(no -> v[0])
                .orElseGet(() -> Math.max(maiorElemento(v, n -1), v[n-1]));
    }

    public static void main(String[] args) {
        System.out.println(maiorElemento(new int[]{10, 9, 8, 7, 6}, 5));
    }
}
