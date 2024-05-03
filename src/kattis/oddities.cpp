#include<bits/stdc++.h>

using namespace std;

int main() {
    int tc;
    scanf("%d", &tc);
    
    while (tc--) {
        int n;
        scanf("%d", &n);
        if (n % 2)     printf("%d is odd\n", n);
        else           printf("%d is even\n", n);
    }
    return 0;
}
