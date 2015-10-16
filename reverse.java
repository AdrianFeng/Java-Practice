import java.util.Scanner;
class reverse {
    public static void main (String[] args ){
	int[] arr = new int[5];
	int i =0;
	System.out.println("please enter 5 number !");
	Scanner sc = new Scanner(System.in);
	for (i =0 ; i<5; i++){
	    arr[i] = sc.nextInt();
	}
	/*for (i =0 ; i < arr.length/2 ; i ++){
	    arr[i]= arr[i] ^ arr[arr.length-1-i];
	    arr[arr.length-1-i] = arr[i] ^ arr[arr.length-1-i];
	    arr[i]= arr[i] ^ arr[arr.length-1-i];
	    }*/
	reverseorder(arr);
	for (i =0 ; i<arr.length ; i++){
	    System.out.println(arr[i]);
	}
	int [] arr2 = new int[] {35,67};
	System.out.println("_____________________");
	changevalue(arr2);
	for (i =0 ; i<arr2.length ; i++){
            System.out.println(arr2[i]);
        }
	int [] arr3 = new int[] {35,67};
	System.out.println("_____________________");
        change(arr3[0], arr3[1]);
        for (i =0 ; i<arr3.length ; i++){
            System.out.println(arr3[i]);
        }
    }
    
    public static void reverseorder(int[] arr ){
	for (int i =0 ; i < arr.length/2 ; i ++){
            arr[i]= arr[i] ^ arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i] ^ arr[arr.length-1-i];
            arr[i]= arr[i] ^ arr[arr.length-1-i];
        }
    }
    public static void changevalue(int[] arr){
	for (int i =0 ; i < arr.length ; i ++){
	    arr[i] =1;
	}
    }
    public static void change( int x, int y){
	x = 1;y=1;
    }

}
