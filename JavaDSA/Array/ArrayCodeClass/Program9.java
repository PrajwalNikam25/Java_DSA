


class Client{

	public static void main(String[] a){
	
		int arr[] = new int[]{1,2,3,4,5,6};
		
		int arr2[] = new int[arr.length];

		int num = 0;
		for(int i=arr.length-1;i>=0;i--){
		
			arr2[num] = arr[i];

			num++;
		}
		for(int i=0;i<arr.length;i++){
		
			System.out.println(arr2[i]);
		}


	}
}
