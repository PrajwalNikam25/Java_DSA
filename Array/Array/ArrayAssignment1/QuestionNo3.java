



class Client{

	public static void main(String[] a){
	
		int arr[] = new int[]{2,4,1,3,2};

		int max = Integer.MIN_VALUE;

		int count=0;

		for(int i=0;i<arr.length;i++){
		
			if(arr[i]>max){
			
				max=arr[i];
			}
		}

		for(int i=0;i<arr.length;i++){
		
			count = count + max-arr[i];
		}
		System.out.println(count);
	}
}
