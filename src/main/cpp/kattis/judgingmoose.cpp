#include<bits/stdc++.h>

using namespace std;

int main() {
	int l, r;
	cin >> l >> r;

	if (!l && !r) {
		cout << "Not a moose";
		return 0;
	}
	if (l > r) {
		cout << "Odd " << 2 * l;
		return 0;
	}
	if (l < r) {
		cout << "Odd " << 2 * r;
		return 0;
	}
	cout << "Even " << (l + r);
	return 0;
}
