import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int point = 0;

        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(point++));
            }
            set.add(s.charAt(i));
            ans = Math.max(ans, i - point + 1);
        }

        return ans;
    }
}