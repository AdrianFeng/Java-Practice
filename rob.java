class Solution{
    static int ROB(int[] nums){
	if (nums.length==0){
	    return 0;
	}
	if (nums.length == 1){
	    return nums[0];
	}
	int evencount=0;
	int oddcount=0;
	for (int i =0; i< nums.length;i++){
	    if (i%2==0){
		evencount+=nums[i];
	    }
	    else{
		oddcount+=nums[i];
	    }
	}
	if(evencount>oddcount){
	    return evencount;
	}
	else{
	    return oddcount;
	}
    } 
}
class rob{
    public static void main(String[] args){
	int[] newone = {1,2,3,4,55656,78,9,89,0,100};
	System.out.println(Solution.ROB(newone));
    }
}