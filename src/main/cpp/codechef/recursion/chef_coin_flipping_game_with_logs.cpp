#include<bits/stdc++.h>
using namespace std;

typedef vector<vector<int>> vii;
typedef vector<int> vi;
typedef pair<int, vector<int>> pivi;

void backtrack(int s, int i, pivi &cur, int &count) {
    if (cur.first == s) {
        count++;
        return;
    }
    if (cur.first >s) return;
    for (int j=1;j<=2;j++) {
        cur.first+=j;
        cur.second.push_back(j);
        backtrack(s,j, cur, count);
        cur.first-=j;
        cur.second.pop_back();
    }
}

int countWays(int s) {
    // Write your code here
    int ans=0;
    pivi cur;
    cur.first=0;
    vi v;
    cur.second=v;
    backtrack(s, 0, cur, ans);
    return ans;
}

int main() {
    int S;
    cin >> S;
    cout << countWays(S) << endl;
    return 0;
}