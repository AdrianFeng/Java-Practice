import java.util.*;
class lengthoflastword{
    public static int lengthOfLastWord(String s){
	if (s == null || s.length() == 0){
	    return 0;
	}
	int count =0;
	int check =0;
	String k =new StringBuilder(s).reverse().toString();
	System.out.println(k);
	for (int index =0 ; index < k.length(); index++){
	    if (k.charAt(index) !=' '){
		count++;
		if (check ==0){
		    check ++;
		}
	    }
	    else{
		if ( check == 1){
		    break;
		}
	    }
	}
	
	return count;
    }
}
class Solution5{
    public static void main(String[] args) {
	int a = lengthoflastword.lengthOfLastWord("  sdaHello   Worlddasd   dsdfgfg 1231231    ad   sddddd  aaaaf" );
	System.out.println(a);
    }
}