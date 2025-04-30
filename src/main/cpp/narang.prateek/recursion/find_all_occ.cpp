#include <bits/stdc++.h>
using namespace std;

vector<int> find(int k, int i, vector<int>v, vector<int>vr) {
    if (i == v.size()) return vr;
    if (v[i] == k) vr.push_back(i);
    return find(k, i+1, v, vr);
}

vector<int> findAllOccurences(int k, vector<int> v){
    vector<int> vr;
    return find(k, 0, v, vr);
}
