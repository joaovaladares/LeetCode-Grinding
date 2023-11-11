class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        int ans = 0;

        char[] arr = s.toCharArray();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == arr.length - 1) { ans += map.get(arr[i]); }
            else {
                if (map.get(arr[i]) < map.get(arr[i + 1])) { ans -= map.get(arr[i]); }
                else { ans += map.get(arr[i]); } 
            }
        }

        return ans;
    }
}