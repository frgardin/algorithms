#include<bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin >> n;
    double a, b, acc = 0;
    while (n--) {
        scanf("%lf %lf", &a, &b);
        acc += a * b;
    }
    printf("%.3f", acc);
    return 0;
}
