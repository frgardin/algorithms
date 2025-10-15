#include <bits/stdc++.h>

using namespace std;

typedef long long int ll;

int main()
{
    int t; cin >> t;

    auto get_msb = [] (ll x) {
        int max =31;
        while (max>=0) {
            if (x & (1LL << max)) return max;
            max--;
        }
        return 32;
    };

    while (t--) {
        int n; cin >> n;
        vector<ll> v(n);

        for (ll& x : v) cin >> x;

        vector<array<ll, 33>> pre(n);

        for (int i =0;i<n;i++) {
            if (i) pre[i]=pre[i-1];
            pre[i][get_msb(v[i])]++;
        }

        int q;cin >> q;

        auto get = [&] (int l, int r, int b) {
            int ret = pre[r][b];
            if (l) ret-=pre[l-1][b];
            return ret;
        };

        while (q--) {
            int l, r,x;
            cin >> l >> r >>x;

            cout << r-l+1 - get(l-1, r-1, get_msb(x)) << endl;
        }
    }
}
