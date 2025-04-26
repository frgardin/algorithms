#include<bits/stdc++.h>

using namespace std;

int main() {
        int n, a, b, c;
        cin >> a >> b >> c >> n;
        int s = a + b + c;
        if (s >= n && a > 0 && b > 0 && c > 0 && n >= 3) {
                cout << "YES";
                return 0;
        }
        cout << "NO";
        return 0;
}
