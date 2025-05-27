import java.io.*;
import java.util.*;

public class billboard {

	static int area(int x1, int y1, int x2, int y2) {
		return Math.abs(x1 - x2) * Math.abs(y1 - y2);
	}


	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("billboard.in"));
		PrintWriter pw = new PrintWriter(new FileWriter("billboard.out"));

		StringTokenizer st1 = new StringTokenizer(br.readLine());

		int x1min = Integer.parseInt(st1.nextToken());
		int y1min = Integer.parseInt(st1.nextToken());
		int x1max = Integer.parseInt(st1.nextToken());
		int y1max = Integer.parseInt(st1.nextToken());

		StringTokenizer st2 = new StringTokenizer(br.readLine());

		int x2min = Integer.parseInt(st2.nextToken());
		int y2min = Integer.parseInt(st2.nextToken());
		int x2max = Integer.parseInt(st2.nextToken());
		int y2max = Integer.parseInt(st2.nextToken());
		
		StringTokenizer st3 = new StringTokenizer(br.readLine());

		int x3min = Integer.parseInt(st3.nextToken());
		int y3min = Integer.parseInt(st3.nextToken());
		int x3max = Integer.parseInt(st3.nextToken());
		int y3max = Integer.parseInt(st3.nextToken());


		int acc = area(x1min, y1min, x1max, y1max) + 
					area(x2min, y2min, x2max, y2max);

		int deltax1 = 0;
		int deltay1 = 0;

		int deltax2 = 0;
		int deltay2 = 0;

		if (x1min >= x3min && x1min <= x3max) {
			deltax1 = Math.min(Math.abs(x1min - x3max), Math.abs(x1min- x1max));
		} else if (x1max >= x3min && x1max <= x3max) {
			deltax1 = Math.min(Math.abs(x1max - x3min), Math.abs(x1min- x1max));
		} else if (x1min <= x3min && x1max >= x3max) {
			deltax1 = Math.abs(x3max - x3min);
		}

		if (y1min >= y3min && y1min <= y3max) {
			deltay1 = Math.min(Math.abs(y1min - y3max), Math.abs(y1min- y1max));
		} else if (y1max >= y3min && y1max <= y3max) {
			deltay1 = Math.min(Math.abs(y1max - y3min), Math.abs(y1min- y1max));
		} else if (y1min <= y3min && y1max >= y3max) {
			deltay1 = Math.abs(y3max - y3min);
		}


		if (x2min >= x3min && x2min <= x3max) {
			deltax2 = Math.min(Math.abs(x2min - x3max), Math.abs(x2min- x2max));
		} else if (x2max >= x3min && x2max <= x3max) {
			deltax2 = Math.min(Math.abs(x2max - x3min), Math.abs(x2min- x2max));
		} else if (x2min <= x3min && x2max >= x3max) {
			deltax2 = Math.abs(x3max - x3min);
		}

		if (y2min >= y3min && y2min <= y3max) {
			deltay2 = Math.min(Math.abs(y2min - y3max), Math.abs(y2min- y2max));
		} else if (y2max >= y3min && y2max <= y3max) {
			deltay2 = Math.min(Math.abs(y2max - y3min), Math.abs(y2min- y2max));
		} else if (y2min <= y3min && y2max >= y3max) {
			deltay2 = Math.abs(y3max - y3min);
		}

		acc -= ((deltax1 * deltay1) + (deltax2 * deltay2));


		pw.print(acc);
		
		br.close();
		pw.close();
	}
}
