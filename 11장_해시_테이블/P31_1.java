import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (char j : jewels.toCharArray()) {
            set.add(j);
        }

        int ans = 0;
        for (char s : stones.toCharArray()) {
            if (set.contains(s))
                ans++;
        }

        return ans;
    }
}