public class P19_1 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode root = new ListNode(0);
        root.next = head;

        ListNode start = root;
        for(int i=0; i<left-1; i++){
            start = start.next;
        }
        ListNode end = start.next;

        ListNode tmp1;
        ListNode tmp2;
        for(int i=0; i<right-left; i++){
            tmp1 = start.next;
            tmp2 = end.next;
            end.next = tmp2.next;
            tmp2.next = tmp1;
            start.next = tmp2;
        }

        return root.next;
    }
}
