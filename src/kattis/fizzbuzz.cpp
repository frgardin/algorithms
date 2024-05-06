#include<bits/stdc++.h>

using namespace std;

int main() {
    int x, y, n, m = 1; scanf("%d %d %d", &x, &y, &n);
    while (n--) {
        if (!(m % x) && !(m % y))   printf("FizzBuzz\n");
        else if (!(m % x))          printf("Fizz\n");
        else if (!(m % y))          printf("Buzz\n");
        else                        printf("%d\n", m);
        m++;
    }
    return 0;
}