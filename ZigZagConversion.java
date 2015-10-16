import java.lang.*;
class ZigZagConversion{
    public static void main (String[] args ){
	String s =args[0];
	int numRows =1;
	int start =0;
        String result="";
        if (s.length() == 0){
            System.out.println("");
        }
        else{
            while ((numRows >0 ) &&(start < s.length())){
                if(s.charAt(start) == '\n'){
                    numRows -- ;
                    continue;
                }
                if (Character.isLetterOrDigit(s.charAt(start))){
                    result+=s.charAt(start);
                    start++;
                }
                else{
                    start++;
                }
            }
            System.out.println(result);
        }
    }
}