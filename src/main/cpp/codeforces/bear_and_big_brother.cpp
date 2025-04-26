#include<bits/stdc++.h>
 
using namespace std;
 
int main() {
        int a, b;
        cin >> a >> b;
        int y = 0;
        while (b - a >=0) {
                a *= 3;
                b *= 2;
                y++;
        }
        cout << y;
 
        return 0;
}
