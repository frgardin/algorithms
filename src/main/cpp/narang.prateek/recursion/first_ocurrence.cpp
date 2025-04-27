#include <iostream>

using namespace std;

auto firstOcc(const int arr[], const int n, const int key) -> int {
    if (n == 0) return -1;
    if (arr[0] == key) return 0;
    int subIndex = firstOcc(arr + 1, n - 1, key);
    if (subIndex != -1) {
        return subIndex + 1;
    }
    return -1;
}

auto lastOcc(const int arr[], const int n, const int key) -> int {
    if (n == 0) return -1;
    return arr[n - 1] == key ? n - 1 : lastOcc(arr, n - 1, key);
}

auto lastOccProfessorSolution(const int arr[], const int n, const int key) -> int {
    if (n == 0) return -1;
    int subIndex = lastOccProfessorSolution(arr + 1, n - 1, key);
    if (subIndex == -1) {
        if (*arr == key) {
            return 0;
        }
        return -1;
    }
    return subIndex + 1;
}

auto main() -> int {
    int arr[] = {1, 2, 3, 4, 7, 6, 7, 8};
    constexpr int n = sizeof(arr) / sizeof(int);
    int key;


    cin >> key;

    cout << firstOcc(arr, n, key) << endl;
    cout << lastOcc(arr, n, key) << endl;
    cout << lastOccProfessorSolution(arr, n, key) << endl;
}
