


class Demo{

	public static void main(String[] a){
	
		int arr[] = new int[]{2,5,9,4};

		int count =0;

		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++){
		
			if(arr[i]>max){
			
				max=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++){
		
			if(arr[i]==max){
			
				count++;
			}
		}
		System.out.println(arr.length-count);
	}
}
