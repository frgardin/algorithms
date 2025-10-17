#include <bits/stdc++.h>
using namespace std;

int main(){
    // Write your code here
    int n;cin>>n;
    vector<int>v(n);
    for (int &x:v) cin >> x;
    int l=0,r=n-1;
    while (l<r) {
        int mid=(l+r)/2;
        if (v[mid]==1) {
            r=mid;
        } else {
            l=mid+1;
        }
    }
    cout << (l==n-1 && v[l] == 0? 0 : n-l);
}
