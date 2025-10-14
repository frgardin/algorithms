#include <bits/stdc++.h>
using namespace std;

int main()
{
    // your code goes here
    int n, k;

    cin >> n >> k;

    int v[n];

    for (int i = 0; i < n; i++)
        cin >> v[i];

    int pre[n][n];

    for (int i = 0; i < n; i++)
    {
        pre[i][i] = v[i];
    }

    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            pre[i][j] = v[j] + pre[i][j - 1];
        }
    }

    int ans = 0;

    for (int i = 0; i < n; i++)
    {
        for (int j = i; j < n; j++)
        {
            if (pre[i][j] == k)
                ans++;
        }
    }

    cout << ans;
}
