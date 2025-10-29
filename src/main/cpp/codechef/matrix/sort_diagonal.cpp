#include <bits/stdc++.h>
using namespace std;

typedef vector<int> vi;
typedef vector<vector<int>> vii;

void sort(vii &matrix, int &n, int &m) {
    unordered_map<int, priority_queue<int, vi, greater<int>>> d;
    for (int i =0;i<n;i++) {
        for (int j =0;j<m;j++) {
            d[i-j].push(matrix[i][j]);
        }
    }
    for (int i =0;i<n;i++) {
        for (int j =0;j<m;j++) {
            matrix[i][j]=d[i-j].top();
            d[i-j].pop();
        }
    }
}

int main() {
	// your code goes here
    int n, m; cin >> n >> m;
    vii matrix(n, vi(m));
    for (int i =0;i<n;i++) {
        for (int j =0;j<m;j++) {
            cin >> matrix[i][j];
        }
    }
    sort(matrix, n, m);
    for (int i =0;i<n;i++) {
        for (int j =0;j<m;j++) {
            cout << matrix[i][j] << ' ';
        }
        cout << endl;
    }
}
