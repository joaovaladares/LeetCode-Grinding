class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        char[] cs = s.toCharArray();

        int l = 0;
        int r = cs.length - 1;

        if (s.length() == 1) { return true; }

        while (l <= r) {
            if (cs[l] == cs[r]) {
                l++;
                r--;
            } else {
                return false;
            }
        } 

        return (l >= r);

    }
}