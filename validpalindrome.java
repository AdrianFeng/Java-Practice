//import java.lang.*;

/**
 * @author Zhen Feng
 * @version v1.0
 */
class validpalinfrome{
    public static void main (String[] args){
	if (isPalindrome(args[0]))
	    {
		System.out.println( "True");
	    }
	else{
	    System.out.println("False");
	}
    }
    public static  boolean isPalindrome(String s) {
	int start,end;
	    boolean check;
	    if (s.length() == 0){
		return true;
	    }
	    else
	    {
		check =true;
		start = 0;
		end = s.length() -1;
		System.out.println("end begin"+end);
		while (end >= start){
		    if (!Character.isLetterOrDigit(s.charAt(start)))
			{
			    System.out.println("check start"+start);
			    start++;
			    continue;
			}
		    if (!Character.isLetterOrDigit(s.charAt(end)))
			{
			    System.out.println("check end"+end);
			    end--;
			    continue;
			}
		    if (Character.toLowerCase(s.charAt(start))==Character.toLowerCase(s.charAt(end)))
			{
			    System.out.println("compare");
			    start++;
			    end--;
			    continue;
			}
		    else
			{
			    check = false;
			    break;
			}
		}
		return check;
	    }
    }
}