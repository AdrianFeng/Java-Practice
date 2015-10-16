 class Solution {
    static String longestCommonPrefix(String[] strs) {
        if (strs.length==0){
            return "";
        }
        String temp;
        String sum="";
        outer:
        for (int i =0;; i++){
            if (i==strs[0].length()){
                break outer;
            }
            temp=strs[0].substring(i,i+1);
	    System.out.println("temp is "+ temp);
            inner:
            for (int j =0; j < strs.length;j++){
                if (strs[j].length() == i){
                    break outer;
                }
		System.out.println("strs["+j+"].substring("+i+","+(i+1)+" is "+strs[j].substring(i,i+1));
                if (strs[j].substring(i,i+1).equals(temp)){
		    System.out.println("equal");
                    continue inner;
                }
                else{
		    System.out.println("not equal");
                    break outer;
                }
            }
	    System.out.println("temp is here"+ temp);
	    sum+=temp;
	    System.out.println("sum is "+ sum);
        }
	return sum;
    }
}
class Largestcommonprefix{
    public static void main(String[] args ){
	String[] newone ={"abcppcd","abcdef", "abclio","abcpilo"};
	System.out.println(Solution.longestCommonPrefix(newone));
    }
}