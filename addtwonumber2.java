class Solution2{
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carryout=0;
	int sum;
	int sum1;
	int sum2;
	ListNode newone = new ListNode(0);
	ListNode current = newone;
	while( true){
		if (l1!= null){
		    sum1 = l1.val;
		}
		else{
		    sum1 =0;
		}
		if (l2!=null){
		    sum2=l2.val;
		}
		else{
		    sum2=0;
		}
		sum=carryout+sum1+sum2;		
		current.val=sum%10;
		carryout=(sum-sum%10)/10;
		if (l1!= null){
                    l1=l1.next;}
                if (l2!= null){
                    l2=l2.next;
                }
		if (l1 == null && l2 == null && carryout==0){
		    break;
		}
		else{
		    current.next = new ListNode(0);
		    current=current.next;
		}
	    }
	return newone;
    }
}