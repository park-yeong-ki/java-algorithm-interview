import java.util.ArrayDeque;
import java.util.Deque;

class P20_1 {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char ch, pair;
        for(int i=0; i<s.length(); i++){
            ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else {
                if(stack.isEmpty()) return false;
                pair = stack.pop();
                if(ch == ')' && pair != '(' ||
                        ch == '}' && pair != '{' ||
                        ch == ']' && pair != '['){
                    return false;
                }
            }
        }

        if(!stack.isEmpty()) return false;

        return true;
    }
}