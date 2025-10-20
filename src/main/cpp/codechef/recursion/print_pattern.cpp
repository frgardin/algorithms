#include <iostream>
using namespace std;

void print_line(int n) {
    if (n<=0) return;
    if (n == 1) {
        cout << '*';
        return;
    }
    cout << '*';
    print_line(n-1);
}


void print_pattern(int n) {
    //Write your code here
    if (n<=0) return;
    print_line(n);
    cout << '\n';
    print_pattern(n-1);
} 


int main() {
    int n;
    cin >> n;
    print_pattern(n);
    return 0;
}
