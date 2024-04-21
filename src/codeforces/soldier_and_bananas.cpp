#include<bits/stdc++.h>
 
using namespace std;
 
int multiply(int a, int b) {
        int acc = 0;
        for (int i = 1; i <= b; i++) {
                acc += i*a;
        }
        return acc;
}
 
int soldierAndBananas(int k, int n, int w) {
        int r = multiply(k, w) - n;
        return r > 0 ? r : 0;
}
 
 
int main() {
        int k, n, w;
        cin >> k >> w >> n;
        cout << soldierAndBananas(k, w, n);
        return 0;
}
