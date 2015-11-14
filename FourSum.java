import java.util.*;
class Solution {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        // sort 
        Arrays.sort(nums);
        //boolean[] check = new boolean[nums.length];
        int start;
        int end;
        //Hashtable<Integer,Integer> table = new Hashtable<Integer, Integer>();
        List<List<Integer>> result =new ArrayList<List<Integer>>();
        for (int j=0; j<nums.length-3; j++){
            System.out.println("j is "+j);
            if (j > 0 && nums[j] == nums[j-1]) continue;
            for (int i=j+1;i<nums.length-2;i++){
                System.out.println("i is "+i);
                start=i+1;
                System.out.println("start is "+start);
                end=nums.length-1;
                System.out.println("end is "+end);
                if (i > 0 && nums[i] == nums[i-1]) continue;
                while (start<end){
                    if ((nums[j]+nums[i]+nums[start]+nums[end]) == target){
                        System.out.println(nums[j]+" "+nums[i]+" "+ nums[start]+" "+nums[end]);
                        List<Integer> current = new ArrayList<Integer>();
                        current.add(nums[j]);
                        current.add(nums[i]);
                        current.add(nums[start]);
                        current.add(nums[end]);
                        result.add(current);
                        while (start < end && nums[start] == nums[start+1]) start++;  
                        while (start < end && nums[end] == nums[end-1]) end--;  
                        start++;  
                        end--;
                    }
                    else if ((nums[j]+nums[i]+nums[start]+nums[end]) > target){
                        end--;
                    }else{
                        start++;
                    }
                }
            }
        }
        return result;
    }
}
class FourSum{
    public static void main(String[] args) {
        int[] nums= {0,0,0,0};
        List<List<Integer>> result = Solution.fourSum(nums,0);
        for (int i=0 ; i< result.size(); i++){
            for (int j=0; j< result.get(i).size();j++){
                System.out.print(result.get(i).get(j));
            }
            System.out.println();
        }
    }
}