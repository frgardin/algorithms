#include <bits/stdc++.h>

using namespace std;

int main() {
    int n, k, a, b, r;

    cin >> n >> k;
    
    b = 0;  
    r = 0;

    for (int i = 1; i <= n; i++) {
        cin >> a;
        if (a != 0) {
            if (i <= k) {
                if (i == k) {
                    b = a;
                }
                r++;    
            } else if (a == b){
                r++;  
            }
        }
    }

    cout << r;
       
}