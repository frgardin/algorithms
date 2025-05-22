/*
ID: gardinf1
LANG: JAVA
TASK: speeding
*/
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


class speeding {

    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        static Pair of(int f, int s) {
            return new Pair(f, s);
        }

        @Override
        public String toString() {
            return "(" + this.first + ", " + this.second + ")";
        }
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("speeding.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("speeding.out")));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int ni = 0;
        int mi = 0;

        List<Pair> nl = new ArrayList<>();
        List<Pair> ml = new ArrayList<>();

        while (ni++ < n) {
            StringTokenizer nst = new StringTokenizer(br.readLine());
            nl.add(Pair.of(Integer.parseInt(nst.nextToken()), Integer.parseInt(nst.nextToken())));
        }
        while (mi++ < m) {
            StringTokenizer mst = new StringTokenizer(br.readLine());
            ml.add(Pair.of(Integer.parseInt(mst.nextToken()), Integer.parseInt(mst.nextToken())));
        }

        ni = 0;
        mi = 0;
        int nii = nl.get(0).first;
        int mii = 0;
        int max = 0;
        while (nii < 100) {
            while (mii < nii) {
                max = Math.max(max, ml.get(mi).second - nl.get(ni).second);
                mii += ml.get(mi).first;
                mi++;
            }
            ni++;
            nii += nl.get(ni).first;
        }

        while (mii < nii) {
            max = Math.max(max, ml.get(mi).second - nl.get(ni).second);
            mii += ml.get(mi).first;
            mi++;
        }

        pw.print(max);
        br.close();
        pw.close();
    }
}	