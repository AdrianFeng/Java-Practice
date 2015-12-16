public class reverseString {
    public void reverse(StringBuilder result, int start, int end){ // end is not included
        for (int i=start, j= end-1; i<j; i++, j--){
            char temp = result.charAt(j);
            result.setCharAt(j,result.charAt(i));
            result.setCharAt(i,temp);
        }
    }
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder(s);
        if (s.length()==0){
            return s;
        }
        this.reverse(result, 0, s.length());
        int start =0;
        int end=0;
        while(start<result.length() && result.charAt(start) == ' ' ){
            start++;
        }
        result.delete(0,start);
        start=0;
        end=start;
        while (start<result.length() && end <result.length()){
            if (result.charAt(start)==' ' && result.charAt(end) !=' '){
                result.replace(start,end, " ");
                start++;
                end=start;
            }
            else if (result.charAt(start)!=' ' && (end == result.length()-1 ||result.charAt(end)==' ' )){
                if (result.charAt(end)!=' ') end++;
                this.reverse(result, start, end);
                start=end;
            }
            else if ((result.charAt(start)!=' ' && result.charAt(end)!=' ') || (result.charAt(start)==' ' && result.charAt(end) ==' ')){
                end++;
            }
        }
        end=result.length()-1;
        while(end>=0 && result.charAt(end)==' '){
            end--;
        }
        return result.substring(0,end+1);
    }
    public static void main(String[] args) {
        String a = "   a   b  c d   e  ";
        reverseString result = new reverseString();
        System.out.println(result.reverseWords(a)+"|");
    }
}