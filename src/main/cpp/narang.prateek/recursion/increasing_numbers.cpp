#include<bits/stdc++.h>
using namespace std;

vector<int> increasingNumbers(int N) {
    vector<int>v;

    if (N == 1) {
        v.push_back(1);
        return v;
    }

    vector<int> v2 = increasingNumbers(N-1);
    v2.push_back(N);
    return v2;
}