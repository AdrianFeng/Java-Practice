import java.util.*;
    class Solution {
	/*public boolean compare(int a , int b , int maxlength){
	    int a_lastd = a%10;
	    int b_lastd= b%10;
	    while (String.valueOf(a).length()<maxlength && a!=0){
		//System.out.println(a);
		a= a*10+a_lastd;
		//System.out.println(a);
		//System.out.println(String.valueOf(a).length());
		//System.out.println("1");
		//System.out.println(maxlength);
	    }
	    while (String.valueOf(b).length()<maxlength && b!=0){
		b= b*10+b_lastd;
		//System.out.println("2");
		//System.out.println(maxlength);

	    }
	    if (a >= b){
		return true;
	    }
	    else {
		return false;
	    }
	    }*/
	public boolean compare(int a , int b ){
	    String m1 =Integer.toString(a) +Integer.toString(b);
	    String m2 =Integer.toString(b) + Integer.toString(a);
	    for (int index =0 ; index < m1.length();index++){
		if (m1.charAt(index) > m2.charAt(index))
		    {
			return true;
		    }
		if (m1.charAt(index) < m2.charAt(index))
		    {
			return false;
		    }
	    }
	    return true;
	}
	public String largestNumber(int[] nums) {
	    if (nums.length == 0){
		return "";
	    }
	    if (nums.length == 1){
		return Integer.toString(nums[0]);
	    }
	    String sum ="";
	    List<Integer> l = new ArrayList<Integer>();
	    int maxlength =0;	    int length;
	    for (int index =0 ; index < nums.length ; index++){
		length = String.valueOf(nums[index]).length();
		l.add(nums[index]);
		if (length > maxlength )
		    {
			maxlength= length;
		    }
		System.out.println("3");
		}
	    for (int index=0;index < nums.length; index++ ){
		System.out.print(l.get(index)+"  ");
	    }
	    System.out.println();
	    System.out.println("------------------------");
	    int max = 0;
	    int currentindex =0;
	    for (int index1 =0 ; index1 < nums.length; index1++){
		System.out.println(l.size()+"Here");
		for (int index=0;index < l.size(); index++ ){
		    System.out.print(l.get(index)+"  ");
		}
		max = 0;
		currentindex =0;
		System.out.println();
		System.out.println("------------------------");
		for (int index2 =0 ; index2 <(l.size()); index2++){
		    if (!compare(max, l.get(index2))){
			max =l.get(index2);
			System.out.println(max+"here1");
			currentindex=index2;
			System.out.println(currentindex+"here2");
		    }
		    //System.out.println("4");
		}
		l.remove(currentindex);
		sum= sum + Integer.toString(max);
		//System.out.println("5");
	    }
	    boolean checkelase= true;
	    int indexcheck =0;
	    for (int index =0 ; index < sum.length();index++){
		if (sum.charAt(index) != '0')
		    {
			checkelase = false;
			indexcheck = index;
			break;
		    }
	    }
	    if (checkelase){
		return "0";
	    }
	    else
		{
		    sum = sum.substring(indexcheck);
		}
	    return sum;
        
        
	}
    
    }
class Largest_Number {
    public static void main (String[] args ){
	int [] array = new int[]{3, 30, 34, 5, 9};
	Solution s = new Solution() ;
	String sum = s.largestNumber(array);
	System.out.println(sum);
    }
}