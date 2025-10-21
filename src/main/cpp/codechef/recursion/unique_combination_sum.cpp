#include <bits/stdc++.h>
using namespace std;

typedef vector<int> vi;
typedef vector<vector<int>> vii;

void backtrack(vi &v, int n, int b, int i, int c, vi &cur, vii &r) {
    if (c == b) {
        r.push_back(cur);
        return;
    }
    if (c > b || i >= n) return;
    
    for (int idx = i; idx < n; idx++) {
        if (idx > i && v.at(idx) == v.at(idx-1)) continue;
        cur.push_back(v[idx]);
        backtrack(v, n, b, idx, c + v[idx], cur, r);
        cur.pop_back();
    }
}

int main() {
    int t; cin >> t;
    auto solve = [](vi &v, int n, int b) -> vii {
        vii r;
        vi cur;
        sort(v.begin(), v.end());
        backtrack(v, n, b, 0, 0, cur, r);
        return r;
    };
    auto print = [](vii ans) {
        cout << ans.size() << endl;
        for (vi comb : ans) {
            for (int i : comb) {
                cout << i << ' ';
            }
            cout << endl;
        }
    };
    while (t--) {
        int n, b; cin >> n >> b;
        vi v(n); for (int &x : v) cin >> x;
        print(solve(v, n, b));
    }
    return 0;
}