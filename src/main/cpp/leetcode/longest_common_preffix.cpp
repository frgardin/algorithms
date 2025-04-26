class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string s = "";
        bool b = true;
        for (int i = 0; i < strs.at(0).size(); i++) {
            b = b && true;
            for (int j = 1; j < strs.size(); j++) {
                if (strs.at(j).size() > i){
                    b = b && strs.at(0).at(i) == strs.at(j).at(i);
                } else {
                    b = false;
                }
            }
            if (!b){
                break;
            }
            s += strs.at(0).at(i);
        }
        return s;
    }
};