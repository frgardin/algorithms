#include <bits/stdc++.h>
using namespace std;

int main()
{
    // Write your code here
    int n, k;
    cin >> n >> k;
    vector<int> v(n);
    for (int &x : v)
        cin >> x;
    int maxnum = 0;
    for (int x : v)
        maxnum = max(maxnum, x);
    sort(v.begin(), v.end());
    auto check = [](vector<int> v, int n, int d, int k)
    {
        int prev = v[0];
        k--;
        for (int i = 1; i < n; i++)
        {
            if (v[i] - prev >= d)
            {
                k--;
                prev = v[i];
            }
            if (k == 0)
                return true;
        }
        return false;
    };
    int start = 0, end = maxnum;
    while (abs(start - end) > 1)
    {
        int median = (start + end) / 2;
        if (check(v, n, median, k))
        {
            start = median;
        }
        else
        {
            end = median;
        }
    }
    cout << start << endl;
    return 0;
}