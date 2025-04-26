/**
 * 
 * 
 * 
 * 
 * Let (x, y) be the coordinates of a student's house on a 2D plane. There are 2N students and we want
 * to pair them into N groups. Let di be the distance between the houses of 2 students in group i. Form
 * N groups such that cost = sum(i=1, N, di) is minimized. Output the minimum cost. Constraints: 1 <= N <= 8 and
 * 0 <=x, y<= 1000.
 * 
 * Sample N= 2, {1,1}, {8,6}, {6,8} and {1,3}
 * 
 * 
 * cost = 4.83
 * 
 * 
 * 
 * **/

#include<bits/stdc++.h>


using namespace std;


static double get_distance(unordered_map<string, int> m1, unordered_map<string, int> m2) {
    return sqrt((m1["x"] - m2["x"])^2 + (m1["y"] - m2["y"])^2);
}

int main () {
    int N;
    cin >> N;

    
    vector<unordered_map<string, int>> v;
    unordered_map<string, int> m;
    for (int i= 0; i < 2 * N; i++) {
        int x,y;
        cin >> x >> y;
        m["x"] = x;
        m["y"] = y;
        v.push_back(m);
        for (int j = 0; j < v.size() - 1; j++) {
                       
        }
    }

    return 0;
}