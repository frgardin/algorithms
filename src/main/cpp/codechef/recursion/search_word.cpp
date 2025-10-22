#include <bits/stdc++.h>
using namespace std;

typedef vector<vector<char>> vcc;
typedef vector<vector<bool>> vbb;
typedef vector<char> vc;
typedef vector<bool> vb;

int dir[4][2] = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

bool dfs(vcc board, int i, int j, string word, int wordIndex, vbb visited) {
    if (wordIndex >= word.size()) {
        return true;
    }
    visited[i][j]=true;
    for (auto d : dir) {
        int ni = i+d[0];
        int nj = j+d[0];
        
        if (
            ni >= 0 && ni < board.size() &&
            nj >= 0 && nj < board.size() &&
            !visited[ni][nj] &&
            board[ni][nj] == word.at(wordIndex) &&
            dfs(board, ni, nj, word, wordIndex+1, visited)
        ) {
            return true;
        }
    }
    return false;
}


bool wordSearch(vector<vector<char>>& board, string word) {
    // Write your code here
    for (int i =0;i<board.size();i++) {
        for (int j =0;j<board.size();j++) {
            if (board[i][j] == word.at(0)) {
                vb visitedLine(board.size(), false);
                vbb visited(board.size(), visitedLine);
                if (dfs(board, i, j, word, 1, visited)) {
                    return true;
                }
            }
        }
    }
    return false;
}

int main() {
    int R, C;
    cin >> R >> C;
    vector<vector<char>> board(R, vector<char>(C));
    for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j++) {
            cin >> board[i][j];
        }
    }
    string word;
    cin >> word;
    cout << (wordSearch(board, word) ? "true" : "false") << endl;
    return 0;
}