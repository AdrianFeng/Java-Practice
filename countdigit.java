/*class Solution {  
    public static int countDigitOne(int n) {  
        int ones = 0;  
        for (long m = 1; m <= n; m *= 10) {  
            long a = n/m, b = n%m;  
            ones += (a + 8) / 10 * m ;  
            if(a % 10 == 1) ones += b + 1;  
        }  
        return ones;  
    }  
    } */
import java.util.*;
 class Solution {
    //algorithm : first just consider some exception 
    // since we do this in abs value so we use long to hold int value
    // Basicallly,we just first get the quotient, for the digit after the point, we just use the curresponding reminder times
    // 10 and then divided by the denominator again and get the corresponding quotient, this quotient is the digit.
    // for ex. 3/7  
    // 3/7 =0...4 0.
    // 4*10/7=5...5
    public static String fractionToDecimal(int numerator, int denominator) {
        if (denominator == 0){
            return "";
        }
        if (numerator == 0 ){
            return "0";
        }
        String result="";
        long num = numerator;
        long den = denominator;
        int sign = checksign(numerator)*checksign(denominator);
        if (sign == -1){
            result += "-";
        }
        long numcal=Math.abs(num);
        long dencal = Math.abs(den);
        result+=String.valueOf(numcal/dencal);
        long reminder = (numcal%dencal)*10;
        if (reminder == 0){ return result; }
        Hashtable<Long, Integer> table = new Hashtable<Long, Integer>(); 
        result+=".";
        int start; 
        while (true){
            if (reminder == 0){ break;}
            if ( table.get(reminder) == null){
                table.put(reminder,result.length());
                num = reminder/dencal;
                result+=String.valueOf(num);
                reminder=(reminder%dencal)*10;
            }    
            else{
                start=table.get(reminder);
                String front= result.substring(0,start);
                String back = result.substring(start,(result.length()));
                result = front +"("+back+")";
                return result;
            }
        }
        return result;
    }
    public static int checksign(int a){
        if ( a>=0){
            return 1;
        }
        else {
            return -1;
        }
    }
}
class CountDigit{
    public static void main (String[] args){
	int newone =92;
	//System.out.println(Solution.countDigitOne(20));
	String s = "Hello world";
	String s1 = s.substring(0,4);
	System.out.println(Solution.fractionToDecimal(3,7));
    }
}