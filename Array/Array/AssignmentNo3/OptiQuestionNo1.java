


class Demo{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,2,3,7,5};

		int t=15;
		int max = Integer.MIN_VALUE;
		int sum=0;
		int start =0;
		int end = 0;
		int x =0;


		for(int i =0;i<arr.length;i++){
		
			if(sum == 0){
			
				 x = i;
			}
			sum = sum + arr[i];

			if(sum==t){
			
				start = x;
				end = i;
				break;
			}
			if(sum<0){
			
				sum = 0;
			}
		}
		for(int i=start;i<=end;i++){
		
			System.out.println(arr[i]);
		}
	}
}
