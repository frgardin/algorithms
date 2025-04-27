//
// Created by gardi on 4/27/2025.
//

#include <iostream>
using namespace std;

bool isSorted(int arr[], const int n) {
    if (n == 1 or n == 0) return true;
    return arr[0]<arr[1] and isSorted(arr+1, n - 1);
}

bool isSorted(int arr[], const int i, const int n) {
    if (i == n-1) return true;
    return arr[i]<arr[i + 1] and isSorted(arr, i + 1, n);
}

int main() {
    int arr[] = {0, 1, 2, 3, 4, 5, 6};
    const int n  = sizeof(arr)/sizeof(int);
    cout << isSorted(arr, n) << endl << isSorted(arr, 0, n) << endl;
    return 0;
}
