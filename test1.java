import java.util.*;
class Solution {
    static void rotate(int[] nums, int k) {
        if (k==0){
            return;
        }
        /*int[] result =new int[nums.length];
        for (int i=0;i<nums.length;i++){
            result[(i+k)%(nums.length)]=nums[i];
        }
	for (int i =0;i<result.length;i++){
	*/
	boolean check =false;
        int count=0;
        while (gcd(nums.length,k)!=1 && k !=1 ){
            k--;
            count++;
            check=true;
        }
	int nextindex=0;
        int temp;
        int previous=nums[nextindex];
        for (int i=0;i<nums.length;i++){
            temp=nums[(nextindex+k)%(nums.length)];
            nums[(nextindex+k)%(nums.length)]=previous;
            nextindex=(nextindex+k)%(nums.length);
            previous=temp;
	    for (int in=0;in<nums.length;in++){
		System.out.print(nums[in]+" ");
	    }
	    System.out.println();
        }
	if (check){
	    rotate(nums,count);
	}
    }
    static int  gcd(int a ,int b){
    if(b == 0)
        {
            return a;
	}
    return gcd(b,a % b);
    }
}
class test1 {
    public static void main(String[] args){
	/*Integer a = 9;
	Integer b = 9;
	if(a==b){
	    System.out.println("Integer equal when value are equal");
	}
	String c= "nihao";
	String d = "nihao";
	if(c==d){
            System.out.println("String equal when value are equal");
        }
	Character e ='a';
	Character f='a';
	if(e==f){
            System.out.println("Character equal when value are equal");
        }
	Hashtable<Character,Character> newone = new Hashtable<Character, Character>();
	newone.put(e,'A');
	if (newone.containsKey(f)){
	    System.out.println("TRUE");
	}
	else{
	    System.out.println("False");
	}
	System.out.println(newone.get(f));*/
	int[] nums={1,2,3,4,5,6,7,8,9,10,11,12};
	Solution.rotate(nums,9);
	for (int i=0;i<nums.length;i++){
	    System.out.print(nums[i]+" ");
	}
	System.out.println();
	//System.out.println(Solution.gcd(33,9));
    }
}