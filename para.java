public class para {
	public void change(int` variable){
		variable++;
		return ;
	}
	public void change2(int[] variable){
		variable[0]+=1;
		return ;
	}
	public static void main(String[] args) {
		para result = new para();
		int a =3;
		result.change(a);
		System.out.println(a);
		int[] b = new int[1];
		b[0]=3;
		result.change2(b);
		System.out.println(b[0]);
	}
}