#include <bits/stdc++.h>

using namespace std;

vector<vector<int>> uniqueSubsets(vector<int>& multiset) {
    // Write your code here
    vector<vector<int>> first_one;
    if (multiset.empty()) {
        return first_one;
    }
    for (int i=0;i<=multiset.size();i++) {
        vector<int> v;
        for (int j=0;j<i;j++) {
            v.push_back(multiset[j]);
        }
        first_one.push_back(v);
    }
    multiset.erase(multiset.begin());
    vector<vector<int>> second_one = uniqueSubsets(multiset);
    vector<vector<int>> ans;
    for (auto &x : first_one) {
        ans.push_back(x);
    }
    for (auto &x : second_one) {
        ans.push_back(x);
    }
    return ans;
}

void printSubsets(vector<vector<int>>& subsets) {

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
    
    vector<int> multiset(n);
    for (int i = 0; i < n; ++i) {
        cin >> multiset[i];
    }
    
    vector<vector<int>> result = uniqueSubsets(multiset);
    
    printSubsets(result);

    return 0;
}