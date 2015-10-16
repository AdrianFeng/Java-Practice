
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ListNode {                                                      

    int val;    
    ListNode next;                                                
    ListNode(int x) { val = x; } 
}   
class Solution {
    public static  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int number1=returnvalue(l1);
	System.out.println(number1);
        int number2=returnvalue(l2);
	System.out.println(number2);
        int sum = number1+number2;
        ListNode current= new ListNode(sum%10);
        sum=(sum-sum%10)/10;
        ListNode newone= current;
        while(sum !=0){
            current.next= new ListNode(sum%10);
            sum=(sum-sum%10)/10;
            current=current.next;
        }
        return newone;
    }
    public static int returnvalue(ListNode L){
        if ( L.next == null){
            return L.val;
        }
        else{
            return (10*returnvalue(L.next) + L.val);
        }
    }
}
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


 class addtwonumber{
    public static void main (String[] args){
	ListNode L1= new ListNode(1);
	ListNode temp = L1;
	for (int index= 0; index<10;index++){
	    temp.next= new ListNode(9);
	    temp=temp.next;
	}
	ListNode L2 = new ListNode(9);
	ListNode newone = Solution2.addTwoNumbers(L1, L2);
	while (newone != null){
	    System.out.println(newone.val);
	    newone=newone.next;
	}
    }
	
}