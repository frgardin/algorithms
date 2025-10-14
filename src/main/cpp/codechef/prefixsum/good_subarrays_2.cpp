#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int n;
    cin >> n;
    
    vector<long long> v(n);
    unordered_map <long, long> m1;
    for (int i=0;i<n;i++) cin >> v[i];
    
    long long sum=0;
    long long ans=0;
    m1[0]=1;

    for (int i =1;i<=n;i++) 
    {
        sum+=v[i-1];
        ans+=m1[sum-i];
        m1[sum-i]++;
    }
    
    cout << ans;
    return 0;
}

