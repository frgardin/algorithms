#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

void collatz_conjecture(ll n, int &count) {
    if (n ==1) {
        return;
    }
    count++;
    if (n %2 == 0) {
        collatz_conjecture(n/2, count);
    } else {
        collatz_conjecture(n*3+1, count);
    }
}

int main() {
	// your code goes here
    ll n; cin >> n;
    int count=0;
    collatz_conjecture(n, count);
    cout << count;
}
