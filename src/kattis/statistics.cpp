#include<bits/stdc++.h>

using namespace std;

int main() {
    int k;
    int n = 1;
    while (scanf("%d", &k) != EOF) {
        long max = LONG_MIN, min = LONG_MAX, v;
        while (k--) {
            scanf("%ld", &v);
            if (v > max)    max = v;
            if (v < min)    min = v;
        }
        printf("Case %d: %ld %ld %ld\n", n, min, max, max - min);
        n++;
    }
}