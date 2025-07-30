package com.algorithms.graphs;


import java.util.*;


public class DFS {

    private static void dfs(int i, boolean[] visited, List<Integer>[] adjList) {
        visited[i] = true;

        System.out.println("Node: " + i);

        for (int neighbor : adjList[i]) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, adjList);
            }
        }
    }

    private static void performDFS(int v, List<Integer>[] adjList) {
        boolean[] visited = new boolean[v+1];

        for (int i=1;i<=v;i++) {
            if (!visited[i]) {
                dfs(i, visited, adjList);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int e = sc.nextInt();

        List<Integer>[] adjList = new ArrayList[v+1];

        for (int i=1;i<=v;i++) adjList[i] = new ArrayList<>();

        for (int i =0;i<e;i++) {
            int from  = sc.nextInt();
            int to = sc.nextInt();

            adjList[from].add(to);
        }

        performDFS(v, adjList);


    }
}
