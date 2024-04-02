#include<bits/stdc++.h>

using namespace std;

int main() {
    int m[5][5];

    int x,y;
    
    for (int i = 0; i < 5; i++){
        for (int j = 0; j < 5; j++) {
            int a;
            cin >> a;
            m[i][j] = a;
            if (a == 1) {
                y = i;
                x = j;
            }
        }
    }

    cout << abs(x - 2) + abs(y - 2);
} 