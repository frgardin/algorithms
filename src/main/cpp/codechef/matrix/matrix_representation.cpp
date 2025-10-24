#include <bits/stdc++.h>
using namespace std;

int main() {
  int n;
  cin >> n;

  assert(1 <= n && n <= 100);

  vector<vector<int> > mat(n, vector<int> (n));

  for(int i = 0; i < n; i++){
    for(int j = 0; j < n; j++){
      // complete the code
      mat[i][j] = i*n+j+1;
    }
  } 
  
  for(int i = 0; i < n; i++){
    for(int j = 0; j < n; j++){
       cout << mat[i][j] << ' ';
    }
  } 

  return 0;
} 