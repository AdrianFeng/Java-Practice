/**
 * Facilitates dispensing stamps for a postage stamp machine.
 * @author Zhen Feng
 * @version 1.0
 */
public class StampDispenser
{
    public int[] Choice; // local copy of the stamp values that we have 
    public int Length; // the number of all the stamp values 
    /**
     * Constructs a new StampDispenser that will be able to dispense the given 
     * types of stamps.
     *
     * @param stampDenominations The values of the types of stamps that the 
     *     machine should have.  Should be sorted in descending order and 
     *     contain at least a 1.
     * @return nothing
     */
    public StampDispenser(int[] stampDenominations)
    {   // initlize the local copy of the all stamp values we have.
	Choice=stampDenominations;
	// initlize the Length
	Length=stampDenominations.length;
    }
 
    /**
     * Returns the minimum number of stamps that the machine can dispense to
     * fill the given request.
     *
     * @param request The total value of the stamps to be dispensed.
     * @return the least number of stamps that machine should dispense.
     */
    public int calcMinNumStampsToFillRequest(int request)
    {  
	// algorithm: dynamatic programing 
	// supposed the request number is n and we have stamp value array Array
	// Also we constuct another array Result, which is that Result[i]
	// stores the the least number of stamps when request is i. Then we 
	// have Result[n] is Min(Result[n-Array[end]],Result[n-Array[end-1]],
	// Result[n-Array[end-2]],...)+1.
	// Stop at either reach Array's beginning or n-Array[i]<0 
	// Substract n from the smallest choice. 
	// That is why start at Array[end]
        int[] Result=new int[request+1];
	for (int i=1; i <=request; i++){
	    int start =Length-1;
	    int Min=Integer.MAX_VALUE;
	    int CurrentLeft= i-Choice[start];
	    while ( CurrentLeft>=0){
		Min=Math.min(Min,Result[CurrentLeft]+1);
		start--;
		if (start <0){
		    break;
		}
		CurrentLeft=i-Choice[start];
	    }
	    Result[i]=Min;
	    // System.out.println(i+" is "+Result[i]); add for checking
	}
	return Result[request];
    }
    
    public static void main(String[] args)
    {
        int[] denominations = { 90, 30, 24, 10, 6, 2, 1 };
        StampDispenser stampDispenser = new StampDispenser(denominations);
	/*int b=stampDispenser.calcMinNumStampsToFillRequest(36);
	System.out.println(b);
	int c =stampDispenser.calcMinNumStampsToFillRequest(66);
	System.out.println(c);
	int d =stampDispenser.calcMinNumStampsToFillRequest(18);
	System.out.println(d);*/
        assert stampDispenser.calcMinNumStampsToFillRequest(18) == 3;
    }
}
