class Solution {
public:
    bool isPalindrome(int x) {
        string s = to_string(x);
        int size = s.size() / 2;
        for (int i = 0; i < size; i++){
            if (s.at(i) != s.at(s.size() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
};