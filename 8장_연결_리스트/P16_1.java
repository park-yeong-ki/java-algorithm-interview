public class P16_1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sb = new StringBuilder();
        while(l1 != null){
            sb.append(l1.val);
            l1 = l1.next;
        }
        BigInteger num1 = new BigInteger(sb.reverse().toString());
        sb.setLength(0);

        while(l2 != null){
            sb.append(l2.val);
            l2 = l2.next;
        }
        BigInteger num2 = new BigInteger(sb.reverse().toString());
        sb.setLength(0);

        String sum = String.valueOf(num1.add(num2));
        ListNode prev = null;
        for(int i=0; i<sum.length(); i++){
            ListNode cur = new ListNode(sum.charAt(i) - '0');
            cur.next = prev;
            prev = cur;
        }

        return prev;
    }
}
