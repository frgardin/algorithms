#include<bits/stdc++.h>
 
using namespace std;
 
int main() {
        int n, k;
        cin >> n >> k;
 
        while(k--) {
                n % 10 ? n-- : n /= 10;
        }
        cout << n;
        return 0;
}
