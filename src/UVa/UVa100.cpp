#include <bits/stdc++.h>

using namespace std;

int get_max(int n, int m) {
    if (n % 2 == 0)     return get_max(n/2, ++m);
    if (n == 1)         return m;
    return get_max(3*n+1, ++m);
}

int main() {
    int a, b;

    while (scanf("%d %d", &a, &b) != EOF) {
        int m = 0;

        for (int n = a < b ? a : b; n <= (b > a ? b : a); n++) {
            int mc = get_max(n, 1);
            if (mc > m)     m = mc;
        }
        printf("%d %d %d\n", a, b, m);
    }
}