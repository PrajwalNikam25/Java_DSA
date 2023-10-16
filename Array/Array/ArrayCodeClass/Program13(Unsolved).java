
// CarryForward :
// RightMax:


class Client{

	public static void main(String[] a){
	
		int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};

		int n= arr.length;

		int arr2[] = new int[n];

		arr2[n-1] = arr[n-1];

		for(int i=n-2;i>=0;i--){
		
			int max = Integer.MAX_VALUE;
			
			if(arr[i]>arr[i+1]){
			
				max = arr[i];
			}

			arr2[i] = max;
		}
		for(int i=0;i<arr.length;i++){
		
			System.out.println(arr[i]);
		}
	}
}
