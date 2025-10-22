#include<bits/stdc++.h>
using namespace std;

void backtrack(int s, int i, int &cur, int &count) {
    if (cur == s) {
        count++;
        return;
    }
    if (cur >s) return;
    for (int j=1;j<=2;j++) {
        cur+=j;
        backtrack(s,j, cur, count);
        cur-=j;
    }
}

int countWays(int s) {
    // Write your code here
    int ans=0;
    int cur=0;
    backtrack(s, 0, cur, ans);
    return ans;
}

int main() {
    int S;
    cin >> S;
    cout << countWays(S) << endl;
    return 0;
}