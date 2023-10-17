


class Client{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,2,3,4,5};

		int arr1[] = new int[arr.length];

		arr1[0] = arr[0];

		for(int i=1;i<arr.length;i++){
		
			arr[i] = arr[i-1]+arr[i];

			arr1[i] = arr[i];
		}
		for(int i=0;i<arr.length;i++){
		
			System.out.println(arr1[i]);
		}
	}
}
