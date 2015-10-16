import java.util.*;
class Solution{
    static int lengthOfLongestSubstring(String s) {
	Hashtable<Character, Integer> table = new Hashtable<Character, Integer>();
        int maxlength=0;
        int startindex=0;
        int endindex=0;
        for (int i =0 ; i< s.length(); i++){
            if (!table.containsKey(s.charAt(i)) || table.get(s.charAt(i))< startindex){
                table.put(s.charAt(i), i);
                endindex++;
            }
            else{
                if (maxlength<(endindex-startindex)){
                    maxlength=(endindex - startindex);
		    System.out.println("max is " + maxlength);
                }
                //i=table.get(s.charAt(i))+1;
                startindex=table.get(s.charAt(i))+1;
                System.out.println(startindex);
                endindex++;
            }
        }
        return maxlength;
    }
}
public class LongestSubstring{

    public static void main(String []args){
        System.out.println(Solution.lengthOfLongestSubstring("a"));
    }
}