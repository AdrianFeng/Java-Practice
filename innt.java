import java.util.*;
class innt {
    public static void main(String[] args){
	Queue<Integer> newone=new LinkedList<Integer>();
	for (int i =1; i<8;i++){
	    newone.add(i);
	}
	Integer[] i = newone.toArray(new Integer[newone.size()]);
	for(int a =0; a<i.length;a++){
	    System.out.println(i[a]);
	}
    }
}