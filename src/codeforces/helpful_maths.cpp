#include<bits/stdc++.h>

using namespace std;

int main() {

	string s;

	cin >> s;

	for (int i = 0; i < s.size(); i +=2) {
		char k = s[i];			
		int j = i - 2;

		while (j >= 0 && int(s[j]) > int(k)) {
			s[j+2] = s[j];
			j -= 2;
		}
		s[j+2] = k;
	}

	cout << s;
	return 0;
}
