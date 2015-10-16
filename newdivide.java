class division {
    public static int divide( int num, int lower ){
	int sum = 0;
	while (num > lower) {
	    sum = (num >> 2) + sum;
	    num = (num >> 2) + (num & lower);
	}
	if (num == lower)
	    sum = sum + 1;
	return sum; 
    }
}
class Solutionnow {
    public static void main ( String[] args){
	System.out.println(division.divide(70,5));
    }
}