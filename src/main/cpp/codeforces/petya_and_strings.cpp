#include<bits/stdc++.h>

using namespace std;

int main() {
    string s1,s2;
    int r = 0; 
    cin >> s1 >> s2;
    

    for (int i = 0; i < s1.size(); i++) {
        if (tolower(s1.at(i)) > tolower(s2.at(i))) {
            r = 1;
            break;
        }
        if (tolower(s1.at(i)) < tolower(s2.at(i))) {
            r = -1;
            break;
        }
    }

    cout << r;
}
