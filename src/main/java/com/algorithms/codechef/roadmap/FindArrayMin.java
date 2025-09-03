package com.algorithms.codechef.roadmap;

import java.util.*;
import java.lang.*;

class FindArrayMin {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {

            int na = sc.nextInt();
            int nb = sc.nextInt();
            int nc = sc.nextInt();

            int a[] = new int[na];
            int b[] = new int[nb];
            int c[] = new int[nc];

            for (int i = 0; i < na; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < nb; i++) {
                b[i] = sc.nextInt();
            }
            for (int i = 0; i < nc; i++) {
                c[i] = sc.nextInt();
            }

            List<Integer>[] adj = new ArrayList[na + nb + nc];

            for (int i = 0; i < na + nb + nc; i++) {
                adj[i] = new ArrayList<>();
            }

            for (int i = 0; i < na; i++) {
                for (int j = 0; j < nb; j++) {
                    adj[i].add(na + j);
                }
            }

            for (int i = 0; i < nb; i++) {
                for (int j = 0; j < nc; j++) {
                    adj[na + i].add(na + nb + j);
                }
            }


            int min = Integer.MAX_VALUE;

            for (int i = 0; i < na; i++) {
                Deque<Integer> dq = new ArrayDeque<>();
                dq.offer(i);

                int[] abc = new int[3];

                while (!dq.isEmpty()) {
                    int cur = dq.poll();

                    if (cur < na) {
                        abc[0] = a[cur];
                    } else if (cur < na + nb) {
                        abc[1] = b[cur - na];
                    } else {
                        abc[2] = c[cur - na - nb];
                    }

                    if (adj[cur].isEmpty()) {
                        min = Math.min(
                                Math.max(
                                        Math.max(
                                                Math.abs(abc[0] - abc[1]),
                                                Math.abs(abc[1] - abc[2])
                                        ),
                                        Math.abs(abc[0] - abc[2])
                                ),
                                min
                        );
                    }

                    for (int neighbor : adj[cur]) {
                        dq.offer(neighbor);
                    }
                }
            }
            System.out.println(min);
        }
    }
}