#include <bits/stdc++.h>

using namespace std;

string S1 = "Player 1 wins.\n";
string S2 = "Player 2 wins.\n";
string D = "Tie.\n";
int MAX_SCORE = 1000;
int TIE_SCORE = 100;

int score(int s, int r)
{
    return s + r == 3 ? MAX_SCORE : (s == r ? TIE_SCORE : (s < r ? r * 10 + s : s * 10 + r));
}

string getAnswer(int s0, int s1, int r0, int r1, int p1, int p2) 
{
    return p1 > p2 ? S1 : (p1 < p2 ? S2 : (p1 == TIE_SCORE ? (s0 > r0 ? S1 : (s0 < r0 ? S2 : D)) : D));
}

void game(int s0, int s1, int r0, int r1)
{
    int p1 = score(s0, s1);
    int p2 = score(r0, r1);
    printf(getAnswer(s0, s1, r0, r1, p1, p2).c_str());
}

int main()
{
    int s0, s1, r0, r1;
    while (scanf("%d %d %d %d", &s0, &s1, &r0, &r1), (s0 || s1 || r0 || r1))
    {
        game(s0, s1, r0, r1);
    }
    return 0;
}