#include <bits/stdc++.h>
using namespace std;

int main() 
{
	// your code goes here
    int t;
    
    cin >> t;
    
    while (t--)
    {
        int n;
        cin >> n;
        vector<int> v(n);
        
        for (int i=0;i<n;i++) cin >> v[i];
        
        int q;
        cin >> q;
        
        while (q--) 
        {
            int l, r, x;
            cin >> l >> r >> x;
            
            int ans=0;
            
            for (int i =l-1;i<r;i++) {
                int op1=v[i]^x;
                int op2=v[i]&x;
                if (op1 > op2) {
                    ans++;
                }
            }
            
            cout << ans << endl;
        }
    }

}

