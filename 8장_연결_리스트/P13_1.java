public class P13_1 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode cur = head;
        while(cur != null){
            list.add(cur.val);
            cur = cur.next;
        }

        int left = 0;
        int right = list.size()-1;
        while(left < right){
            if(list.get(left) != list.get(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
