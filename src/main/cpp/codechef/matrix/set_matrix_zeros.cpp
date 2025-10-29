#include <bits/stdc++.h>
using namespace std;

void setZeroes(vector<vector<int>> &mat) {
    // Write your code here
    unordered_set<int> lines;
    unordered_set<int> cols;
    int n = mat.size();
    int m = mat[0].size();
    for (int i =0;i<n;i++) {
        for (int j =0;j<m;j++) {
            if (!mat[i][j]) {
                lines.insert(i);
                cols.insert(j);
            }
        }   
    }
    
    for (int line : lines) {
        for (int j =0;j<m;j++) {
            mat[line][j]=0;
        }
    }
    for (int col : cols) {
        for (int i =0;i<n;i++) {
            mat[i][col]=0;
        }
    }
}

int main() {
    int n, m;
    cin >> n >> m;

    vector<vector<int>> mat(n, vector<int>(m));
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> mat[i][j];
        }
    }

    setZeroes(mat); // call user function

    // Print the matrix after setting zeroes
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cout << mat[i][j] << " ";
        }
        cout << "\n";
    }

    return 0;
}