public class KthLargestInArray {
    // this quick select algorithm first is partation so array should be partation into : 
    //   |____larger_than_pivot__|__store_index_value__|___radom__|__pivot_value__|
    //                              store index 
    // after partation, we reassign the store_index to the pivot_index since that is the correct 
    // position for the pivot and then return value is the pivot index
    public int partation(int[] nums, int start, int end, int pivotindex){
        int pivotvalue= nums[pivotindex];
        swap(nums, pivotindex, end);
        int storeindex= start;
        for (int i = start ; i<end ; i++){
            if (nums[i]>pivotvalue){
                swap(nums,i,storeindex);
                storeindex++;
            }
        }
        swap(nums, storeindex, end);
        return storeindex;
    }
    public int findKthLargest(int[] nums, int k) {
        return select(nums, 0, nums.length-1, k);
    }
    // since we got the correct pivot_index after partation then we know the (pivotindex+1)th largest 
    // value so if the pivotindex==k-1 then we know that value at that pivot index is what we want and 
    // if the pivotindex<=k-1, we know that we should do one more reapeat call again so go to right
    // otherwise we actually find more than what we need so we go to left 
    public int select(int[] nums, int start, int end, int k){
        if (start==end){
            return nums[start];
        }
        int pivotindex=start+(int )(Math.random()*(end - start+1));
        pivotindex= partation(nums, start, end, pivotindex);
        if (pivotindex==k-1){
            return nums[pivotindex];
        }
        else if (pivotindex< k-1){
            return select(nums, pivotindex+1,end, k );
        }
        else{
             return select(nums, start,pivotindex-1, k );
        }
    }
    public void swap (int[] nums, int begin, int end){
        int temp = nums[begin];
        nums[begin]=nums[end];
        nums[end]=temp;
    }
}