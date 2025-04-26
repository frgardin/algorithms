#include<bits/stdc++.h>

using namespace std;

int main() {
	int g, s, c; scanf("%d %d %d", &g, &s, &c);
	int t = g*3 + s*2 + c*1;
	string s1;
	string s2;
	if (t >= 8) 	 {s1 = "Province"; s2 = "Gold";}
	else if (t >= 6) {s1 = "Duchy"; s2 = "Gold";}
	else if (t >= 5) {s1 = "Duchy"; s2 = "Silver";}
	else if (t >= 3) {s1 = "Estate"; s2 = "Silver";}
	else if (t >= 2) {s1 = "Estate"; s2 = "Copper";}
	else	         {cout << "Copper";return 0;}
	
	cout << s1 << " or " << s2;
	return 0;
}
     
