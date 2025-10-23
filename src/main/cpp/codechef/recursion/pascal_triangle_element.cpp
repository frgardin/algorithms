#include <bits/stdc++.h>
using namespace std;

typedef vector<int> vi;
typedef vector<vector<int>> vii;


void recursion(int n, int actualSize, vii &v) {
    if (actualSize > n) return;
    vi cur;
    for (int i =0;i<actualSize+1;i++) {
        int l = i-1;
        int r = i;
        int value = 0;
        if (l>=0) value+=v[actualSize-1][l];
        if (r<actualSize) value+=v[actualSize-1][r];
        cur.push_back(value);
    }
    v[actualSize]=cur;
    recursion(n, actualSize+1, v);
}

int ans(int n, int m) {
    vii v(n+1);
    vi prev(1, 1);
    v[0] = prev;
    recursion(n, 1, v);
    return v[n][m];
}

int main() {
	// your code goes here
    int n, m;
    cin >> n >> m;
    cout << ans(n, m);
}
