

class Demo{

	public static void main(String[] a){
	
		int start = 0;
		int end = 0;
		int sum=0;
		int x =0;

		int max = Integer.MIN_VALUE;

		int arr[] = new int[]{1,-2,-5,3,4,5};

		for(int i=0;i<arr.length;i++){
		
			if(sum == 0){
			
				x = i;
			}
			sum = sum + arr[i];

			if(sum > max){
			
				max = sum;
				start = x;
				end = i;
			}
			if(sum < 0){
			
				sum =0;
			}
		}
		for(int i= start; i<=end ; i++){
		
			System.out.println(arr[i]);
		}
	}
}
