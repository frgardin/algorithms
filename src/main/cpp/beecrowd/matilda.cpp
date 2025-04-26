#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n, m, d;
    scanf("%d %d %d", &n, &m, &d);
    vector<vector<int>> adj(n + 1);
    int ma = m;
    while (ma--) {
        int u, v;
        scanf("%d %d", &u, &v);
        adj[u].push_back(v);
        adj[v].push_back(u);
    }
    int best = 0;
    for (int i = 1; i <= n; i++) {
        vector<bool> visited(n + 1 , false);
        queue<pair<int, int>> qii;
        qii.push({i, 0});
        while (!qii.empty()) {
            int v = qii.front().first;
            if (visited[v]) {
                qii.pop();
                continue;
            }
            for (auto j : adj[v]) {
                qii.push({j, qii.front().second + 1});
            }
            best = max(qii.front().second, best);
            visited[v] = true;
            qii.pop();
        }
    }
    int final = 2*d  + 1 - best;
    printf("%d %d\n", final, final);
}