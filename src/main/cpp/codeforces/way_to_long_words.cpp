#include<bits/stdc++.h>

using namespace std;


int main() {
    int t;
    cin >> t;
    string s, r = "";

    for (int i = 0; i <= t; i++) {
        getline(cin, s);
        if (s.size() > 10) {
            r += s.at(0) + to_string(s.size() - 2) + s.at(s.size() - 1)+ "\n";
        } else {
            r += s + "\n";
        }
    }
    cout << r;
    return 0;
}