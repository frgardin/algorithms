
import java.io.*;
import java.util.*;

public class shuffle {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("shuffle.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("shuffle.out"));


        int n = Integer.parseInt(br.readLine());

        StringTokenizer stPos = new StringTokenizer(br.readLine());
        StringTokenizer stVal = new StringTokenizer(br.readLine());

        int[] pos = new int[n];
        int[] val = new int[n];

        for(int i = 0; i < n;i++) {
            pos[i] = Integer.parseInt(stPos.nextToken());
            val[i] = Integer.parseInt(stVal.nextToken());
        }

        for (int j = 0; j < 3; j++) {
            int[] prev = val.clone();
            for (int i = 0; i< n; i++) {
                val[i] = prev[pos[i] - 1];
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(val[i]);
            sb.append('\n');
        }

        pw.print(sb);
        br.close();
        pw.close();
    }
}