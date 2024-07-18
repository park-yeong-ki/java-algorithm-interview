import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }


        String answer = "";
        for (String p : map.keySet()) {
            if (map.get(p) == 1){
                answer = p;
                break;
            }
        }

        return answer;
    }
}