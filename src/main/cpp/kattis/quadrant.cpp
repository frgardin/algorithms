#include<bits/stdc++.h>

using namespace std;

int main() {
    int x, y;
    cin >> x >> y;
    int r;
    if (x > 0 && y > 0) r = 1;
    else if(x < 0 && y > 0) r = 2;
    else if(x < 0 && y < 0) r = 3;
    else if(x > 0 && y < 0) r = 4;
    cout << r;
    return 0;
}
