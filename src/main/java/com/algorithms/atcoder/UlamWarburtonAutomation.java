package com.algorithms.atcoder;

import java.util.*;

// https://atcoder.jp/contests/abc425

public class UlamWarburtonAutomation {

	private static int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		char[][] map = new char[h][w];
		Deque<Point> startPoints = new ArrayDeque<>();
		
		
		for (int i = 0; i <h;i++) {
			for (int j = 0; j <w;j++) {
				char c = sc.next().charAt(0);
				map[i][j] = c;
				if (c == '#') {
					Point p = new Point();
					p.x=i;
					p.y=j;
					p.startPoint=true;
					startPoints.add(p);
				}
			}
		}
		
		if (startPoints.isEmpty()) {
			System.out.print(0);
			return;
		}
		
		
		while (!startPoints.isEmpty()) {
			Point cur = startPoints.poll();
			
			if (cur.startPoint) {
				for (int[] d : dir) {
					int ni = cur.x + d[0];
					int nj = cur.y + d[1];
					
					if (ni >= 0 && ni < h &&
							nj >= 0 && nj < w &&
							map[ni][nj] != '#'
					) {
						Point p = new Point();
						p.x = ni;
						p.y = nj;
						p.dir = new int[] {d[0], d[1]};
						p.jump=true;
					}
				}
			}
		}
	}
}

class Point {
	int x;
	int y;
	int[] dir;
	boolean jump;
	boolean startPoint;
}
