class SQRT{
    public static int mySqrt(int x) {
        long a =0;
        long b=x/2+1;
        long temp1=0;
        long temp2 =0;
        while (a<=b){
            temp1=(a+b)/2;
            temp2=temp1*temp1;
            if (temp2 == x ){
                break;
            }
            if (temp2 <x){
                a=a+1;
            }
            if (temp2>x){
                b=b-1;
            }
        }
        return (int)temp1;
    }
}
class sqrtresult{
    public static void main(String[] args){
	System.out.println(SQRT.mySqrt(2147395599));
    }
}