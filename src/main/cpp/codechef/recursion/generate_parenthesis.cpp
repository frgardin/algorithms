#include<bits/stdc++.h>
using namespace std;

typedef vector<string> vs;

void addParenthesis(int n, int open, int close, string cur, vs &permutations) {
    if (open == close && open == n) {
        permutations.push_back(cur);
    }
    if (open < n) {
        addParenthesis(n, open+1, close, cur+"(", permutations);
    }
    if (close < open) {
        addParenthesis(n, open, close+1, cur+")", permutations);
    }
}

vector<string> generateParenthesis(int n) {
    // Write your code here
    string cur;
    vs permutations;
    addParenthesis(n, 0, 0, cur, permutations);
    return permutations;
}

int main() {
    int n;
    cin >> n;
    vector<string> result = generateParenthesis(n);
    sort(result.begin(), result.end()); // Sorting the result vector
    for(const string &s : result) cout << s << endl;
    return 0;
}