#include <bits/stdc++.h>

using namespace std;

typedef long long ll;

int abso(int a) 
{
    return a > 0 ? a : -a;
}

int main () 
{
    int n;
    while(scanf("%d", &n) != EOF) 
    {
        int m;
        int nb = n;
        vector<int>v;
        vector<int> vd;
        int counter = 0;
        bool fail = true;  
        while(n--)
        {
            scanf("%d", &m);
            v.push_back(m);
            if (v.size() > 1)
            {
                vd.push_back(abso(v.at(counter) - v.at(counter - 1)));
                if ((vd.size() > 1) && (vd.at(counter - 2) - vd.at(counter - 1) < nb)) 
                {                
                    fail = fail && false;
                }
            }
            counter++;
        }
        if (!fail)
        {
            printf("Not jolly\n");
        }
        else 
        {
            printf("Jolly\n");  
        }
    }
    return 0;
}
