// PrifixSum:
//


class Demo{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,2,3,4,5,6};

		int parr[] = new int[arr.length];
		int K = 4;
		int start = 0;
		int end = K-1;

		parr[0] = arr[0];

		for(int i=1;i<arr.length;i++){
		
			parr[i] = parr[i-1] + arr[i];
		}
		int sum =0;
		int max = Integer.MIN_VALUE;

		for(int i = start; i<=end;i++ ){
		
			if(start == 0){
			
				sum = parr[end];
			}else{
			
				sum = parr[end] - parr[start-1];
			}
			if(sum > max){
			
				max = sum;
			}
		}
		System.out.println(max);


	}
}
