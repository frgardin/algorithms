#include <bits/stdc++.h>
using namespace std;

typedef vector<vector<int>> vii;

int main() {
	// your code goes here
	int n, m; cin >> n >> m;
	vii v(n, vector<int>(m));
	
	for (int i=0;i<n;i++) {
	    for (int j=0;j<m;j++) {
	        cin >> v[i][j];
    	}   
	}
    int count=0;

    for (int i=0;i<n;i++) {
	    for (int j=0;j<m;j++) {
	        if (v[i][j] <0) {
                count+=m-j;
                break;
	        }
    	}   
	}
	
	cout << count;
}
