import java.util.ArrayDeque;
import java.util.Deque;

class P21_1 {
    public String removeDuplicateLetters(String s) {
        int[] count = new int['z' - 'a' + 1];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        Deque<Character> stack = new ArrayDeque<>();
        char cur;
        boolean[] isSelected = new boolean['z' - 'a' + 1];
        for (int i = 0; i < s.length(); i++) {
            cur = s.charAt(i);
            count[cur - 'a']--;
            if (isSelected[cur - 'a']) continue;

            while (!stack.isEmpty() && stack.peek() > cur && count[stack.peek() - 'a'] > 0) {
                isSelected[stack.pop() - 'a'] = false;
            }

            stack.push(cur);
            isSelected[cur - 'a'] = true;
        }

        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        return ans.reverse().toString();
    }
}