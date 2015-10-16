class pointer {
    public static void main (String[] args){
	int[] a = {37};
	int[] b = a;
	int c =63;
	int d = 55;
	b[0] =99;
	System.out.println(" now the value is " + a[0]);
	System.out.println(" ______________________");
	System.out.println(" now c value is " + c);
	System.out.println(" now d value is " + d);
	switchvalue(c, d);
	System.out.println( " after switching");
	System.out.println(" now c value is " + c);
	System.out.println(" now d value is " + d);
    }
    private static void switchvalue (int a, int b){
	int temp = a ;
	a=b;
	b=temp;
    }
}