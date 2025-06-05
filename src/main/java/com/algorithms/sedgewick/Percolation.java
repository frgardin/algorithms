package com.algorithms.sedgewick;

import edu.princeton.cs.algorithms.WeightedQuickUnionUF;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Percolation {
    int numberOfOpenSites;
    int[][] id;
    boolean[][] opened;
    int n;
    WeightedQuickUnionUF uf;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        this.uf = new WeightedQuickUnionUF(n * n);
        this.id = new int[n][n];
        this.opened = new boolean[n][n];
        this.numberOfOpenSites = 0;
        this.n = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                id[i][j] = i * n + j;
            }
        }
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        validateRowAndCol(row, col);
        if (isOpen(row, col)) return;
        numberOfOpenSites++;
        opened[row - 1][col - 1] = true;

        if (opened[Math.max((row - 2), 0)][col - 1]) {
            uf.union(findUFIndex(Math.max(row - 1, 0), col), findUFIndex(row, col));
        }
        if (opened[Math.min((row), n - 1)][col - 1]) {
            uf.union(findUFIndex(Math.min(row + 1, n), col), findUFIndex(row, col));
        }
        if (opened[row - 1][Math.max((col - 2), 0)]) {
            uf.union(findUFIndex(row, Math.max(col - 1, 0)), findUFIndex(row, col));
        }
        if (opened[row - 1][Math.min(col, n - 1)]) {
            uf.union(findUFIndex(row, Math.min(col + 1, n)), findUFIndex(row, col));
        }
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        validateRowAndCol(row, col);
        return opened[row - 1][col - 1];
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        validateRowAndCol(row, col);
        return IntStream.range(0, n).anyMatch(i -> uf.connected(i, findUFIndex(row, col)));
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        return numberOfOpenSites;
    }

    // does the system percolate?
    public boolean percolates() {
        return IntStream.range(0, n)
                .anyMatch(i -> IntStream.range(n * (n - 1), n * n)
                        .anyMatch(j -> uf.connected(i, j)));
    }

    private void validateRowAndCol(int row, int col) {
        if (row <= 0 || row > n) {
            throw new IllegalArgumentException("row is invalid");
        }
        if (col <= 0 || col > n) {
            throw new IllegalArgumentException("col is invalid");
        }
    }

    private int findUFIndex(int row, int col) {
        return (row - 1) * n + (col - 1);
    }

    // test client (optional)
    public static void main(String[] args) {
        Percolation percolation = new Percolation(4);
        System.out.println(percolation.uf.count());
        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString(percolation.id[i]));
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString(percolation.opened[i]));
        }


    }
}
