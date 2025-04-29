package helio.pedrini.recursividade;

public class Labirinto {

    private static final Integer MAX = 20;

    private static void imprimeLabirinto(int[][] M, int n, int m) {
        int i, j;

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (M[i][j] == -1) System.out.print("  -1");
                    else if (M[i][j] == 0) System.out.print("   0");
                        else if (M[i][j] > 0) System.out.printf(" %2d", M[i][j]);
            }
            System.out.println();
        }
    }

    //todo finish labirinto
}
