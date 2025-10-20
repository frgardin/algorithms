#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int t; cin >> t;
	while(t--)
	{
	    int n; cin >> n;
	    vector<int> v(n);
	    for(int &x : v) cin >> x;
	    sort(v.begin(), v.end());
	    int count=0;
	    for (int &x : v) 
	    {
	        int less_equal = upper_bound(v.begin(), v.end(), x) - v.begin();
	        int greater = n - less_equal;
	        if (less_equal>greater) count++;
	    }
	    cout << count << endl;
	}
}
