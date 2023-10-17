

// Print maxSum Of SumbArray By PrifixSum:
//


class Demo{

	public static void main(String[] a){
	
		int arr[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};

		int parr[] = new int[arr.length];

		parr[0] = parr[0];

		int sum =0 ;

		int max = Integer.MIN_VALUE;

		for(int i=1;i<arr.length;i++){
		
			parr[i] = parr[i-1] + arr[i];
		}
		for(int i=0;i<arr.length;i++){
		
			for(int j=i;j<arr.length;j++){
			
				if(i==0){
				
					sum = parr[j];
				}else{
				
					sum = parr[j]-parr[i-1];
				}
				if(sum > max){
				
					max = sum;
				}
			}
		}
		System.out.println(max);
	}
} 
