package helio.pedrini.recursividade;

import java.util.Scanner;

public class PasseioDoCavalo {

    private static final Integer MAX = 8;

    private static void imprimirMatriz(int[][] M, int n) {
        int x, y;

        for (x = 0; x < n; x++) {
            for (y = 0; y < n; y++) {
                System.out.printf("  %3d  ", M[x][y]);
            }
            System.out.println();
        }
    }

    private static boolean movimentoValido(int[][] M, int novoX, int novoY, int n) {
        return (novoX >= 0) && (novoX < n) && (novoY >= 0) && (novoY < n) && (M[novoX][novoY] == 0);
    }

    private static boolean passeio(int n, int x, int y, int passos, int[][] M, int[] moveX, int[] moveY) {
        int k, novoX, novoY;

        if (passos == n * n) return true;
        /* testa todos os movimentos a partir da posição atual(x,y) do cavalo*/
        for (k = 0; k < MAX; k++) {
            novoX = x + moveX[k];
            novoY = y + moveY[k];
            /* verifica se o movimento é valido e registra solução*/
            if (movimentoValido(M, novoX, novoY, n)) {
                M[novoX][novoY] = passos + 1;

                if (passeio(n, novoX, novoY, passos + 1, M, moveX, moveY)) {
                    return true;
                } else {
                    M[novoX][novoY] = 0; /* apaga registro na posição do tabuleiro*/
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] M = new int[MAX][MAX];
        int x, y, n, Xi, Yi;

        Scanner sc = new Scanner(System.in);

        /* movimentos do cavalo */
        int[] moveX = new int[]{-2, -1, 1, 2, 2, 1, -1, -2};
        int[] moveY = new int[]{-1, -2, -2, -1, 1, 2, 2, 1};

        System.out.println("Entre com o tamanho do tabuleiro: ");
        n = sc.nextInt();

        System.out.println("Entre com a linha inicial do cavalo: ");
        Xi = sc.nextInt();

        System.out.println("Entre com a coluna inicial do cavalo: ");
        Yi = sc.nextInt();

        /* inicializa tabuleiro */
        for (x = 0; x < n; x++) {
            for (y = 0; y < n; y++) {
                M[x][y] = 0;
            }
        }

        /* Define posição inicial do cavalo */
        M[Xi - 1][Yi - 1] = 1;

        /* verifica se há solução válida */
        if (passeio(n, Xi - 1, Yi - 1, 1, M, moveX, moveY)) {
            imprimirMatriz(M, n);
        } else {
            System.out.println("Não existe solução.");
        }
    }

}
