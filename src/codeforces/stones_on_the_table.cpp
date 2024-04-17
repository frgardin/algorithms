#include<bits/stdc++.h>
 
using namespace std;
 
int main(){
        int n;
        cin >> n;
        map<char, vector<int>> m{
                {'R', {INT_MAX}},
                {'G', {INT_MAX}},
                {'B', {INT_MAX}}
        };
        int i = 0;
        int p = 0;
 
        while (n--) {
                char c;
                cin >> c;
                int b = m[c].back();
                m[c].push_back(i);
                if (!(b - i + 1))       p++;
                i++;
        }
 
        cout << p;
        return 0;
}
