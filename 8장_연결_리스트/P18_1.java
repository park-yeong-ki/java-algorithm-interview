public class P18_1 {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode root = new ListNode(0);
        ListNode mid = new ListNode(0);
        root.next = odd;
        mid.next = even;

        int idx = 1;
        while(head != null){
            if(idx % 2 == 1){
                odd.next = head;
                odd = odd.next;
            }else{
                even.next = head;
                even = even.next;
            }
            head = head.next;
            idx++;
        }
        even.next = null;
        odd.next = mid.next.next;

        return root.next.next;
    }
}
