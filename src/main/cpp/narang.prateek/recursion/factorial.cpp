//
// Created by gardi on 4/26/2025.
//

#include <iostream>;
using namespace std;

int factorial(const int n) {
    if (!n) return 1;
    return n * factorial(n - 1);
}

int main() {
    int n;
    cin >> n;

    cout << factorial(n);
    return 0;
}
