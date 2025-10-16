#include <bits/stdc++.h>

using namespace std;

int search_insert_position(vector<int> v, int n, int k) {
    int l=0,r=n-1;
    while (l<=r) {
        int m = (l+r)/2;
        if (v[m] == k) return m;
        if (v[m] > k) r =m-1;
        else          l=m+1;
    }
    return l;
}

int main() {
    int n, q;
    cin >> n >> q;
    vector<int> v(n);
    for (int &x : v) cin >> x;
    while (q--) {
        int k; cin >> k;
        cout << search_insert_position(v, n, k) << endl;
    }
}