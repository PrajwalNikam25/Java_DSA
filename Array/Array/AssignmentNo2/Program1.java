



class Demo{

	public static void main(String[] a){
	
		int arr[] = new int[]{2,6,8,1,4};

		int min = Integer.MAX_VALUE;

	
		for(int i=0;i<arr.length;i++){
		
			if(min>arr[i]){
			
				min=arr[i];
			}
		}
		int temp = min;
		for(int j=0;j<arr.length;j++){
			
			int sum =0;

			for(int k=j;k<arr.length;k++){
			
				sum = sum + arr[k];

				if(sum < min){
				
					min = sum;
				}
			}
		}
		if(min==Integer.MAX_VALUE){
		
			System.out.println(temp);
		}else{
		
			System.out.println(min);
		}

	}
}
