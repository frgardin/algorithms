package com.algorithms.sedgewick.find.percolation;


import edu.princeton.cs.algorithms.WeightedQuickUnionUF;

public class Percolation {

    private final int n;
    private final WeightedQuickUnionUF uf;
    private final WeightedQuickUnionUF ufFull;
    private final boolean[] open;
    private final int virtualTop;
    private final int virtualBottom;
    private int openSites;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n needs to be natural higher than zero");
        }
        this.n = n;
        this.uf = new WeightedQuickUnionUF(n * n + 2);
        this.ufFull = new WeightedQuickUnionUF(n * n + 1);  // no bottom node to avoid backwash
        this.virtualTop = n * n;
        this.virtualBottom = n * n + 1;
        this.open = new boolean[n * n];
        this.openSites = 0;
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        validate(row, col);
        if (isOpen(row, col)) return;
        row = row - 1;
        col = col - 1;


        int i = this.findIndex(row, col);
        this.open[i] = true;
        this.openSites++;

        if (row == 0) {
            uf.union(i, virtualTop);
            ufFull.union(i, virtualTop);
        }
        if (row == n - 1) {
            uf.union(i, virtualBottom);
        }


        if (row > 0) {
            int newIndex = this.findIndex(row - 1, col);
            if (this.open[newIndex]) {
                uf.union(i, newIndex);
                ufFull.union(i, newIndex);
            }
        }
        if (row < this.n - 1) {
            int newIndex = this.findIndex(row + 1, col);
            if (this.open[newIndex]) {
                uf.union(i, newIndex);
                ufFull.union(i, newIndex);
            }
        }
        if (col > 0) {
            int newIndex = this.findIndex(row, col - 1);
            if (this.open[newIndex]) {
                uf.union(i, newIndex);
                ufFull.union(i, newIndex);
            }
        }
        if (col < this.n - 1) {
            int newIndex = this.findIndex(row, col + 1);
            if (this.open[newIndex]) {
                uf.union(i, newIndex);
                ufFull.union(i, newIndex);
            }
        }
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        validate(row, col);
        return this.open[this.findIndex(row - 1, col - 1)];
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        validate(row, col);
        if (!isOpen(row, col)) return false;
        return ufFull.find(findIndex(row - 1, col - 1)) == ufFull.find(virtualTop);
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        return this.openSites;
    }

    // does the system percolate?
    public boolean percolates() {
        return uf.find(virtualTop) == uf.find(virtualBottom);
    }

    // test client (optional)
    public static void main(String[] args) {
        Percolation p = new Percolation(200);
        p.open(0, 15);
    }

    private void validate(int row, int col) {
        if (row <= 0 || row > this.n) {
            throw new IllegalArgumentException("row must be inside percolation range");
        }
        if (col <= 0 || col > this.n) {
            throw new IllegalArgumentException("col must be inside percolation range");
        }
    }

    private int findIndex(int row, int col) {
        return (row * this.n) + col;
    }
}
