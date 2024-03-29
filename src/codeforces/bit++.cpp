#include<bits/stdc++.h>

using namespace std;


int main() {
    int t, r = 0;
    cin >> t;
    string s;

    for (int i = 0; i < t; i++) {
        cin.ignore();
        getline(cin, s);
        if (s.at(0) == '+' || s.at(s.size() - 1) == '+') {
            r++;
        } else {
            r--;
        }
    }
    cout << r;
    return 0;
}