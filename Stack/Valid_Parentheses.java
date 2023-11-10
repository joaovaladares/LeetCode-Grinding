class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();

        char[] arr = s.toCharArray();
        
        for (char c : arr) {
            if ((c == '(') || (c == '{') || (c == '[')) { st.push(c); } 
            else {
                if (st.empty()) { return false; }
                if (!st.empty()) {
                    if ((c == ')') && (st.peek() == '(')) { st.pop(); }
                    else if ((c == ']') && (st.peek() == '[')) { st.pop(); }
                    else if ((c == '}') && (st.peek() == '{')) { st.pop(); }
                    else { return false; }
                }
            }
        }

        return st.empty();
        
    }
}