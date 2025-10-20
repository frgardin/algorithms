#include <iostream>
using namespace std;

string binary(int n) {
    //Write your code here
    if (n == 0) return "";
    return binary(n/2)+to_string(n%2);
}

int main() {
    int n;
    cin >> n;
    cout << binary(n) << endl;
    return 0;
}
