 class Solution {
    public static int divide(int dividend, int divisor) {
        if (divisor == 0){
            return java.lang.Integer.MAX_VALUE;
        }
        if (dividend ==0){
            return 0;
        }
        int absu = Math.abs(dividend);
        int initabsu = absu;
        int absd = Math.abs(divisor);
        int initabsd = absd;
        if (absu < absd){return 0;}
        int usign= checksign(absu, dividend);
        int dsign= checksign(absd, divisor);
        int reminder=0;
        int quotient = 0;
        int current_times =1;
	int check =1;
	int temp;
        while (absu>=0){
	    temp = absu;
            absu-=absd;
	    System.out.println("absDis " + absd);
	    System.out.println("absu is " + absu);
            if (absu <0){
		if ( check == 0){
		    //System.out.println("absu is " + absu);
                    break;
                }
                else{
		    absu=temp;
                    absd=initabsd;
                    current_times = 1;
		    check = 0;
                    continue;
		}
            }
            else{
                quotient+=current_times;
		System.out.println("quotient is " + quotient);
		absd+=initabsd;
		if (absd <=0){
		    absd =initabsd;
		    current_times=1;
		}
		else{
                current_times++;
		}
		check =1; 
            }
            
        }
        if (usign ==dsign ){
            return quotient;
        }
        else {
            return -quotient;
        }
    }
    public static int checksign(int abs, int real){
        if (abs == real){
            return 1;
        }
        else
	    {
		return -1;
	    }
    }
}

class divide {
    public static void main (String[] args ){
	System.out.println(Solution.divide(1100540749, -1090366779));
    }
}