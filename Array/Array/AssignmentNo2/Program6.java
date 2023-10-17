

class Demo{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,3,3,2,2};

		for(int i=0;i<arr.length;i++){
		
			int sumL =0;
			int sumR =0;
			for(int j=0;j<i;j++){
			
				sumL = sumL + arr[j];
			}
			for(int j=i+1;j<arr.length;j++){
			
				sumR = sumR + arr[j];
			}
			if(sumL==sumR){
			
				System.out.println(arr[i]);
			}
		}
		
	}
}




















