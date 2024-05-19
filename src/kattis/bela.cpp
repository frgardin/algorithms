#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    char b;
    scanf("%d %c", &n, &b);
    unordered_map<char, pair<int, int>> mcp
    {
        {'A', {11, 11}},
        {'K', {4, 4}},
        {'Q', {3, 3}},
        {'J', {20, 2}},
        {'T', {10, 10}},
        {'9', {14, 0}},
        {'8', {0, 0}},
        {'7', {0, 0}}
    };
    int tc = 4 * n;
    int acc = 0;
    cin.ignore();
    while (tc--)
    {
        char c, d;
        string s;
        getline(cin, s);
        c = s[0];
        d = s[1];
        if (d == b)
            acc += mcp[c].first;
        else
            acc += mcp[c].second;
    }
    printf("%d", acc);
}
