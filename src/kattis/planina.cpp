#include<bits/stdc++.h>

using namespace std;

int main() {
	int n;
	cin >> n;
	int a = 2;
	while (n--) {
		a+= a - 1;
	}
	cout << a*a;
	return 0;
}
