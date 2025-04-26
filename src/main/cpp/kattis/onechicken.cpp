#include<bits/stdc++.h>

using namespace std;

int main() {
	char s1[100] = "Dr. Chaz will have %d pieces of chicken left over!";
	char s2[100] = "Dr. Chaz needs %d more pieces of chicken!";
	char s11[100] = "Dr. Chaz will have %d piece of chicken left over!";
	char s22[100] = "Dr. Chaz needs %d more piece of chicken!";
	int n, m; scanf("%d %d", &n, &m);
	n > m ? n - m - 1 ? printf(s2, n - m) : printf(s22, 1) :
	m - n - 1 ? printf(s1, m - n) : printf(s11, 1);
	return 0;
}
