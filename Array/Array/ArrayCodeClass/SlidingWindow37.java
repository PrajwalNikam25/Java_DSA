// SlidingWindow:


class Demo{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,2,3,4,5,6};

		int sum = 0;

		int k = 4;

		int end  = k-1;

		int max = Integer.MIN_VALUE;

		for(int i =0;i<=end;i++){
		
			sum = sum + arr[i];
		}

		int start = 1;
		end = k;

		while(end<arr.length){
		
			sum = sum-arr[start-1] + arr[end];

			if(sum > max){
			
				max = sum;
			}

			start++;
			end++;
		}
		System.out.println(max);
	}
}
