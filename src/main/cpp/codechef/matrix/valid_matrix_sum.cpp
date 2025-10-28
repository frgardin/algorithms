#include <iostream>

using namespace std;

int main() {
    // Write your code here
    int n, m; cin >> n >> m;
    if ((n*m)%2 != 0) {
        cout << -1;
        return 0;
    }
    for (int i=0;i<n;i++) {
        for (int j=0;j<m;j++) {
            cout << "1 ";
        }
        cout << endl;
    }
    return 0;
}