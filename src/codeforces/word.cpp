#include<bits/stdc++.h>
 
using namespace std;
 
int main() {
        string s;
        string s1 = "";
        string s2 = "";
        getline(cin, s);
        unordered_map<int, int>m;
        m[0] = 0;
        m[1] = 0;
        for (char c : s) {
                if (c - 'a' < 0){
                        m[0]++;
                        s1 += c;
                        s2 += c + 32;
                } else {
                        m[1]++;
                        s1 += c - 32;
                        s2 += c;
                }
        }
        if (m[0] > m[1]) {
                cout << s1;
                return 0;
        }
 
        cout << s2;
        return 0;
}
