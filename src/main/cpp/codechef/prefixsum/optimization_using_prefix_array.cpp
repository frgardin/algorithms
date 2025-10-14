#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int n;
    cin >> n;

    vector<int>v(n, 0);

    for (int i =0;i<n;i++)cin >> v[i];

    int k;
    cin >> k;

    vector<long long>pre(n,0);

    pre[0]=v[0];

    for (int i=1;i<n;i++) {
        pre[i]=v[i]+pre[i-1];
    }

    while (k--) {
        int a, b;

        long long ans;

        cin >> a >> b;


        if (a<=1)   ans=pre[b-1];
        else        ans=pre[b-1]-pre[a-2];
        cout << ans << endl;
    }
}
