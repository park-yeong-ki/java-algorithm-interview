import java.util.ArrayDeque;
import java.util.Deque;

class P22_1 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];

        Deque<Integer> stack = new ArrayDeque<>();
        int cur;
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                cur = stack.pop();
                ans[cur] = i - cur;
            }
            stack.push(i);
        }

        return ans;
    }
}