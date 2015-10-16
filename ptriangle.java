import java.util.*;
class Solution {
    /*static  List<List<Integer>> generate(int numRows) {
	 List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (numRows == 0){
            return result;
        }
        List<Integer> temp= new ArrayList<Integer>();
        List<Integer> previous = temp;
        temp.add(1);
        result.add(temp);
        if (numRows==1){
            return result;
        }
        numRows=numRows-1;
        while (numRows>0){
            temp=new ArrayList<Integer>();
            temp.add(1);
            for(int i=0;i<previous.size()-1;i++){
                temp.add(previous.get(i)+previous.get(i+1));
            }
            temp.add(1);
            result.add(temp);
            previous=temp;
            numRows--;
        }
        return result;
	}*/
    static  List<Integer> getRow(int rowIndex) {
        rowIndex++;
	List<Integer> temp= new ArrayList<Integer>();
        if (rowIndex == 0){
            return temp;
        }
        temp.add(1);
        List<Integer> previous = temp;
        if (rowIndex==1){
            return temp;
        }
        rowIndex=rowIndex-1;
        while (rowIndex>0){
            temp=new ArrayList<Integer>();
            temp.add(1);
            for(int i=0;i<previous.size()-1;i++){
                temp.add(previous.get(i)+previous.get(i+1));
            }
            temp.add(1);
            previous=temp;
            rowIndex--;
        }
        return temp;
    }
}
class ptriangle{
    public static void main(String[] args){
	List<Integer> result = Solution.getRow(3);
	for(int i =0; i<result.size();i++){
	    /* for (int j=0; j<result.get(i).size();j++){
		System.out.print(result.get(i).get(j) + " ");
		}*/
	    System.out.print(result.get(i) + " ");
	    //System.out.println();
	}
    }
}