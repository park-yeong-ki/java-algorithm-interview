public class P15_1 {
    public ListNode reverseList(ListNode head) {
        ListNode rev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = rev;
            rev = head;
            head = next;
        }
        return rev;
    }
}
