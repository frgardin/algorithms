#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

ll ans(ll n) {
    if (n/10 == 0) return n;
    ll cur=0;
    while (n/10 > 0) {
        cur+=n%10;
        n/=10;
        if (n/10 ==0) {
            cur+=n;
            break;
        }
    }
    return ans(cur);
}

int main() {
	// your code goes here
    ll n; cin >> n;
    cout << ans(n);   
}
