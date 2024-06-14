public class P17_1 {
    public ListNode swapPairs(ListNode head) {
        ListNode root = new ListNode();
        root.next = head;

        ListNode prev = root;
        ListNode cur, temp;
        while(prev.next != null && prev.next.next != null){
            cur = prev.next.next;
            temp = prev.next;
            temp.next = cur.next;
            cur.next = temp;
            prev.next = cur;
            prev = temp;
        }

        return root.next;
    }
}
