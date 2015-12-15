import java.io.*;
import java.util.*;
class indexTagComp implements Comparator<indextag>{
	//@override 
	public int compare(indextag a, indextag b){
		if (a.index < b.index) return -1;
		else if (a.index> b.index) return 1;
		else return 0;
	}
}
class indextag{
	public int index;
	public int value;
	indextag(int a , int b){
		index=a;
		value=b;
	}
}
// ok so basic algorithm we combine the each operation at first which means we assume there is balance variable that contains
// the net operation value that should be add upon the value at the current index so we actually change complexity from O(n*m)
// to O(m+n) m is number opreation and n is number of elements in array and plus we have sort that operation to make sure 
// the operation that start from the earlier index can be done earlier. So plus the O(mlogm) the overall complexity is 
// O(mlogm + n) better then O (mn)
public class ListMax {
	public int run () throws IOException{
		Scanner in = new Scanner(new File("ListMaxtest.txt"));
		int length = Integer.parseInt(in.next());
		int numOfOperation= Integer.parseInt(in.next());
		int[] array= new int[length];
		Comparator<indextag> comparator = new indexTagComp();
		PriorityQueue<indextag> startIndex = new PriorityQueue<indextag>(10,comparator);
		PriorityQueue<indextag> endIndex = new PriorityQueue<indextag>(10,comparator);
		for (int i =0 ; i< numOfOperation; i++){
			int start = Integer.parseInt(in.next())-1;
			int end =Integer.parseInt(in.next())-1;
			int value =Integer.parseInt(in.next());
			System.out.print(" start is " + start + "end is " + end + " value is "+ value);
			System.out.println();
			startIndex.offer(new indextag(start, value));
			endIndex.offer( new indextag(end, value));
		}
		int balance = 0;
		int maxVal=Integer.MIN_VALUE;
		for (int i =0 ; i<length;){
			indextag begin = startIndex.peek();
			if (begin!=null && i==begin.index){
				balance+=begin.value;
				System.out.println(balance);
				startIndex.poll();
				continue;
			}
			if (balance>maxVal) maxVal=balance;
			indextag close = endIndex.peek();
			if (close != null && i == close.index){
				balance-=close.value;
				System.out.println(balance);
				endIndex.poll();
				continue;
			}
			i++;
		}
		return maxVal;

	}
	public static void main(String[] args) throws IOException{
		ListMax result = new ListMax();
		System.out.println(result.run());
	}
}