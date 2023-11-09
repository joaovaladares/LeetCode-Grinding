class Solution {
public:
    bool isPalindrome(string s) {
        string aux;
        for (char c : s) {
            if (isalnum(c)) { aux += tolower(c); }
        }

        int r = aux.length() - 1;

        for (int l = 0; l <= r; l++) {
            if (tolower(aux[l]) != tolower(aux[r])) { return false; }
            r--;
        }
        
        return true;

    }
};
