class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        char c;

        outerloop:
        for (int i = 0;;i++) {
            if (i < strs[0].length()) { c = strs[0].charAt(i); }
            else { break; }
            
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() > 0 && strs[j].length() > i) {
                    if (strs[j].charAt(i) != c) { break outerloop; }
                } else { break outerloop; }
            }  

            res.append(c);
        }    

        return res.toString();
    }
}