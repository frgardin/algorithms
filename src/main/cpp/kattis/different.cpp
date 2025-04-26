#include<bits/stdc++.h>

using namespace std;

int main() {
    long a, b, d;
    string s = "";
    while(scanf("%ld %ld", &a, &b) != EOF) {
        if (a > b)  d = a - b;
        else        d = b - a;
        s += to_string(d) + "\n";
    }
    cout << s;
    return 0;
}
