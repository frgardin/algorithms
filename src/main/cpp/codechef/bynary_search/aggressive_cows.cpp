#include <bits/stdc++.h>
using namespace std;

bool check(int arr[], int d, int n, int c)
{
    int prev = arr[0];
    c--;
    for (int i = 1; i < n; i++)
    {
        if (arr[i] - prev >= d)
        {
            c--;
            prev = arr[i];
        }
        if (c == 0)
            return true;
    }
    return false;
}

void test_case()
{
    int n, c;
    cin >> n >> c;
    int arr[n];
    int maxnum = INT_MIN;
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    sort(arr, arr + n);
    // Write your code here
    int maxnum = 0;
    for (int x : arr)
        maxnum = max(x, maxnum);

    int start, end;
    for (start = 0, end = maxnum;
         abs(start - end) > 1;
         (check(arr, (start + end) / 2, n, c) ? start = (start + end) / 2 : end = (start + end) / 2)
    );

    cout << start << endl;
}

int main()
{
    int T = 1;
    while (T--)
        test_case();
}