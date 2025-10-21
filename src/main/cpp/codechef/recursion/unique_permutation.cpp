#include <bits/stdc++.h>

using namespace std;

void backtrack(vector<int>& multiset, vector<bool>& used, vector<int>& path, vector<vector<int>>& permutations) {
    
    if (path.size() == multiset.size()) {
        permutations.push_back(path);
        return;
    }
    
    for (int i = 0; i < multiset.size(); ++i) {
    
        if (used[i] || (i > 0 && multiset[i] == multiset[i - 1] && !used[i - 1])) {
            continue;
        }
        
        path.push_back(multiset[i]);
        used[i] = true;
    
        backtrack(multiset, used, path, permutations);
    
        used[i] = false;
        path.pop_back();
    }
}


vector<vector<int>> uniquePermutations(vector<int>& multiset) {
    sort(multiset.begin(), multiset.end());
    
    vector<vector<int>> permutations;
    vector<int> path;
    vector<bool> used(multiset.size(), false);
    
    backtrack(multiset, used, path, permutations);
    
    return permutations;
}

void printPermutations(const vector<vector<int>>& permutations) {
    for (const auto& permutation : permutations) {
        cout << "[";
        for (size_t i = 0; i < permutation.size(); ++i) {
            cout << permutation[i];
            if (i < permutation.size() - 1) {
                cout << " ";
            }
        }
        cout << "]\n";
    }
}

int main() {
    int n;cin >> n;
    vector<int> multiset(n);
    for (int i = 0; i < n; ++i) {
        cin >> multiset[i];
    }
    vector<vector<int>> result = uniquePermutations(multiset);
    printPermutations(result);
    return 0;
}