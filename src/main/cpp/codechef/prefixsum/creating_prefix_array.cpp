#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int n;
    cin >> n;

    int a[n];

    for (int i =0;i<n;i++) cin >> a[i];

    ostringstream oss;

    oss << a[0];
    oss << ' ';

    for (int i=1;i<n;i++) {
        oss << a[i]+a[i-1] << ' ';
        a[i]=a[i]+a[i-1];
    }

    cout << oss.str();
}
