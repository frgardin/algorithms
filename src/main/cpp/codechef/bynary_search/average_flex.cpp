#include <bits/stdc++.h>
using namespace std;

typedef vector<int> vi;
typedef int i;

int main() {
	// your code goes here
	i t; cin >> t;
	while(t--)
	{
	    i n; cin >> n;
	    vi v(n);
	    for(int &x : v) cin >> x;
	    sort(v.begin(), v.end());
	    int count=0;
	    for (i &x : v) 
	    {
	        i less_equal = upper_bound(v.begin(), v.end(), x) - v.begin();
	        i greater = n - less_equal;
	        if (less_equal>greater) count++;
	    }
	    cout << count << endl;
	}
}
