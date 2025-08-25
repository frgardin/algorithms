package com.algorithms.leetcode;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;

//https://leetcode.com/problems/find-eventual-safe-states/
// needs to improve time
public class leetcode802 {

        public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<Integer>[] rGraph = new ArrayList[n];
        int[] degrees = new int[n];

        for (int i =0;i<n;i++) {
            rGraph[i]=new ArrayList<>();
        }

        for (int i =0;i<n;i++) {
            for (int v:graph[i]) {
                rGraph[v].add(i);
                degrees[i]++;
            }
        }
        
        Queue<Integer> q = new ArrayDeque<>();
        List<Integer> ans = new ArrayList<>();
        
        for (int i=0;i<n;i++) {
            if (degrees[i] == 0) {
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int cur = q.poll();
            ans.add(cur);

            for (int v:rGraph[cur]) {
                if (--degrees[v] == 0) {
                    q.offer(v);
                }
            }
        }

        Collections.sort(ans);
        return ans;
    }
}
