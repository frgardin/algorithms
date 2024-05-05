#include<bits/stdc++.h>

using namespace std;

int main() {
    int tc; scanf("%d", &tc);
    string s;
    cin.ignore();
    while (tc--) {
        getline(cin, s);
        int f = s.find('+');
        if (f != string::npos) {
            int a = stoi(s.substr(0, f));
            int b = stoi(s.substr(f, s.size() - 1));
            printf("%d\n", a + b);
        } else {
            printf("skipped\n");
        }
    }
    return 0;
}