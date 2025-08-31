package com.algorithms.leetcode;

import java.util.HashSet;

public class leetcode36 {
    
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] row = new HashSet[9];
        HashSet<Character>[] col = new HashSet[9];
        HashSet<Character>[] subBox = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            subBox[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char v = board[i][j];
                if (v == '.')
                    continue;

                int sId = getSubBoxId(i, j);

                if (subBox[sId].contains(v)) {
                    return false;
                }
                if (row[i].contains(v)) {
                    return false;
                }
                if (col[j].contains(v)) {
                    return false;
                }
                row[i].add(v);
                col[j].add(v);
                subBox[sId].add(v);
            }
        }
        return true;

    }

    private static int getSubBoxId(int i, int j) {
        if (i < 3 && j < 3)
            return 0;
        if (i < 3 && j < 6)
            return 1;
        if (i < 3 && j < 9)
            return 2;
        if (i < 6 && j < 3)
            return 3;
        if (i < 6 && j < 6)
            return 4;
        if (i < 6 && j < 9)
            return 5;
        if (i < 9 && j < 3)
            return 6;
        if (i < 9 && j < 6)
            return 7;
        return 8;
    }
}
