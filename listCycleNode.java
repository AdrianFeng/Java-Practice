public class listCycleNode {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        boolean check=false;
        while(fast!=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
            if (fast == slow){
                check=true;
                break;
            }
        }
        if (!check){
            return null;
        }
        slow = head;
        while (true){
            if (slow ==fast){
                return fast;
            }
            fast=fast.next;
            slow=slow.next;
        }
    }
}