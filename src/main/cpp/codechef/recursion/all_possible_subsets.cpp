#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

/*
Element to be considered                  [1, 2, 3]
                          |
        ----------------------------------------------
        |                                            |
      Include                                      Exclude
        |                                            |
       [1]                                          [ ]
        |                                            |
   -------------                               -------------
   |           |                               |           |
 Include     Exclude                        Include     Exclude
   |           |                               |           |
 [1,2]        [1]                             [2]         [ ]
   |           |                               |           |
 -----      -----                           -----        -----
 |   |      |   |                           |   |        |   |
I    E     I    E                         I    E        I    E
|    |     |    |                         |    |        |    |
[1,2,3] [1,2] [1,3] [1]                 [2,3] [2]     [3]   [ ]
*/

void allPossibleSubsets(vector<int>& arr, int curIndex, vector<int>& curSubset, vector<vector<int>>& allSubsets) {
    //Write your code here
    if (curIndex>= arr.size()) {
        allSubsets.push_back(curSubset); // save in allSubsets
        return;
    }
    curSubset.push_back(arr[curIndex]); // add inclusive
    allPossibleSubsets(arr, curIndex+1, curSubset, allSubsets); // call recursively
    curSubset.erase(curSubset.begin()+curIndex); // exclude
    allPossibleSubsets(arr, curIndex+1, curSubset, allSubsets); // call recursively
}

int main() {
    int n;
    cin >> n;
    vector<int> arr(n);
    for (int i = 0; i < n; ++i) {
        cin >> arr[i];
    }
    vector<int> curSubset;
    vector<vector<int>> allSubsets;
    allPossibleSubsets(arr, 0, curSubset, allSubsets);
    sort(allSubsets.begin(), allSubsets.end());
    for (auto subset : allSubsets) {
        for (auto num : subset) {
            cout << num << " ";
        }
        cout << endl;
    }
    return 0;
}
