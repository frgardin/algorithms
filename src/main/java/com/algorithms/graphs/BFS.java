package com.algorithms.graphs;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Arrays;

public class BFS {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int v = sc.nextInt();
		int e = sc.nextInt();

		List<Integer>[] adjList = new ArrayList[v+1];
		boolean[] visited = new boolean[v+1];
		int[] dist = new int[v+1];

		for (int i =1;i<=v;i++) adjList[i] = new ArrayList<>();

		for (int i=0;i<e;i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();

			adjList[from].add(to);
		}

		Deque<Integer> dq = new ArrayDeque<>();
		int start = 1;

		visited[start] = true;
		dist[start] = 0;
		dq.add(start);

		while (!dq.isEmpty()) {
			int current = dq.poll();

			for (Integer neighbor : adjList[current]) {
				if (!visited[neighbor]) {
					dist[neighbor] = dist[current]+1;
					visited[neighbor] = true;
					dq.add(neighbor);
				}
			}
		}

		System.out.println(Arrays.toString(dist));

	}
}