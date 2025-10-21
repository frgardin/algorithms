#include <bits/stdc++.h>

using namespace std;

typedef vector<int> vi;
typedef vector<vector<int>> vii;

void backtrack(vi &multiset, int index, vi &cur, vii &ans) {
    ans.push_back(cur);
    
    for (int i = index; i < multiset.size();i++) {
        
        if (i > index && multiset[i] == multiset[i-1]) {
            continue;
        }
        
        cur.push_back(multiset[i]);
        
        backtrack(multiset, i+1, cur, ans);
        
        cur.pop_back();
    }
}

vii uniqueSubsets(vi &multiset) {
    // Write your code here
    vii ans;
    vi cur;
    
    sort(multiset.begin(), multiset.end());
    
    backtrack(multiset, 0, cur, ans);
    return ans;
}

void printSubsets(vii& subsets) {

    sort(subsets.begin(), subsets.end());
    
    for (auto& subset : subsets) {
        cout << "[";
        for (int i = 0; i < subset.size(); ++i) {
            cout << subset[i];
            if (i < subset.size() - 1) {
                cout << " ";
            }
        }
        cout << "]\n";
    }
}

int main() {
    int n;
    cin >> n;
    
    vi multiset(n);
    for (int i = 0; i < n; ++i) {
        cin >> multiset[i];
    }
    sort(multiset.begin(), multiset.end());
    
    vii result = uniqueSubsets(multiset);
    
    printSubsets(result);

    return 0;
}