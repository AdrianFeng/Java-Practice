import java.util.*;
class Solution {
    public void wallsAndGates(int[][] rooms) {
        HashMap<Integer, Integer> coords = new HashMap<Integer, Integer>();
        for (int i =0; i < rooms.length;i++){
            for (int j=0; j<rooms[0].length;j++){
                if (rooms[i][j] ==0){
                    coords.put(i,j);
                }
            }
        }
        for (Map.Entry<Integer, Integer> entry : coords.entrySet()){
	    coordinates current = new coordinates(entry.getKey(),entry.getValue());
            System.out.println( "row is "+ current.row +" " + "clon is "+current.coln);
	    Stack<coordinates> previousVisited = new Stack<coordinates>();
            previousVisited.push(current);
            while(!previousVisited.empty()){
                coordinates currentCheck= previousVisited.pop();
                coordinates temprecord;
                int row = currentCheck.row;
                int coln = currentCheck.coln;
                if (row >0 && rooms[row-1][coln]!=-1 && rooms[row][coln]+1 <rooms[row-1][coln]){
                    rooms[row-1][coln]=rooms[row][coln]+1;
                    temprecord = new coordinates(row-1, coln);
                    previousVisited.push(temprecord);
                }
                if (row < rooms.length-1  && rooms[row+1][coln]!=-1 && rooms[row][coln]+1 <rooms[row+1][coln]){
                    rooms[row+1][coln]=rooms[row][coln]+1;
                    temprecord = new coordinates(row+1, coln);
                    previousVisited.push(temprecord);
                }
                if (coln >0 && rooms[row][coln-1]!=-1 && rooms[row][coln]+1 <rooms[row][coln-1]){
                    rooms[row][coln-1]=rooms[row][coln]+1;
                    temprecord = new coordinates(row, coln-1);
                    previousVisited.push(temprecord);
                }
                if (coln <rooms[0].length-1 && rooms[row][coln+1]!=-1 && rooms[row][coln]+1 <rooms[row][coln+1]){
                    rooms[row][coln+1]=rooms[row][coln]+1;
                    temprecord = new coordinates(row, coln+1);
                    previousVisited.push(temprecord);
                }
            }
            
        }
        return ;
    }
}
class coordinates{
    public int row;
    public int coln;
    coordinates(int a , int b){
        row=a;
        coln =b;
    }
}

public class wall_gate{
    public static void main(String args[]){
	int[][] current = {{2147483647,0,2147483647,2147483647,0,2147483647,-1,2147483647}};
	Solution result = new Solution();
	result.wallsAndGates(current);
	for (int i =0 ; i< current.length; i ++){
	    for (int j =0 ; j< current[0].length; j++){
		System.out.print(current[i][j]+" ");
	    }
	    System.out.println();
	}
    }
}