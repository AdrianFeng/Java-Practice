public class listCycle {
    public boolean hasCycle(ListNode head) {
        ListNode first = head; 
        ListNode second = head;
        int check =0;
        while (first!=null && second != null && second.next!= null){
            if (first == second ){
                if (check ==0){
                    check++;
                }
                else
                return true;
            }
            first= first.next;
            second= second.next.next;
        }
        return false;
    }
}