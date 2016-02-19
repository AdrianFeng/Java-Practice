public class LongestPlaindromicSubstring {
    /*O(N^2) Space O(N^2)
    public String longestPalindrome(String s) {
     // brutal force
     // for ( i in range (0, length(str))){
     //   for ( j in range (i, length(str)))
     //        Is_Palindromic(i,j)
     // so the is O(N^3) is bad
     // second algorithm dynamic set
     int start=0;
     int maxlength=0;
     boolean[][] table = new boolean[1000][1000];
     // first we define table[i][j] = true it means that s.substring(i,j+1) is a result
     // then we first define all table[i][i] is a Pali... and set that element is ture
     // then we define all adjacent two true if the are the same character
     for (int index =0 ; index < s.length() ; index++){
        table[index][index] =true;
        maxlength=1;
        start=index;
     }
     for (int index =0; index < s.length()-1; index++){
         if (s.charAt(index)== s.charAt(index+1)){
             table[index][index+1]=true;
             maxlength=2;
             start =index;
         }
     }
     // since we all find and define  all the basic suitable substring(lenth is one or two) that will create a longer  Palindromic Substring. Then we start the length at three and iterate until the it reaches the string length. 然后我们检测每个长度为length的substring首尾两个 index所包含的character，看他们是否相等同时里面所有对称的index上的element也是相等的（表现为table[index][ index+len-2] 为true，因为我们是从length = 3 循环上来的，所以只要检测最近的内对衬即可），如果这两个都满足，我们也把table[index][index+len-1] = true 同时maxlength更新同时记录此时最新substring的首index！
     for (int len =3; len<=s.length();len++){
         for (int index =0 ; index < (s.length() -len +1); index++){
             if (s.charAt(index) == s.charAt(index +len-1) && table[index+1 ][index+len-2] == true){
                 table[index][index+len-1] = true;
                 maxlength=len;
                 start =index;
             }
         }
     }
     return s.substring(start, start+maxlength);
    }*/
    // Solution 2 O(N^2) constant Space
    /*public String longestPalindrome(String s) {
        if (s.length() == 1){
            return s;
        }
        char[] charArray = s.toCharArray();
        String maxString="";
        for (int i = 0; i<s.length()-1; i++){
            String temp1 = findTheLongest(charArray, i,i);
            String temp2 = findTheLongest(charArray, i,i+1);
            maxString = (temp1.length()>maxString.length())?temp1:maxString;
            maxString = (temp2.length()>maxString.length())?temp2:maxString;
        }
        return maxString;
        
    }
    public String findTheLongest(char[] charArray, int firstIndex, int secondIndex){
        while (firstIndex>=0 && secondIndex< charArray.length){
            if(charArray[firstIndex] != charArray[secondIndex]){
                break;
            }
            firstIndex--;secondIndex++;
        }
        firstIndex++;secondIndex--;
        return new String(charArray, firstIndex, (secondIndex-firstIndex+1));
    }*/
    
    /* Solution 3 O(N) space O(N)*/
    //详见链接http://www.cnblogs.com/bitzhuwei/p/Longest-Palindromic-Substring-Part-II.html
    public String longestPalindrome(String s){
       char[] currentArray= processString(s).toCharArray();
       int center=0;
       //int left =0;
       int right=0;
       int maxIndex=0;;
       int[] lengthAtIndex = new int[currentArray.length];
       for (int i =0 ; i< currentArray.length; i++){
           int mirror = center - (i-center);
           if (mirror >= 0 && lengthAtIndex[mirror]<(right -i)  ){
               lengthAtIndex[i]=lengthAtIndex[mirror];
           }
           else{
               lengthAtIndex[i]=findTheMirrorLength(currentArray,i,right -i);
               center= i;
               right =i+lengthAtIndex[i];
           }
       }
       for (int i =0; i<lengthAtIndex.length;i++){
           if (lengthAtIndex[i] > lengthAtIndex[maxIndex]) maxIndex = i;
       }
       //System.out.println(maxIndex);
       int determin = (maxIndex-lengthAtIndex[maxIndex]);
       int startIndex = (determin%2==0 )? (determin/2) : (determin-1)/2;
       return s.substring(startIndex,startIndex+lengthAtIndex[maxIndex]);
    
    }
    public String processString(String s){
        StringBuilder store = new StringBuilder(s);
        for (int i = 0; i<store.length() ; i+=2){
            store.insert(i,'#');
        }
        store.append('#');
        return store.toString();
    }
    public int findTheMirrorLength(char[] Array, int index, int already){
        int left = index-already-1;
        int right = index + already+1;
        int count =already;
        while(left >= 0 && right < Array.length){
            if(Array[left] != Array[right]){
                break;
            }
            count++;
            left--;right++;
        }
        return count;
    }
     
}