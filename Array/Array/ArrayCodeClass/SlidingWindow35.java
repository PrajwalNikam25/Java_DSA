

class Demo{

	public static void main(String[] a){
	
		int K=4;

		int arr[] = new int[]{1,2,3,4,5,6};

		int end = K-1;

		int start =0;

		int max = Integer.MIN_VALUE;

		while(end<arr.length){
		
			int sum =0;

			for(int i=start;i<=end;i++){
			
				sum = sum + arr[i];
			}
			if(sum > max){
			
				max = sum;
			}
			start++;
			end++;
		}
		System.out.println(max);
	}
}
