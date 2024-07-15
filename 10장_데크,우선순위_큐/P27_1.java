import java.util.PriorityQueue;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class P27_1 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ListNode list;
        for (int i = 0; i < lists.length; i++) {
            list = lists[i];
            while (list != null) {
                pq.add(list.val);
                list = list.next;
            }
        }

        ListNode ans = new ListNode();
        ListNode head = ans;
        while (!pq.isEmpty()) {
            ListNode node = new ListNode(pq.poll());
            ans.next = node;
            ans = ans.next;
        }

        return head.next;
    }
}