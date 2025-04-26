#include<bits/stdc++.h>

using namespace std;

int main() {
	char s[100];
	map<string, string> m{
		{"HELLO", "ENGLISH"},
		{"HOLA", "SPANISH"},
		{"HALLO", "GERMAN"},
		{"BONJOUR", "FRENCH"},
		{"CIAO", "ITALIAN"},
		{"ZDRAVSTVUJTE", "RUSSIAN"}
	};
	int n = 1;
	string r;
	while (scanf("%100s", s), s[0] != '#') {
		if (!m.count(s))	r = "UNKNOWN";
		else			r = m[s];
		printf("Case %d: %s\n", n, r.c_str());
		n++;
	}
	return 0;
}
