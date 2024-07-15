import java.util.PriorityQueue;

class P29_1 {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (long s : scoville) {
            pq.add(s);
        }

        int answer = 0;
        while (pq.size() >= 2 && pq.peek() < K) {
            pq.add(pq.poll() + pq.poll() * 2);
            answer++;
        }

        return pq.peek() < K ? -1 : answer;
    }
}