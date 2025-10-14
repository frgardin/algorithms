#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int n;
    cin >> n;
    
    vector<int> v(n);
    
    for (int i=0;i<n;i++) cin >> v[i];
    
    vector<int> pre(n);
    vector<int> suf(n);
    
    pre[0]=v[0];
    suf[n-1]=v[n-1];
    
    for (int i=1;i<n;i++) 
    {
        pre[i]=__gcd(v[i], pre[i-1]);
        suf[n-1-i]=__gcd(v[n-1-i], suf[n-i]);
    }
    
    int ans = 0;
    for (int i = 0; i < n; i++) {
        int left = (i == 0) ? 0 : pre[i - 1];
        int right = (i == n - 1) ? 0 : suf[i + 1];
        ans = max(ans, __gcd(left, right));
    }
    
    cout << ans << endl;
    return 0;
}

