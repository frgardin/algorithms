#include <bits/stdc++.h>
using namespace std;

bool check(int arr[], int d, int n, int c)
{
    int prev = arr[0];c--;
    for(int i=1;i<n;i++) {
        if (arr[i]-prev >= d) {
            c--;
            prev=arr[i];
        }
        if (c==0) return true;
    }
    return false;
}

void test_case(){
    int n, c;
    cin>>n>>c;
    int arr[n];
    int maxnum = INT_MIN;
    for(int i=0; i<n; i++)
    {
        cin>>arr[i];
        maxnum = max(maxnum, arr[i]);
    }
    sort(arr, arr+n);
    int start = 0, end = maxnum;
    while(abs(end-start)>1)
    {
        int median = (start+end)/2;
        if(check(arr, median, n, c))
        {
            start = median;
        }
        else 
        {
            end = median;
        }
    }
    cout<<start<<"\n";
}
 
 
 
int main()
{
    int T = 1;
    while(T--) test_case();
}