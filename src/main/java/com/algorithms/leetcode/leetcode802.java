package com.algorithms.leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode802 {

    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!dfs(graph, new boolean[n], new boolean[n], i)) {
                ans.add(i);
            }
        }

        return ans;
    }

    private static boolean dfs(int[][] graph,
            boolean[] visited,
            boolean[] recStack,
            int i) {
        if (recStack[i])
            return true;
        if (visited[i])
            return false;

        visited[i] = true;
        recStack[i] = true;

        for (int neighbor : graph[i]) {

            if (dfs(graph, visited, recStack, neighbor)) {
                return true;
            }
        }
        recStack[i] = false;
        return false;
    }

    public static void main(String[] args) {
        int[][] graph = new int[][] { {}, { 0, 2, 3, 4 }, { 3 }, { 4 }, {} };

        new leetcode802().eventualSafeNodes(graph);
    }
}
