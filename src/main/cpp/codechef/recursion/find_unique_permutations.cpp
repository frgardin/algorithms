#include <bits/stdc++.h>
using namespace std;

typedef vector<int> vi;
typedef vector<bool> vb;
typedef vector<vector<int>> vii;

void backtrack(vi &v, int n, vb &used, vi &cur, vii &ans) {
    if (v.size() == cur.size()) {
        ans.push_back(cur);
        return;
    }
    for (int i =0;i<n; i++) {
        
        if (used[i] || (i > 0 && v[i] == v[i-1] && !used[i-1])) continue;
        
        cur.push_back(v[i]);
        used[i]=true;
        backtrack(v, n, used, cur, ans);
        cur.pop_back();
        used[i]=false;
    }
}

int main() {
	// your code goes here
	int t; cin >> t;
	auto ans = [](vi v, int n){
	    sort(v.begin(), v.end());
	    vii r;
	    vi cur;
	    vb used(n, false);
	    backtrack(v, n, used, cur, r);
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
	    int n; cin >> n;
	    vi v(n); for (int &x : v) cin >> x;
	    print(ans(v, n));
	}
}
