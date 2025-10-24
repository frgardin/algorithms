#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int n, m; cin >> n >> m;
	int a[n][m];
	for (int i =0;i<n;i++) {
	    for (int j =0;j<m;j++) {
	        cin >> a[i][j];
	    }   
	}
	for (int i =n-1;i>=0;i--) {
	    for (int j =0;j<m;j++) {
	        cout << a[i][j] << ' ';
	    }
	    cout << endl;
	}
}
