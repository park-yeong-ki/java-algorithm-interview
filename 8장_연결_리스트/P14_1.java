public class P14_1 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((n1, n2) -> n2.val - n1.val);
        while(list1 != null){
            pq.add(list1);
            list1 = list1.next;
        }
        while(list2 != null){
            pq.add(list2);
            list2 = list2.next;
        }

        ListNode ans = pq.poll();
        if(ans != null) ans.next = null;
        while(!pq.isEmpty()){
            ListNode next =  pq.poll();
            next.next = ans;
            ans = next;
        }

        return ans;
    }
}
