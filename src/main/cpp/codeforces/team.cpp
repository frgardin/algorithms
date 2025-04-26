#include <bits/stdc++.h>

using namespace std;

int main() {
    int n;
    const int p = 3;
    cin >> n;
    int r = 0;
    for (int i = 0; i < n; i++) {
        int a, b = 0;
        for (int j = 0; j < p; j++) {
            cin >> a;
            b += a;
        }
        if (b >=2){
            r++;
        }
    }

    cout << r;
    return 0;
}