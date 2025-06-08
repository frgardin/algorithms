package com.algorithms.sedgewick.find.percolation;


import edu.princeton.cs.introcs.StdStats;
import edu.princeton.cs.introcs.StdRandom;


public class PercolationStats {

    private static final double CONFIDENCE_95 = 1.96;

    private final int trials;
    private final double[] thresholds;

    // perform independent trials on an n-by-n grid
    public PercolationStats(int n, int trials) {
        if (n <= 0 || trials <= 0) throw new IllegalArgumentException();
        this.trials = trials;
        this.thresholds = new double[trials];

        for (int t = 0; t < trials; t++) {
            Percolation p = new Percolation(n);
            while (!p.percolates()) {
                int row, col;
                do {
                    row = StdRandom.uniform(1, n+1);
                    col = StdRandom.uniform(1, n+1);
                } while (p.isOpen(row, col));
                p.open(row, col);
            }
            thresholds[t] = (double) p.numberOfOpenSites() / (n*n);
        }
    }

    // sample mean of percolation threshold
    public double mean() {
        return StdStats.mean(thresholds);
    }

    // sample standard deviation of percolation threshold
    public double stddev() {
        return StdStats.stddev(thresholds);
    }

    // low endpoint of 95% confidence interval
    public double confidenceLo() {
        return mean() - (CONFIDENCE_95 * stddev() / Math.sqrt(trials));
    }

    // high endpoint of 95% confidence interval
    public double confidenceHi() {
        return mean() + (CONFIDENCE_95 * stddev() / Math.sqrt(trials));
    }

    // test client (see below)
    public static void main(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException();
        }
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        PercolationStats percolationStats = new PercolationStats(n, trials);

        System.out.println("mean                    = " + percolationStats.mean());
        System.out.println("stddev                  = " + percolationStats.stddev());
        System.out.println("95% confidence interval = [" + percolationStats.confidenceLo() + ", " +
                percolationStats.confidenceHi() + "]");
    }
}
