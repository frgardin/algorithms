package com.algorithms.leetcode;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;

//https://leetcode.com/problems/find-eventual-safe-states/
// WA
public class leetcode802 {


    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<Integer> ans = new ArrayList<>();

        for (int i =0;i<n;i++) {
            if (!dfs(graph, new boolean[n], i, -1)) {
                ans.add(i);
            }
        }

        return ans;
    }

    private static boolean dfs(int[][] graph, 
                            boolean[] visited, 
                            int i, 
                            int parent) {

        visited[i]=true;

        for (int neighbor : graph[i]) {
            if (!visited[neighbor]) {             
                if (dfs(graph, visited, neighbor, i)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true;
            }
        }
        return false;
    }
}
