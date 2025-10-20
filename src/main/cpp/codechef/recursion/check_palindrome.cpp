#include <iostream>
using namespace std;

string checkPalindrome(string s, int n) {
    //Write your code here
    if (n <= 1) return "Yes";
    if (s.at(n-1) != s.at(s.size()-n)) return "No";
    return checkPalindrome(s, n-1);
}

int main() {
    string s;
    cin >> s;
    cout << checkPalindrome(s, s.size()) << endl;
    return 0;
}
