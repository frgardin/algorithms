#include<bits/stdc++.h>

using namespace std;

int main() {
    int N;
    unordered_map<char, int>m{
        {'x', 0},
        {'y', 0},
        {'z', 0}
    };
    cin >> N;
    
    while(N--) {
        int x, y, z;
        cin >> x >> y >> z;
        m['x'] += x;
        m['y'] += y;
        m['z'] += z;
    }

    if (m['x'] == 0 && m['y'] == 0 && m['z'] == 0) {
        cout << "YES";
    } else {
        cout << "NO";
    }
    
    return 0;
}