
import java.util.*;
class Solution {
    static public int minimumTotal(List<List<Integer>> triangle) {
        int rows=triangle.size();
        int countrow=1;
        int countcoln=0;
        List<List<Integer>> dpanswer = new ArrayList<List<Integer>>();
        dpanswer.add(triangle.get(0));
        while(countrow<rows){
            countcoln=0;
            List<Integer> current =new ArrayList<Integer>();
            while(countcoln<=countrow){
                int min=Integer.MAX_VALUE;
                if (countcoln-1>=0){
                    min=Math.min(min, dpanswer.get(countrow-1).get(countcoln-1));
                }
                if (countcoln<countrow){
                    min=Math.min(min, dpanswer.get(countrow-1).get(countcoln));
                }
                current.add(triangle.get(countrow).get(countcoln)+min);
                countcoln++;
            }
            dpanswer.add(current);
            countrow++;
        }
        int i=0;
        int min=Integer.MAX_VALUE;
        while(i<countrow){
            min=Math.min(dpanswer.get(countrow-1).get(i),min);
        }
        return min;
    }
}
class ShortestPath{
    public static void main(String[] args) {
        
    }
}