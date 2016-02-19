public class GasStation{
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // greedy approach, let's put it in this way got through the list 
        // and get an array of ( gas[i] -cost[i] ) then go through the new list 
        // again and use sum to record the sum of each element of the new list 
        // and if the sum at index i is negative it means that from 0 to i there 
        // will be no answer for this problem since starting every station between 0 
        // and i will  run out oil definitely at i then we reset sum to 0 and calculate
        // the sum from i+1 and set start at i+1 and if again we find sum is negative,
        // we reset sum and set start again at that index and redo sum. finally return 
        // the index that start hold. we have to check total gas we have and total 
        // gas we use and check if the answer always possible.
        int total =0; int sum=0; int start=0;
        for (int i=0; i<gas.length; i++){
            total += gas[i]-cost[i];
            sum+=gas[i]-cost[i];
            if (sum <0){
                start = i+1; sum =0;
            }
        }
        if (start== gas.length ){
            start =0;
        }
        return (total >=0)? start:-1;
    }
}