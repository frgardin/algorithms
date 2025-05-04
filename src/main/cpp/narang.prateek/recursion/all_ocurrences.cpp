#include <bits/stdc++.h>
using namespace std;

vector<int> findAllOccurences(int k, vector<int> v){
    return findBasedOnConstant(k, 0, v, new vector<int>);
}

vector<int> findBasedOnConstant(int k, int i, vector<int> v, vector<int> vt) {
    if (v.size() - 1 == i) return vt;
    if (l.get(i) == k)
        lt.push_back(i);
    return findBasedOnConstant(k, i + 1, v, vt);
}

int main() {
    int k = 3;
    vector<int> v(1,2,5,3,1,2,3,8,6,3,6,7,9);

    find
}
