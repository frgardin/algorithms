#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n, m, k;
    scanf("%d %d %d", &n, &m, &k);
    vector<vector<pair<int, int> > > adj(n + 1);
    priority_queue< pair<int, int>, vector< pair<int, int> >, greater< pair<int, int> > > pi;
    while(m--) {
        int u, v, c;
        scanf("%d %d %d", &u, &v, &c);
        adj[u].push_back({v, c});
        adj[v].push_back({u, c});
    }
    int c = 0;
    int t = 0;
    pi.push({0, 1});
    vector<bool> visitados(n + 1, false);
    while(c < k) {
        int v = pi.top().second;
        if (visitados[v])   
        {
            pi.pop();
            continue;
        }
        int ti = pi.top().first;
        pi.pop();
        for(auto i : adj[v]) {
            pi.push({i.second, i.first});
        }
        visitados[v] = true;
        t = max(t, ti);
        c++;
    }
    cout << t;
}
