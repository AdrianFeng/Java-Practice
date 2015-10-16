import java.util.Scanner;
class triangle{
    public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("please input the line your want to print");
	int line = sc.nextInt();
	if (line <=0){
	    System.out.println("illeagl input !");
	    System.exit(-1);
	}
	else if (line ==1){
	    System.out.println("1");
	    System.exit(0);
	}
	int [][]array = new int[line][];
	int p =line -1;
	for (int i = 0 ; i< array.length ; i++){
	    array[i]= new int[i+1];
	    array[i][0] = array[i][i]=1;
	    for (int b =1, c = array[i].length -2; b < (array[i].length+1)/2; b++,c--){
		array[i][b] = array[i][c] =array[i-1][b]+array[i-1][b-1];
	    }
	    for ( int m = 0; m < p; m++){
		System.out.print(" ");
	    }
	    for ( int d =0 ; d<  array[i].length; d++){
		System.out.print(array[i][d] + " ");
	    }
	    System.out.println();
	    p--;
	}
    }
}