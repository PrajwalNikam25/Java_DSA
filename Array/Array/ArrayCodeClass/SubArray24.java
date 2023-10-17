
// Max Sum of subArray In O(N^2):

class Demo{

	public static void main(String[] a){
	
		int arr[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};
		 
		int max = Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++){
		
			int sum =0;
		
			for(int j=i;j<arr.length;j++){
			
				sum = sum + arr[j];

				if(sum>max){
				
					max = sum;
				}
			}
		}
		System.out.println(max);
	}
}
