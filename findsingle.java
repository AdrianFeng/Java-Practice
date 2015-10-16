import java.util.*;
class Solution {
    static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int temp=0;
        if (nums.length==1){
            return nums[0];
        }
        for(int i=0 ; i< nums.length-1; i+=2){
            if (nums[i]!=nums[i+1]){
                temp= nums[i];
		break;
            }
        }
        return temp;
    }
}

class findsingle{
    public static void main(String[] args){
        int[] nums = {1,3,1,-1,3};
	Arrays.sort(nums);
	for (int i=0;i<nums.length;i++){
	    System.out.print(nums[i]+" ");
	}
	System.out.println(Solution.singleNumber(nums));
	String a ="nihao";
	StringBuilder b = new StringBuilder(a);
	System.out.println(b);
    }
}