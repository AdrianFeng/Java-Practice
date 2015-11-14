class merge{
	static void mergesort(int[] nums ,int start, int mid, int end){
		int length= end -start +1;
		int first = start;
		int second= mid +1;
		int[] temp= new int[length];
		int i=0;
		while(first<=mid && second<=end){
			if (nums[first]<=nums[second]){
				temp[i]=nums[first];
				i++;first++;
			}
			else {
				temp[i]=nums[second];
				i++;second++;
			}
		}
		for (int a=first; a<=mid;a++,i++){
			temp[i]=nums[a];
		}
		for (int a=second; a<=end;a++,i++){
			temp[i]=nums[a];
		}
		for (int b=0;b<length;b++,start++){
			nums[start]=temp[b];
		}
	}
	static void merge (int[] nums, int start , int end ){
		if (start<end){
			int mid =(start+end)/2;
			merge(nums, start,mid);
			merge(nums,mid+1,end);
			mergesort(nums, start,mid,end);
		}
	}

}

class mergesort{
	public static void main(String[] args) {
		int[] result ={13,5,6,22,87,1,2,90,5,33,56,12,35,11,5,7,9,101,67,2015,33};
		merge.merge(result,0,result.length-1);
		for (int i=0;i< result.length;i++){
			System.out.print(result[i]+" ");
		}
		System.out.println();
	}
}