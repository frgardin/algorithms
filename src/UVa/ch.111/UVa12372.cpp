#include<bits/stdc++.h>

using namespace std;

int main() {
	int tc; scanf("%d", &tc);
	int n = 1;
	while (tc--) {
		int l, w, h;
		string s;
		scanf("%d %d %d", &l, &w, &h);
		if (l < 21 && w < 21 && h < 21)	s = "good";
		else				s = "bad";
		printf("Case %d: %s\n", n, s.c_str());
		n++;
	}
	return 0;
}
