package com.algorithms.leetcode;

import java.util.HashSet;

public class leetcode36 {

    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] subBoxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            subBoxes[i] = new HashSet<>();
        }

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char v = board[row][col];

                if (v == '.')
                    continue;

                int subBox = (row / 3) * 3 + (col / 3);

                if (rows[row].contains(v) ||
                        cols[col].contains(v) ||
                        subBoxes[subBox].contains(v)) {
                    return false;
                }

                rows[row].add(v);
                cols[col].add(v);
                subBoxes[subBox].add(v);
            }
        }
        return true;
    }
}
