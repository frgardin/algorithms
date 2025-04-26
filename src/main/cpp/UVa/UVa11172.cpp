#include<bits/stdc++.h>

using namespace std;

int main() {
	int tc; scanf("%d", &tc);
	while (tc--) {
		int a, b;
		scanf("%d %d", &a, &b);
		if (a > b)	printf(">\n");
		else if (a < b)	printf("<\n");
		else		printf("=\n");	
	}
	return 0;
}
