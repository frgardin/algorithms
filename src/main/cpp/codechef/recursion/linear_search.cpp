#include <bits/stdc++.h>
using namespace std;

int linearSearch(vector<int>& arr, int n, int x) {
    //Write your code here
    if (n==0) return -1;
    if (arr[n-1] == x) return n-1;
    return linearSearch(arr, n-1, x);
}

int main() {
    int n, x;
    cin >> n >> x;
    vector<int> arr(n);
    for (int i = 0; i < n; i++) cin >> arr[i];
    cout << linearSearch(arr, n, x) << endl;
    return 0;
}
