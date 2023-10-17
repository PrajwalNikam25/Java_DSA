

//Print MaxSum Of SubArray:

class Demo{

	public static void main(String[] a){
	
		int arr[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};
	
		int max = Integer.MIN_VALUE;

		int sum =0;

		for(int i=0;i<arr.length;i++){

			for(int j=i;j<arr.length;j++){
		
		       		sum = 0;
			
				for(int k=i;k<=j;k++){
				
					sum = sum + arr[k];
				if(sum > max){
				
					max = sum;
				}
			}
		}
	}
	System.out.println(max);
	}
}
