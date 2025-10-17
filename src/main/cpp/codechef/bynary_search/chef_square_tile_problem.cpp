#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

int main() {
   // Write your solution here
   int n; cin >> n;
   vector<ll> v(n);
   for (ll &x: v) cin >> x;
   ll sum =0;
   for (ll x : v) sum+=x;
   ll min=1,max=10e7;
   while (min<max) {
       ll mid=(min+max)/2;
       if (mid*mid>=sum){
           max=mid;
       } else {
           min=mid+1;
       }
   }
   cout << (min*min==sum?"Yes":"No");
   return 0;
}