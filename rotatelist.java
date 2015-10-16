class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
}
class Solution{
    static ListNode rotateRight(ListNode head, int k) {
        ListNode temp =head;
        ListNode temp2;
        ListNode finalone =null;
        int length =0;
        int iteration;
        while(temp!=null){
            length++;
		if (temp.next==null){
		    finalone=temp;
		}
            temp=temp.next;
        }
	int actualrotate=k%length;
	if ( actualrotate==0 || head==null){
            return head;
        }
        temp=head;
        iteration=length-1-actualrotate;
        while(iteration!=0){
            temp=temp.next;
            iteration--;
        }
        temp2=temp.next;
        temp.next=null;
        finalone.next=head;
        return temp2;
    }
}
class rotatelist{
    public static void main(String[] args){
	ListNode head= new  ListNode(1);
	head.next = new  ListNode(2);
	head.next.next =new  ListNode(3);
	head.next.next.next =new  ListNode(4);
	head.next.next.next.next =new  ListNode(5);
	//for (int i=0;i<10;i++){
	ListNode newone =  Solution.rotateRight(head, 5);
	while (newone!=null){
	    System.out.print(newone.val+" ");
	    newone=newone.next;
	}
	System.out.println();
	//}
    }
}