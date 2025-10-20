#include <bits/stdc++.h>
using namespace std;

typedef vector<long long> vll;
typedef long long ll;

int main()
{
    // your code goes here
    int t;
    cin >> t;
    auto ans = [](ll n)
    {
        ll l = 0, r = n;
        while (l <= r)
        {
            ll mid = (l + r) / 2;
            ll coins = (mid * mid + mid) / 2;
            if (coins > n)
            {
                r = mid - 1;
            }
            else
            {
                l = mid + 1;
            }
        }
        return l - 1;
    };
    while (t--)
    {
        ll n;
        cin >> n;
        cout << ans(n) << endl;
    }
}
