#include <bits/stdc++.h>

using namespace std;
typedef long long ll;

ll bynary_search(vector<ll> v, int n, ll k)
{
    int l = 0, r = n - 1;
    while (l <= r)
    {
        int m = (l + r) / 2;
        if (v[m] == k)
            return m;
        if (v[m] > k)
            r = m - 1;
        else
            l = m + 1;
    }

    return -1;
}

int main()
{
    int n;
    ll k;
    cin >> n >> k;
    vector<ll> v(n);
    for (ll &x : v)
        cin >> x;
    cout << bynary_search(v, n, k) << endl;
    return 0;
}