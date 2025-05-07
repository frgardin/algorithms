#include<bits/stdc++.h>

using namespace std;

map<int, string> m{
    {0, "zero"},
    {1, "one"},
    {2, "two"},
    {3, "three"},
    {4, "four"},
    {5, "five"},
    {6, "six"},
    {7, "seven"},
    {8, "eight"},
    {9, "nine"},
};


void print_number(int n) {
    if (n / 10 == 0) {
        cout << m[n] << ' ';
        return;
    }
    print_number(n / 10);
    cout << m[n%10] << ' ';
}

int main() {
    print_number(2021);
}
