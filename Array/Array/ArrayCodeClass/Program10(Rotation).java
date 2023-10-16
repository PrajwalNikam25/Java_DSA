

class Client{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,2,3,4,5,6};

		int q = 3;

		int n = arr.length;

		int r = q%n;

		for(int i=0;i<r;i++){
		
			int temp = arr[n-1];

			for(int j=arr.length-1;j>=1;j--){
			
				arr[j] = arr[j-1];
			}
			arr[0] = temp;
		}
		for(int i=0;i<arr.length;i++){
		
			System.out.println(arr[i]);
		}
	}
}
