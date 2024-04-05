#include<bits/stdc++.h>

using namespace std;

int get_n(int n, int max) {
    if (n % 2 == 0)     return get_n(n/2, ++max);
    else if (n == 1)    return ++max;
    else                return get_n(3 * n + 1, ++max); 
}

int main() {
    int i, j, f;

    while(cin >> i >> j) {
            int ti = i < j ? i : j;
        int tj = ti == i ? j : i;

        int max = 0;

        for (int k = ti; k <= tj; k++) {
            int m = get_n(k, 0);
            if (m > max) {
                max = m;
            }
        }

        cout << i << " " << j << " " << max;

    }
 

    return 0;
}