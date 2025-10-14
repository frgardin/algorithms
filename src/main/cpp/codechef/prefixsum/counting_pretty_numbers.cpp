#include <bits/stdc++.h>
using namespace std;

int main()
{
    // your code goes here
    int t;

    cin >> t;

    while (t--)
    {
        int l, r;

        cin >> l >> r;

        if (l == r)
        {
            if (l % 10 == 2 || l % 10 == 3 || l % 10 == 9)
            {
                cout << 1 << endl;
                continue;
            }
            cout << 0 << endl;
            continue;
        }

        int ln, rn, dn;

        ln = l % 10 > 0 ? ((l / 10) + 1) * 10 : l;
        rn = r % 10 > 0 ? ((r / 10) - 1) * 10 : r;
        dn = rn - ln;

        int ans = 0;

        ans += 3 * (dn / 10);

        for (int i = l; i <= ln; i++)
        {
            if (i % 10 == 2 || i % 10 == 3 || i % 10 == 9)
                ans++;
        }

        for (int i = rn; i <= r; i++)
        {
            if (i % 10 == 2 || i % 10 == 3 || i % 10 == 9)
                ans++;
        }

        cout << ans << endl;
    }
}
