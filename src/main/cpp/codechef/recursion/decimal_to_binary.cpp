#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

string tobin(int n, stringstream &ss) {
    if (n == 1) {
        ss << 1;
        return ss.str();
    }
    if (n == 0) {
        ss << 0;
        return ss.str();
    }
    ss << n%2;
    return tobin(n/2, ss);
}

int main() {
	// your code goes here
    ll n; cin >> n;
    stringstream ss;
    string ans = tobin(n, ss);
    reverse(ans.begin(), ans.end());
    cout << ans;
}
