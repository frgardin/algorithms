#include <iostream>

using namespace std;

auto firstOcc(int arr[], const int n, const int key) -> int {
    if (n == 0) return -1;
    return arr[n] == key ? n : firstOcc(arr, n - 1, key);
}

auto professorSolution(int arr[], const int n, const int key) -> int {
    if (n == 0) return -1;

    if (arr[0] == key) return 0;

    int subIndex = professorSolution(arr + 1, n - 1, key);
    if (subIndex != -1)  return subIndex+1;
    return -1;
}

auto main() -> int {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
    constexpr int n = sizeof(arr)/sizeof(int);
    int key;

    cin >> key;

    cout << firstOcc(arr, n, key) << endl;
    cout << professorSolution(arr, n, key) << endl;
}