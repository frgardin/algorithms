#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

ll gcd(ll a, ll b) {
    ll minnum = min(a, b);
    ll maxnum = max(a, b);
    if (minnum == 0) return maxnum;
    return gcd(minnum, maxnum%minnum);
}

int main() {
	// your code goes here
    ll a, b;
    cin >> a >> b;
    cout << gcd(a, b);
}
