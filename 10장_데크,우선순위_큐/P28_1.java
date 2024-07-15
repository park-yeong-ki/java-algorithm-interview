import java.util.PriorityQueue;

class P28_1 {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> {
            int dist1 = (int) (Math.pow(o1[0], 2) + Math.pow(o1[1], 2));
            int dist2 = (int) (Math.pow(o2[0], 2) + Math.pow(o2[1], 2));
            return Integer.compare(dist1, dist2);
        });

        for (int[] p : points) {
            pq.add(p);
        }

        int[][] ans = new int[k][];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }

        return ans;
    }
}