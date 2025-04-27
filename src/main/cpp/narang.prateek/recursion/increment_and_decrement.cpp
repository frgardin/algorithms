#include <iostream>
using namespace std;


void dec(const int n) {
    if (n == 0) return;
    cout << n << endl;
    dec(n - 1);
}

void inc(const int n) {
    if (n == 0) return;
    inc(n - 1);
    cout << n << endl;
}

int main() {
    int n;
    cin >> n;
    cout << "dec"<< endl ;
    dec(n);
    cout << "inc" << endl;
    inc(n);
    return 0;
}