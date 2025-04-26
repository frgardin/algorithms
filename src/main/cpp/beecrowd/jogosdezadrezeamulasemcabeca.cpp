#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n, m, k, l;
    scanf("%d%d", &n, &m);
    scanf("%d%d", &k, &l);
    vector<pair<int, int>> vii;
    char vvc[n + 1][m + 1];
    int counter = 0;
    int na = n;
    string s;
    cin.ignore();
    while (na--)
    {
        char c;
        int counter_2 = 0;
        int a = m;
        getline(cin, s);
        while (a--)
        {
            vvc[counter][counter_2] = s.at(counter_2);
            if (s.at(counter_2) == '.')
                vii.push_back({counter, counter_2});
            counter_2++;
        }
        counter++;
    }
    int peoesQueSeraoMortos = 0;
    pair<int, int> p = {vii[0].first + 1, vii[0].second + 1};
    for (int i = 0; i < vii.size(); i++)
    {
        pair<int, int> posAtual = vii[i];
        vector<pair<int, int>> vPos(10);
        int k_dec = k - 1;
        int l_dec = l - 1;
        pair<int, int> pos1 = {posAtual.first - k_dec, posAtual.second - l_dec};
        pair<int, int> pos2 = {posAtual.first - k_dec, posAtual.second + l_dec};
        pair<int, int> pos3 = {posAtual.first + k_dec, posAtual.second - l_dec};
        pair<int, int> pos4 = {posAtual.first + k_dec, posAtual.second + l_dec};
        pair<int, int> pos5 = {posAtual.first - l_dec, posAtual.second - k_dec};
        pair<int, int> pos6 = {posAtual.first - l_dec, posAtual.second + k_dec};
        pair<int, int> pos7 = {posAtual.first + l_dec, posAtual.second - k_dec};
        pair<int, int> pos8 = {posAtual.first + l_dec, posAtual.second + k_dec};
        vPos.push_back(pos1);
        vPos.push_back(pos2);
        vPos.push_back(pos3);
        vPos.push_back(pos4);
        vPos.push_back(pos5);
        vPos.push_back(pos6);
        vPos.push_back(pos7);
        vPos.push_back(pos8);
        int peoesASeremMortos = 0;
        for (auto pos : vPos)
        {
            if (pos.first >= 0 && pos.first < n && pos.second >= 0 && pos.second < m)
            {
                if (vvc[pos.first][pos.second] == '*')
                {
                    peoesASeremMortos++;
                }
            }
        }
        if (peoesASeremMortos > peoesQueSeraoMortos) {
            peoesQueSeraoMortos = peoesASeremMortos;
            p = {posAtual.first + 1, posAtual.second + 1};
        }
    }
    printf("%d %d\n", p.first, p.second);
}