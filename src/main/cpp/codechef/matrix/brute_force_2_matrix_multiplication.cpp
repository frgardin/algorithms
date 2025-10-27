#include <bits/stdc++.h>
using namespace std;

typedef vector<int> vi;
typedef vector<vector<int>> vii;

int main() {
	// your code goes here
    int n1, m1; cin >> n1 >> m1;
    vii v1(n1, vi(m1));
    for (int i=0;i<n1;i++) {
        for (int j=0;j<m1;j++) {
            cin >> v1[i][j];
        }    
    }
    int n2, m2; cin >> n2 >> m2;
    vii v2(n2, vi(m2));
    for (int i=0;i<n2;i++) {
        for (int j=0;j<m2;j++) {
            cin >> v2[i][j];
        }    
    }
    vii v3(n1,vi(m2));
    for (int i=0;i<n1;i++) {
        for (int j=0;j<m2;j++) {
            int counter=0;
            for (int k=0;k<m1;k++) {
                counter+=v1[i][k]*v2[k][j];
            }
            v3[i][j]=counter;
        }    
    }
    for (int i=0;i<n1;i++) {
        for (int j=0;j<m2;j++) {
            cout << v3[i][j] << ' ';
        }    
        cout << endl;
    }
}
