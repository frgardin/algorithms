#include <iostream>
using namespace std;

int countOccurrences(const int arr[], int n, int target) {
    // Write your code here
    int l=0,r=n-1;
    while (l<r) {
        int mid=(l+r)/2;
        if (arr[mid]>=target) {
            r=mid;
        } else {
            l=mid+1;
        }
    }
    int lowerBound=l;
    l=0,r=n-1;
    while (l<r) {
        int mid=(l+r)/2;
        if (arr[mid]>target) {
            r=mid;
        } else {
            l=mid+1;
        }
    }
    int higherBound = r;
    return (higherBound-lowerBound) == n-1 && arr[0] == target && arr[n-1] == target ? n : higherBound-lowerBound;
}

int main() {
    int size, target;
    cin >> size;
    int arr[size];
    for (int i = 0; i < size; ++i) {
        cin >> arr[i];
    }
    cin >> target;
    cout << countOccurrences(arr, size, target) << endl;

    return 0;
}