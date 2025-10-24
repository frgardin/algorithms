#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int n;cin >> n;
	int a[n][n];
	for (int i =0;i<n;i++) {
	    for (int j =0;j<n;j++) {
	        cin >> a[i][j];
	    }   
	}
	int acc=0;
	for (int i =0;i<n;i++) {
	    acc+=a[i][i];   
	}
	for (int i =n-1;i>=0;i--) {
	    if (n-i-1==i) continue;
	    acc+=a[n-i-1][i];   
	}
	cout << acc;
}
