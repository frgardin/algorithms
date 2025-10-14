#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    
    cin >> t;
    
    
    while (t--) {
        int n;
        
        cin >> n;
        
        long a[n];
        
        for (int i=0;i<n;i++) cin >> a[i];
        
        long pre[n];
        long suf[n];
        
        pre[0]=a[0];
        suf[n-1]=a[n-1];
        for (int i=1;i<n;i++) {
            pre[i]=a[i]+pre[i-1];
            suf[n-i-1]=a[n-i-1]+suf[n-i];
        }
        
        long min=LONG_MAX;
        
        int ans=0;
        
        for (int i=0;i<n;i++) {
            if (pre[i]+suf[i] < min) {
                ans=i+1;
                min=pre[i]+suf[i];
            }
        }
        cout << ans << endl;
    }
}

