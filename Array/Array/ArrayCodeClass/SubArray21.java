
// Total of all subarray:
//


class Demo{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,2,3,4,5,6};

		int total = 0;
		 
		for(int i=0;i<arr.length;i++){
			
			int sum = 0;
		
			for(int j=i;j<arr.length;j++){
			
				sum = sum + arr[j];
				
				total = total + sum;
			}
		}
		System.out.println(total);
	}
}
