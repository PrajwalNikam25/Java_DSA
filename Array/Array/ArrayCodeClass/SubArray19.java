

// PrifixSum:
//

class Demo{

	public static void main(String[] a){
	
		int arr[] = new int[]{2,4,1,3};

		int prifixSum[] = new int[arr.length];

		prifixSum[0] = arr[0];

		for(int i=1;i<arr.length;i++){
		
			prifixSum[i] = prifixSum[i-1] + arr[i];
		}
		for(int i=0;i<arr.length;i++){
		
			for(int j=i;j<arr.length;j++){
			
				int sum = 0;

				if(i==0){
				
					sum = prifixSum[j];
				}else{
				
					sum= prifixSum[j]-prifixSum[i-1];
				}
				System.out.println(sum);
			}
		}
	}}
