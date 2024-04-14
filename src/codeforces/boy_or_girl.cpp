#include<bits/stdc++.h>

using namespace std;

int main() {
	string s;
	cin >> s;
	unordered_map<char, int> m;
	int sum = 0;
	 
	for (char c : s) {
		if (!m.count(c)){
			m[c] = 1;
			sum++;
		} 
			
	}
	if (sum % 2)	cout << "IGNORE HIM!";
	else 		cout << "CHAT WITH HER!";
}
